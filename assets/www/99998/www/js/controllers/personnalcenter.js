angular.module('controllers')
.controller('personnalcenterCtrl', function ($scope, $http,$compile,$ionicPopup, $state, $popconfirm,$BK, toaster, $timeout) {
  $(".bar-stable").hide();
  //跳转用户设值
  $scope.usersetting=function(){
      window.memberservice.start({"type":5},function (info) {}, function (error) {});
      //$ionicPopup.confirm({  //confirm弹框
       //         template:$popconfirm.getContent("用户设值"),  //弹框样式
       //         buttons: [
       //             { text: '取消',
       //                 onTap: function () {  //取消事件
       //                 }
       //             },
       //             { text: '确定',
       //                 type: 'button-positive',  //确定事件
       //                 onTap: function () {
       //                      toaster.pop('warning', null,  "确定", null, 'trustedHtml');
      //
       //                 }
       //             }
       //         ]
       //     })
  }
  //跳转申请记录
  $scope.applyrecord=function(){
      window.memberservice.start({"type":4},function (info) {}, function (error) {});
  	//$ionicPopup.confirm({  //confirm弹框
       //         template:$popconfirm.getContent("申请记录"),  //弹框样式
       //         buttons: [
       //             { text: '取消',
       //                 onTap: function () {  //取消事件
       //                 }
       //             },
       //             { text: '确定',
       //                 type: 'button-positive',  //确定事件
       //                 onTap: function () {
       //
      //
       //                 }
       //             }
       //         ]
       //     })
  }
  //跳转邀请好友
  $scope.invitefriend=function(){
      window.memberservice.start({"type":6},function (info) {}, function (error) {});
  	//$ionicPopup.confirm({  //confirm弹框
       //         template:$popconfirm.getContent("邀请好友"),  //弹框样式
       //         buttons: [
       //             { text: '取消',
       //                 onTap: function () {  //取消事件
       //                 }
       //             },
       //             { text: '确定',
       //                 type: 'button-positive',  //确定事件
       //                 onTap: function () {
       //
      //
       //                 }
       //             }
       //         ]
       //     })
  }
  //跳转申请信息
  $scope.applyinfo=function(){
      window.memberservice.start({"type":3},function (info) {}, function (error) {});
  	//$ionicPopup.confirm({  //confirm弹框
       //         template:$popconfirm.getContent("申请信息"),  //弹框样式
       //         buttons: [
       //             { text: '取消',
       //                 onTap: function () {  //取消事件
       //                 }
       //             },
       //             { text: '确定',
       //                 type: 'button-positive',  //确定事件
       //                 onTap: function () {
       //
      //
       //                 }
       //             }
       //         ]
       //     })
  }
  //跳转个人资料
  $scope.personnalcenter_detail=function(){
      window.memberservice.start({"type":2},function (info) {}, function (error) {});
  	//$ionicPopup.confirm({  //confirm弹框
       //         template:$popconfirm.getContent("个人资料"),  //弹框样式
       //         buttons: [
       //             { text: '取消',
       //                 onTap: function () {  //取消事件
       //                 }
       //             },
       //             { text: '确定',
       //                 type: 'button-positive',  //确定事件
       //                 onTap: function () {
       //
      //
       //                 }
       //             }
       //         ]
       //     })
  }
    //点击顶部跳转个人信息
    $scope.personnalcenter_info = function () {
        window.memberservice.start({"type": 1}, function (info) {
        }, function (error) {
        });
    }


})
