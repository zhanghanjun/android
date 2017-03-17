(function (ng) {
ng.module('ngCordova.plugins.jfservice', ['ng'])
  .factory('$jf', ['$q', '$window','$timeout','$rootScope', function ($q, $window, $timeout, $rootScope) {
    return {
      onNotification: function (notification) {
        $timeout(function () {
          $rootScope.$broadcast('$jf:notificationReceived', notification);
        });
      },

      getEnv: function(config){
        var q = $q.defer();
        /* $window.jfservice.getEnv(config,function (resp) {
           q.resolve(resp);
         }, function (error) {
           q.reject(error);
         });*/
                 // mock
       var  resp = {
           "osType": "android4.1.1",
           "transDate": "20150423",
           "transLog": "000001",
           "transTime": "052206",
           "version": "1.0.0"
       };
        q.resolve(resp);

        return q.promise;
      },
      encodeWithRSA: function(account, password){
        var q = $q.defer();
         $window.jfservice.RSAEncode({account: account, password: password}, function(resp){
           q.resolve(resp);
         }, function (error) {
           q.reject(error);
         });
//        q.resolve("encodewithrsa");
        return q.promise;
      },
      digestWithMD5: function(plaintext){
        var q = $q.defer();
         /*$window.jfservice.MD5Encode(plaintext, function(resp){
           q.resolve(resp);
         }, function (error) {
           q.reject(error);
         });*/
       q.resolve("digestWithMD5");
        return q.promise;
      },
      getTokenData: function(data){
       var q = $q.defer();
        /*  $window.jfservice.getTokenData(data, function(resp){
           q.resolve(resp);
         }, function (error) {
           q.reject(error);
         });*/
       var resp = {
           "mobileSerialNum":  "ec2e7ffd7078afa98a4b099699a186c000000000",
           "clientType":       "04",
           "phone":            "13816443721",//15121074003 13816443721
           "appUser":          "jfpal",
           "token":            "0000",
           "jfpalVersion":     "3.3.1"
       };
       q.resolve(resp);
        return q.promise;
      },
      hideBottombar:function(data){
             var q = $q.defer();
             $window.jfservice.isHiddenTabBar(data, function(resp){
                q.resolve(resp);
              }, function (error) {
                q.reject(error);
              });
             return q.promise;
                   
      },
      pushtoAccount:function(data){
          var q=$q.defer();
          $window.jfservice.pushToAddWithdrawAccountView(data, function(resp){
                 q.resolve(resp);
               }, function (error) {
                 q.reject(error);
               });
//            console.log('push');
//           q.resolve("push");
           return q.promise;
      },
      shareToSMS:function (data) {
        var q=$q.defer();
          $window.jfservice.shareToSMS(data, function(resp){
                 q.resolve(resp);
               }, function (error) {
                 q.reject(error);
               });
           return q.promise;
      },
      //分享到微信
      shareToWeChart:function(data, which){
        var q=$q.defer();
         $window.WeChat.share({
              type: data.type,
              title: data.title,
              description: data.description,
              thumbData: data.thumbData,
              url: data.url,
              data: data.data
           }, which, function () {
               console.log('分享成功~');
           }, function (reason) {
               // 分享失败
               console.log(reason);
           });
           // q.resolve("shareToWeChart");
           return q.promise;
      },
      OpenSignPanelWhenSessionExpired:function(data){
          var q=$q.defer();
         $window.jfservice.OpenSignPanelWhenSessionExpired(data, function(resp){
            q.resolve(resp);
          }, function (error) {
            q.reject(error);
          });
          console.log('SessionExpired');
          // q.resolve("SessionExpired");
          return q.promise;
      }
  };
}]);
}(angular));
