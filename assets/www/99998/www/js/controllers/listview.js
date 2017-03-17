angular.module('controllers')
    .controller('listviewCtrl', function ($scope, $http, $compile, $state, $BK, toaster, $timeout) {
        $(".bar.bar-stable").css("background", "#5c6bc2");
        $scope.listview_back = function () {
            window.homeservice.quit({},function (info) {}, function (error) {});
        }
        var begin=0;
        //$http({
        //    method : 'GET',
        //    url : "http://localhost:8080/MDM-QX-FINANCE/api/product/getCreditProductList",
        //    params : {
        //        "begin":begin
        //    }
        //}).success(function(json){
        //    // 回调函数
        //    if(json.data!=null){
        //        $scope.cardInfo=json.data;
        //    }
        //}).error(function(json){
        //    //处理响应失败
        //    toaster.pop('warning', null,  '服务器异常', null, 'trustedHtml');
        //});
        var data = {
            "begin":begin
        };
        window.homeservice.getCreditProductList(data,
            function (info) {
                if(info.errorCode==0){
                    $scope.cardInfo=info.data;
                }
            }, function (error) {

            }
        );
        //跳转详情页面
        $scope.goDetail = function (id) {
            //$state.go("cardApply",{"data": {"id": id}});
            window.homeservice.start({"type":1,"id":id},function (info) {}, function (error) {});
        }
    })