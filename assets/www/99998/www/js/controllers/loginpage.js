angular.module('controllers')
    .controller('loginpageCtrl', function ($scope, $http, $compile, $state, $BK, toaster, $timeout, $ionicPopup, $popconfirm) {
        $(".bar-stable").hide();
        $scope.loginpage_center_content = "更多";
        var begin = 0;
        var bullets = document.getElementById('position').getElementsByTagName('li');
        $(".loginpage_center1").each(
            function (item) {
                $(this).click(function () {
                    var index = $(".loginpage_center1").index(this);
                    $ionicPopup.confirm({  //confirm弹框
                        template: $popconfirm.getContent("您点击了:" + $(this).find(".loginpage_center_content").text()),  //弹框样式
                        buttons: [
                            {
                                text: '取消',
                                onTap: function () {  //取消事件
                                }
                            },
                            {
                                text: '确定',
                                type: 'button-positive',  //确定事件
                                onTap: function () {
                                    if (index == 2) {
                                        $state.go("productList");
                                    }

                                }
                            }
                        ]
                    })
                });
            }
        );
        document.getElementById("loginpage_content").style.height = (screen.height) + "px";
        //滑动事件
        $("#loginpage_content").on('scroll', function () {

            var $this = $(this),
            //可见高度
                viewH = $(this).height(),
            //内容高度
                contentH = $(this).get(0).scrollHeight,
            //滚动高度
                scrollTop = $(this).scrollTop();
            //当屏幕滚动的时候，判断月份和支付方式是否隐藏，并将其隐藏


            if ($('#loginpage_content').scrollTop() >= 80) {
                //当屏幕高度大于80的时候，悬浮窗显示，当小于的时候，则隐藏
                //$('#suspendtradeinfo').show();
            }
            if ($('#loginpage_content').scrollTop() < 80) {

            }

            if (scrollTop / (contentH - viewH) >= 1) {
                var data = {
                    "begin":begin+10
                };
                window.homeservice.getFineProductList(data,
                    function (info) {
                        if(info.errorCode==0){
                            $scope.productfineinfodto=$scope.productfineinfodto.concat(info.data.productfineinfodto);
                        }
                    }, function (error) {

                    }
                );
            }
        });
        //获取精品推荐列表
        $(function () {
            var data = {};
            window.homeservice.getHomeInfo(data,
                function (info) {
                    if(info.errorCode==0){
                        $scope.banners=info.data.banners;
                        $scope.productEntity=info.data.productEntity;
                        $scope.productfineinfodto=info.data.productfineinfodto;
                        //轮播图算法
                        window.setTimeout(function(){
                            bullets[0].className = 'cur';
                            Swipe(document.getElementById('mySwipe'), {
                                auto: 2000,
                                continuous: true,
                                disableScroll: false,
                                callback: function (pos) {
                                    var i = bullets.length;
                                    while (i--) {
                                        bullets[i].className = ' ';
                                    }
                                    bullets[pos].className = 'cur';
                                }
                            });
                        },0);
                    }
                }, function (error) {

                }
            );
        })
        $scope.go=function(a){
            $state.go(a);
        }
        $scope.goDetail=function(type,id){
            window.homeservice.start({"type":type,"id":id},function (info) {}, function (error) {});
        }


        //$http({
        //    method : 'GET',
        //    url : "http://localhost:8080/MDM-QX-FINANCE/api/home/getHomeInfo",
        //    params : {
        //    }
        //}).success(function(json){
        //    // 回调函数
        //    if(json.data!=null){
        //        $scope.banners=json.data.banners;
        //        $scope.productEntity=json.data.productEntity;
        //        $scope.productfineinfodto=json.data.productfineinfodto;
        //        window.setTimeout(function(){
        //            bullets[0].className = 'cur';
        //            Swipe(document.getElementById('mySwipe'), {
        //                auto: 2000,
        //                continuous: true,
        //                disableScroll: false,
        //                callback: function (pos) {
        //                    var i = bullets.length;
        //                    while (i--) {
        //                        bullets[i].className = ' ';
        //                    }
        //                    bullets[pos].className = 'cur';
        //                }
        //            });
        //        },10);
        //    }
        //}).error(function(json){
        //    //处理响应失败
        //    toaster.pop('warning', null,  '服务器异常', null, 'trustedHtml');
        //});
    })