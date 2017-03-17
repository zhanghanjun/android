cordova.define("cordova-plugin-memberservice.memberservice", function(require, exports, module) {
var exec = require('cordova/exec'),
    cordova = require('cordova');
module.exports = {
    start: function(data, success, fail) {
        exec(success, fail, "MemberService", "start", [data]);
    },
    quit: function(data, success, fail) {
        exec(success, fail, "MemberService", "quit", [data]);
    },
    getApplyInfo: function(data, success, fail) {
        exec(success, fail, "MemberService", "getApplyInfo", [data]);
    },
    getApplyTransaction: function(data, success, fail) {
        exec(success, fail, "MemberService", "getApplyTransaction", [data]);
    },
    getMemberInfo: function(data, success, fail) {
        exec(success, fail, "MemberService", "getMemberInfo", [data]);
    },
    getMemberAccountInfo: function(data, success, fail) {
        exec(success, fail, "MemberService", "getMemberAccountInfo", [data]);
    },
    deleteApplyTransaction: function(data, success, fail) {
        exec(success, fail, "MemberService", "deleteApplyTransaction", [data]);
    },
    setMemberInfo: function(data, success, fail) {
        exec(success, fail, "MemberService", "setMemberInfo", [data]);
    },
    setApplyInfo: function(data, success, fail) {
        exec(success, fail, "MemberService", "setApplyInfo", [data]);
    }
}

});
