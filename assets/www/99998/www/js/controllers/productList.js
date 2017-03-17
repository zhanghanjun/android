angular.module('controllers')
.controller('productListCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout,$ionicPopup,$popconfirm) {
  $scope.position='苏州';
    $(".bar-stable").show();
  $(".bar.bar-stable").css("background","#5c6bc2");
    $scope.productList_money="不限贷款金额";
    $scope.productList_time="不限贷款分期";
	 $scope.monthclick=function(){
	 		$state.go("register");
	 }

	$(".productList_list").each(
		function(){
			$(this).click(
				function(){
					 $state.go("projectdetails");
				}
				);
		}
		);
	$(".productList_head_left").click(
		function(){		 
 		$(".productList_money").show();
 		$("#productList_mask").show();
		}
		);
	$(".productList_money_child").each(
		function(){
			$(this).click(
				function(){
			     $(".productList_money").hide();
 		         $("#productList_mask").hide();
                  $scope.productList_money=this.innerText;
                  $("#productList_money").text(this.innerText);
                
 		     /*    $ionicPopup.confirm({  //confirm弹框
                template:$popconfirm.getContent("你选中了:"+this.innerText),  //弹框样式
                buttons: [
                    { text: '取消',
                        onTap: function () {  //取消事件
                        }
                    },
                    { text: '确定',
                        type: 'button-positive',  //确定事件
                        onTap: function () {
                            

                        }
                    }
                ]
            })*/

				}
				);
		}
		);
	
	$(".productList_head_right").click(
		function(){		 
 		$(".productList_time").show();
 		$("#productList_mask").show();
 		 }
		);
	
	$(".productList_time_child").each(
		function(){
			$(this).click(
				function(){
			     $(".productList_time").hide();
 		         $("#productList_mask").hide();
 		        /* $ionicPopup.confirm({  //confirm弹框
                template:$popconfirm.getContent("你选中了:"+this.innerText),  //弹框样式
                buttons: [
                    { text: '取消',
                        onTap: function () {  //取消事件
                        }
                    },
                    { text: '确定',
                        type: 'button-positive',  //确定事件
                        onTap: function () {
                            

                        }
                    }
                ]
            })*/
            $("#productList_time").text(this.innerText);
				}
				);
		}
		);
	$("#productList_mask").click(
		function(){
			$(".productList_money").hide();
 		    $("#productList_mask").hide();
 		    $(".productList_time").hide();
		}
		);
	 document.getElementById("productList_content").style.height = (screen.height -80) + "px";
   //滑动事件
	$("#productList_content").on('scroll', function () {

            var $this = $(this),
            //可见高度
                viewH = $(this).height(),
            //内容高度
                contentH = $(this).get(0).scrollHeight,
            //滚动高度
                scrollTop = $(this).scrollTop();
            //当屏幕滚动的时候，判断月份和支付方式是否隐藏，并将其隐藏
             
            
            if ($('#productList_content').scrollTop() >= 80) {
                 //当屏幕高度大于80的时候，悬浮窗显示，当小于的时候，则隐藏
                //$('#suspendtradeinfo').show();
              }
            if ($('#productList_content').scrollTop() < 80){
                 
            }

            if (scrollTop / (contentH - viewH) >= 1) {
                //到达底部100px时,加载新内容在这里加载数据..
                // return;
                //$scope.loading();
                alert("已经加载到底部了");
            }
        }); 
     


    // $scope.items= [
    //   {
    //     "id": 1,
    //     "productName": "房产贷",
    //     "productLabel": null,
    //     "saledcount": 3,
    //     "productsummary": null,
    //     "productCode": null,
    //     "supplierId": null,
    //     "supplierName": null,
    //     "mainimage": "http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg",
    //     "loan": null,
    //     "minLoan": null,
    //     "maxLoan": null,
    //     "repay": null,
    //     "minRepay": null,
    //     "maxRepay": null,
    //     "rate": null,
    //     "minRate": 0.02,
    //     "maxRate": null,
    //     "appCondition": null,
    //     "auritInstruction": null,
    //     "shelfflag": null,
    //     "shelfflagName": null,
    //     "shelftime": null,
    //     "thirdpartyUrl": null,
    //     "clickCount": null,
    //     "isFine": null,
    //     "isValid": null,
    //     "providerName": null
    //   }
    // ]


      

            // $http({
            //     method : 'GET',
            //     url : "http://develop.bokesoftware.com/MDM-QX-FINANCE/api/product/getLoanProductList",
            //     params : {"id":0
            //     }

            // }).success(function(json){
            //     console.log(json);
            //     // 回调函数
            //     if(json.data!=null){
            //         $scope.banners=json.data.banners;
            //     }
            // }).error(function(json){
            //     //处理响应失败
            //     toaster.pop('warning', null,  '服务器异常', null, 'trustedHtml');
            // }); 
        var data = {
                //"name": $scope.name,
                // "id":0
                // "productName": $scope.productName,
                // "saledcount": $scope.saledcount,
                // "minRate": $scope.minRate
            };
            window.homeservice.getLoanProductList(data,
                function (info) {
                   $scope.items=info.data.productloanentity;
                }, function (error) {
                }
            );
    $scope.goDetails=function(type,id){
   window.homeservice.start({"type":2,"id":id},function (info) {}, function (error) {});
    }

    
   
})