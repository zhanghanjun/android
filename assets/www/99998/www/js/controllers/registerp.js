angular.module('controllers')
    .controller('registerpCtrl', function ($scope, $ionicPopup, $popconfirm, $http, $compile, $state, $BK, toaster, $timeout) {
        $(".bar-stable").hide();
        $scope.showPwd="login-eye-n";
        //判断输入的手机号合不合法
        $(".inp").blur(function () {
            var phone = $(".inp").val();
            var myreg = /^1(3|4|5|7|8)\d{9}$/;
            if (!myreg.test(phone)) {
                $ionicPopup.confirm({  //confirm弹框
                    template: $popconfirm.getContent("请输入正确的手机号"),  //弹框样式
                    buttons: [
                        {
                            text: '确定',
                            type: 'button-positive',  //确定事件
                            onTap: function () {
                                $('.inp').val('');
                            }
                        }
                    ]
                })

            }
        });

        //忘记密码
        $scope.seek = function () {
            window.userservice.goToFindPassword({},function (info) {}, function (error) {});
        }

        //跳转到登录页面
        $scope.loginp = function () {
            window.userservice.dismissRegist({},function (info) {}, function (error) {});
        }

        //获取验证码
        $scope.sendCheckNum = function(){
            var data = {
                "cellPhone": $scope.phone
            };
            window.userservice.meRregister(data,
                function (info) {

                }, function (error) {

                }
            );
        }

        //注册提交
        $scope.submit = function(){
            var data = {
                //"name": $scope.name,
                "cellPhone": $scope.phone,
                "identifying": $scope.checkNum,
                "password": $scope.password
            };
            window.userservice.memRegisterSubmit(data,
                function (info) {

                }, function (error) {

                }
            );
        }
        //密码变明文
        $scope.show = function () {
            //根据图标名称判断是否显示密码
            if($scope.showPwd=="login-eye-n"){
                $scope.showPwd="login-eye-h";
                $('#registerp_pwd').attr("type", "number");
            }else{
                $scope.showPwd="login-eye-n";
                $('#registerp_pwd').attr("type", "password");
            }
        }
        //关闭按钮事件
        $scope.close=function () {
            window.userservice.dismissRegist({},function (info) {}, function (error) {});
        }
    })