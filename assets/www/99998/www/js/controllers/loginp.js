angular.module('controllers')
    .controller('loginpCtrl', function ($scope, $ionicPopup, $popconfirm, $http, $compile, $state, $BK, toaster, $timeout) {
        $(".bar-stable").hide();
        $scope.showPwd="login-eye-n";
        $scope.loginp_message="";
        $scope.imgHide=true;
        $("#phone").blur(function () {
            var phone = $('#phone').val();
            var myreg = /^1(3|4|5|7|8)\d{9}$/;
            if (!myreg.test(phone)) {
                $ionicPopup.confirm({  //confirm弹框
                    template: $popconfirm.getContent("请输入正确的手机号"),  //弹框样式
                    buttons: [
                        // { text: '取消',
                        //     onTap: function () {  //取消事件
                        //     }
                        // },
                        {
                            text: '确定',
                            type: 'button-positive',  //确定事件
                            onTap: function () {
                                console.log('确定之后');

                            }
                        }
                    ]
                })
            }
        });
        $("#loginp_log_sure").click(function () {
            if ($('#phone').val() == "" || $('#phone').val() == null || $("#password").val() == "" || $("#password").val() == null) {
                return;
            } else {
                var config = {"cellPhone": $('#phone').val(), "password": $("#password").val()};
                window.userservice.memLogin(config,
                    function (info) {
                        if(info.errorCode==0){

                        }else{
                            $scope.imgHide=false;
                            $scope.loginp_message=info.message;
                        }
                    }, function (error) {

                    });
            }
        });
        //跳转到注册页面
        $scope.reg = function () {
            window.userservice.goToRegist({},function (info) {}, function (error) {});
        }

        //忘记密码
        $scope.seek = function () {
            window.userservice.goToFindPassword({},function (info) {}, function (error) {});
        }

        //密码变明文
        $scope.show = function () {
            //根据图标名称判断是否显示密码
            if($scope.showPwd=="login-eye-n"){
                $scope.showPwd="login-eye-h";
                $('#password').attr("type", "number");
            }else{
                $scope.showPwd="login-eye-n";
                $('#password').attr("type", "password");
            }
        }

        //关闭按钮事件
        $scope.close=function () {
            window.userservice.dismissLogin({},function (info) {}, function (error) {});
        }

    })