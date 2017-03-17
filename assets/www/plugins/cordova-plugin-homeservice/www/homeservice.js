cordova.define("cordova-plugin-homeservice.homeservice", function(require, exports, module) {
var exec = require('cordova/exec'),
    cordova = require('cordova');
     module.exports = {
       start: function(data, success, fail) {
       exec(success, fail, "HomeService", "start", [data]);
       },
       quit: function(data, success, fail) {
       exec(success, fail, "HomeService", "quit", [data]);
       },
       getHomeInfo: function(data, success, fail) {
       exec(success, fail, "HomeService", "getHomeInfo", [data]);
       },
       getLoanProductList: function(data, success, fail) {
       exec(success, fail, "HomeService", "getLoanProductList", [data]);
       },
       getLoanProductInfo: function(data, success, fail) {
       exec(success, fail, "HomeService", "getLoanProductInfo", [data]);
       },
       getCreditProductList: function(data, success, fail) {
       exec(success, fail, "HomeService", "getCreditProductList", [data]);
       },
       getCreditProductInfo: function(data, success, fail) {
       exec(success, fail, "HomeService", "getCreditProductInfo", [data]);
       },
       getFineProductList: function(data, success, fail) {
       exec(success, fail, "HomeService", "getFineProductList", [data]);
       }
       }


});
