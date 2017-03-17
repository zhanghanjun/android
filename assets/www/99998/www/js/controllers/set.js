angular.module('controllers')
.controller('setCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	$(".bar.bar-stable").css("background","#ffffff");
	$(".bar.bar-stable .title").css("color","#000000");
	$(".bar.bar-stable .title").css("font-weight","bold");
	// switch状态切换
	var flag=1;
	$scope.set_switch_click=function(){
       if(flag==1){
       $("#set_switch").attr("src","img/public/rb-n.png");
       	flag=0;
       }else{
        $("#set_switch").attr("src","img/public/rb-h.png");
       	flag=1;
       }
	}
	//跳转修改密码
		$("#set_change_password").each(
		function(){
			$(this).click(
				function(){
					 $state.go("seek");
				}
				);
		}
		);
})