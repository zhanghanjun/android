angular.module('controllers')
.controller('applicationsRecordCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
  	$scope.position='编辑';
  	$(".bar.bar-stable").css("background","#ffffff");
	$(".bar.bar-stable .title").css("color","#000000");
	$(".bar.bar-stable .title").css("font-weight","bold");
	// 头部状态切换
	var flag=1;
	$scope.aa=function(){
       if(flag==1){
       	$scope.position='完成';
       	flag=0;
       }else{
       	$scope.position='编辑';
       	flag=1;
       }
	}


	
    // 设定每一行的宽度=屏幕宽度+按钮宽度
    $(".applicationsRecord_div_2").width($(".applicationsRecord_div").width() + $(".line-btn-delete").width());
    // 设定常规信息区域宽度=屏幕宽度
    $(".applicationsRecord_record").width($(".applicationsRecord_div").width());
 

    // 获取所有行，对每一行设置监听
    var lines = $(".applicationsRecord_record");
    var len = lines.length; 
    var lastX, lastXForMobile;

    // 用于记录被按下的对象
    var pressedObj;  // 当前左滑的对象
    var lastLeftObj; // 上一个左滑的对象

    // 用于记录按下的点
    var start;

    // 网页在移动端运行时的监听
    for (var i = 0; i < len; ++i) {
        lines[i].addEventListener('touchstart', function(e){
            lastXForMobile = e.changedTouches[0].pageX;
            pressedObj = this; // 记录被按下的对象 

            // 记录开始按下时的点
            var touches = event.touches[0];
            start = { 
                x: touches.pageX, // 横坐标
                y: touches.pageY  // 纵坐标
            };
        });

        lines[i].addEventListener('touchmove',function(e){
            // 计算划动过程中x和y的变化量
            var touches = event.touches[0];
            delta = {
                x: touches.pageX - start.x,
                y: touches.pageY - start.y
            };

            // 横向位移大于纵向位移，阻止纵向滚动
            if (Math.abs(delta.x) > Math.abs(delta.y)) {
                event.preventDefault();
            }
        });

        lines[i].addEventListener('touchend', function(e){
            if (lastLeftObj && pressedObj != lastLeftObj) { // 点击除当前左滑对象之外的任意其他位置
                $(lastLeftObj).animate({marginLeft:"0"}, 500); // 右滑
                lastLeftObj = null; // 清空上一个左滑的对象
            }
            var diffX = e.changedTouches[0].pageX - lastXForMobile;
            if (diffX < -150) {
                $(pressedObj).animate({marginLeft:"-24%"}, 500); // 左滑
                lastLeftObj && lastLeftObj != pressedObj && 
                    $(lastLeftObj).animate({marginLeft:"0"}, 500); // 已经左滑状态的按钮右滑
                lastLeftObj = pressedObj; // 记录上一个左滑的对象
            } else if (diffX > 150) {
              if (pressedObj == lastLeftObj) {
                $(pressedObj).animate({marginLeft:"0"}, 500); // 右滑
                lastLeftObj = null; // 清空上一个左滑的对象
              }
            }
        });
        
        /*$("#applicationsRecord_button_remove").click(function(){
　        $('#applicationsRecord_button_remove').remove();
          $('.applicationsRecord_record').remove();
        });*/
        $(".applicationsRecord_button_remove").each(function(item){
        	$(this).click(function(){
        		//alert(item);
         // $(this).remove();
          $(this).parent().parent().remove();
           
        	});
        });
       
    }


});
