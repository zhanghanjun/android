angular.module('controllers')
    .controller('productDetailCtrl', function ($scope, $http, $compile, $state, $BK, toaster, $timeout) {
        $scope.position = '苏州';
        $scope.cardAapply_back = function () {
            window.homeservice.quit({},function (info) {}, function (error) {});
        }
        var contentHeight = document.body.scrollHeight - 104;
        $("#productDetail_scroll").height(contentHeight + "px");
        var data = {};
        window.homeservice.getLoanProductInfo(data,
            function (info) {
                if(info.errorCode==0){
                    $scope.productName = info.data.productName;
                    $scope.saledcount = info.data.saledcount;
                    $scope.mainimage = info.data.mainimage;
                    $scope.productsummary = info.data.productsummary;
                    $scope.minLoan = info.data.minLoan;
                    $scope.maxLoan = info.data.maxLoan;
                    $scope.minRepay = info.data.minRepay;
                    $scope.maxRepay = info.data.maxRepay;
                    $scope.minRate = info.data.minRate;
                    $scope.maxRate = info.data.maxRate;
                    $scope.appCondition = info.data.appCondition;
                    $scope.auritInstruction = info.data.auritInstruction;
                    $scope.thirdpartyUrl = info.data.thirdpartyUrl;
                }
            }, function (error) {

            }
        )
        //$http({
        //    method: 'GET',
        //    url: "http://localhost:8080/MDM-QX-FINANCE/api/product/getLoanProductInfo",
        //    params: {
        //        "id": 1
        //    }
        //}).success(function (json) {
        //    // 回调函数
        //    if (json.data != null) {
        //        $scope.productName = json.data.productName;
        //        $scope.saledcount = json.data.saledcount;
        //        $scope.mainimage = json.data.mainimage;
        //        $scope.productsummary = json.data.productsummary;
        //        $scope.minLoan = json.data.minLoan;
        //        $scope.maxLoan = json.data.maxLoan;
        //        $scope.minRepay = json.data.minRepay;
        //        $scope.maxRepay = json.data.maxRepay;
        //        $scope.minRate = json.data.minRate;
        //        $scope.maxRate = json.data.maxRate;
        //        $scope.appCondition = json.data.appCondition;
        //        $scope.auritInstruction = json.data.auritInstruction;
        //        $scope.thirdpartyUrl = json.data.thirdpartyUrl;
        //    }
        //}).error(function (json) {
        //    //处理响应失败
        //    toaster.pop('warning', null, '服务器异常', null, 'trustedHtml');
        //});

//   $scope.list1= [
//   {
//     "id": 1,
//     "productName": "房产贷",
//     "productLabel": null,
//     "saledcount": 3,
//     "productsummary": "贷款",
//     "productCode": null,
//     "supplierId": null,
//     "supplierName": null,
//     "mainimage": "http://img1.imgtn.bdimg.com/it/u=1104086822,117564155&fm=23&gp=0.jpg",
//     "loan": null,
//     "minLoan": 10000,
//     "maxLoan": 30000,
//     "repay": null,
//     "minRepay": 20,
//     "maxRepay": 50,
//     "rate": null,
//     "minRate": 0.02,
//     "maxRate": 0.43,
//     "appCondition": "有车",
//     "auritInstruction": "已通过",
//     "shelfflag": null,
//     "shelfflagName": null,
//     "shelftime": null,
//     "thirdpartyUrl": null,
//     "clickCount": null,
//     "isFine": null,
//     "isValid": null,
//     "providerName": null
//   }
//   ]

    })
