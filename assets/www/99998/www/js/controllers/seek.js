angular.module('controllers')
    .controller('seekCtrl', function ($scope, $ionicPopup, $popconfirm, $http, $compile, $state, $BK, toaster, $timeout) {
        $(".bar-stable").hide();
        $scope.isHide=false;
        $('#seek_input').blur(function () {
            console.log(123);
            var phone = $('#seek_input').val();
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
                                console.log('确定之后')
                                $('#seek_input').val('');

                            }
                        }
                    ]
                })


            }
        });

        //获取验证码
        $scope.sendCheckNum = function(){
            var data = {
                "cellPhone": $scope.cellPhone
            };
            window.userservice.memFindPassword(data,
                function (info) {
                    alert(info.name);
                }, function (error) {
                    alert(error.password);
                }
            );
        }
        //下一步操作
        $scope.next = function () {
            if($scope.cellPhone!=""&&$scope.cellPhone!=null&&$scope.checkNum!=""&&$scope.checkNum!=null){
                $scope.isHide=true;
            }
        }
        //提交
        $scope.submit = function () {
            var data = {
                "cellPhone": $scope.cellPhone,
                "identifying": $scope.checkNum,
                "password": $scope.password
            };
            window.userservice.memFindPasswordSubmit(data,
                function (info) {
                    alert(info.name);
                }, function (error) {
                    alert(error.password);
                }
            );
        }
        //关闭按钮事件
        $scope.close=function () {
            window.userservice.dismissFindPassword({},function (info) {}, function (error) {});
        }
    })