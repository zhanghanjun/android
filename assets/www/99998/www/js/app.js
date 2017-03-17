angular.module('cat', ['ionic', 'controllers', 'ng.lodash', 'toaster', 'services', 'ngCordova.plugins.jfservice', 'easypiechart'])

.run(function ($ionicPlatform, $window, $ionicHistory, $rootScope, $state) {
    $ionicPlatform.ready(function () {
        // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
        // for form inputs)
        if (window.cordova && window.cordova.plugins.Keyboard) {
            cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
        }
        if (window.StatusBar) {
            //StatusBar.styleDefault();
            StatusBar.styleLightContent();
        }
    });

    $ionicPlatform.registerBackButtonAction(function (e) {
        if ($ionicHistory.backView()) {
            $ionicHistory.goBack();
        }
    }, 100);
})
.config(function ($ionicConfigProvider) {
    $ionicConfigProvider.backButton.text("&nbsp;&nbsp;").previousTitleText(false);
    $ionicConfigProvider.backButton.icon('ion-ios-arrow-back');
})
.constant("API_URL", "http://localhost:8080/jf_cardverification/");
//准生产 178.78.88.60 http://t0.jfpal.com:8002/financial_prepo/
//新准生产　http://new.t0.jfpal.com/financial_prepo/
//测试 http://192.168.1.60:8002/financial_prepo/
//https://mfront.jfpal.com:8443/financial_prepo/
//new.t0.jfpal.com 
//http://220.248.45.126:7001 http://192.168.1.62:7001
//http://220.248.45.126:16082/financial_prepo/productList

//理财测试环境前置域名
//http://test01.jfpal.com:7001/financial_prepo/      ---新理财地址
//http://test01.jfpal.com:16082/financial_prepo/    ---旧理财地址
//https://mfront.jfpal.com:12872/financial_prepo/

