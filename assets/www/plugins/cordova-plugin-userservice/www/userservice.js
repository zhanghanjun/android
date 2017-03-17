cordova.define("cordova-plugin-userservice.userservice", function(require, exports, module) {
var exec = require('cordova/exec'),
    cordova = require('cordova');
module.exports = {
   quit: function(data, success, fail) {
        exec(success, fail, "UserService", "quit", [data]);
    },
    memLogin: function(data, success, fail) {
        exec(success, fail, "UserService", "memLogin", [data]);
     },
	 memRregister: function(data, success, fail) {
        exec(success, fail, "UserService", "memRregister", [data]);
     },
	  memRegisterSubmit: function(data, success, fail) {
        exec(success, fail, "UserService", "memRegisterSubmit", [data]);
     },
	  memFindPassword: function(data, success, fail) {
        exec(success, fail, "UserService", "memFindPassword", [data]);
     },
	 memFindPasswordSubmit: function(data, success, fail) {
        exec(success, fail, "UserService", "memFindPasswordSubmit", [data]);
     }
     ,goToRegist: function(data, success, fail) {
             exec(success, fail, "UserService", "goToRegist", [data]);
          },
           	 goToFindPassword: function(data, success, fail) {
                   exec(success, fail, "UserService", "goToFindPassword", [data]);
                },
                 	 dismissLogin: function(data, success, fail) {
                         exec(success, fail, "UserService", "dismissLogin", [data]);
                      },
                       	 dismissRegist: function(data, success, fail) {
                               exec(success, fail, "UserService", "dismissRegist", [data]);
                            },
                             	 dismissFindPassword: function(data, success, fail) {
                                  exec(success, fail, "UserService", "dismissFindPassword", [data]);
                                 }

                  }

});
