angular.module('controllers')
    .controller('cardApplyCtrl', function ($scope, $stateParams, $http, $compile, $state, $BK, toaster, $timeout) {
        $(".bar.bar-stable").css("background", "#ffffff");
        $(".bar.bar-stable .title").css("color", "#000000");
        $(".bar.bar-stable .title").css("font-weight", "bold");
        $scope.cardAapply_back = function () {
            window.homeservice.quit({},function (info) {}, function (error) {});
        }
        var data1 = $stateParams.data;
        var data = {
        };
        window.homeservice.getCreditProductInfo(data,
            function (info) {
                if(info.errorCode==0){
                    $scope.cardInfoImg = info.data.mainimage;
                    $scope.productname = info.data.productname;
                    $scope.productlabel = info.data.productlabel;
                    $scope.productsummary = info.data.productsummary;
                    $scope.amount = info.data.amount;
                }
            }, function (error) {

            }
        );
        //$http({
        //    method: 'GET',
        //    url: "http://localhost:8080/MDM-QX-FINANCE/api/product/getCreditProductInfo",
        //    params: {
        //        "id": data.id
        //    }
        //}).success(function (json) {
        //    // 回调函数
        //    if (json.data != null) {
        //        $scope.cardInfoImg = json.data.mainimage;
        //        $scope.productname = json.data.productname;
        //        $scope.productlabel = json.data.productlabel;
        //        $scope.productsummary = json.data.productsummary;
        //        $scope.amount = json.data.amount;
        //    }
        //}).error(function (json) {
        //    //处理响应失败
        //    toaster.pop('warning', null, '服务器异常', null, 'trustedHtml');
        //});

    })