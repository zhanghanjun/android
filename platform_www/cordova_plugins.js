cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "cordova-plugin-userservice.userservice",
        "file": "plugins/cordova-plugin-userservice/www/userservice.js",
        "pluginId": "cordova-plugin-userservice",
        "clobbers": [
            "userservice"
        ]
    },
    {
        "id": "cordova-plugin-homeservice.homeservice",
        "file": "plugins/cordova-plugin-homeservice/www/homeservice.js",
        "pluginId": "cordova-plugin-homeservice",
        "clobbers": [
            "homeservice"
        ]
    },
    {
        "id": "cordova-plugin-memberservice.memberservice",
        "file": "plugins/cordova-plugin-memberservice/www/memberservice.js",
        "pluginId": "cordova-plugin-memberservice",
        "clobbers": [
            "memberservice"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.3.1",
    "cordova-plugin-userservice": "1.0.0",
    "cordova-plugin-homeservice": "1.0.0",
    "cordova-plugin-memberservice": "1.0.0"
};
// BOTTOM OF METADATA
});