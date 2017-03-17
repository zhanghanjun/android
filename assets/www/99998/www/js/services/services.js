angular.module('services', ['ionic'])
.factory('$r', function($http, $interface, $rootScope, _, $cache, $jf, $q, $ionicPlatform, $state) {
  return function(api, reqbody){
    // merge with cordova application
    // secure msg
    //  'reqContent={"reqHead":{"transDate":"20150101","transTime":"120000","application":"login","serialID":"222222","osType":"andriod2.4","version":"1.0","phone":"18988888888"},"reqBean":{"detail":[{"userName":"admin","password":"DFAF016D15CB38C487B5DB9E0ADA1FCC8A8959E0"}]}}&sign=E9CB490CAF0FCB2E2682409B483EC71A'
    // msg = {
    //   reqContent: '{"reqHead":{"transDate":"20150101","transTime":"120000","application":"login","serialID":"222222","osType":"andriod2.4","version":"1.0","phone":"18988888888"},"reqBean":{"detail":[{"userName":"admin","password":"DFAF016D15CB38C487B5DB9E0ADA1FCC8A8959E0"}]}}',
    //   sign: 'E9CB490CAF0FCB2E2682409B483EC71A'
    // };
    
    var q = $q.defer(); 
    $jf.getTokenData().then(function(tokenData){
        console.log(tokenData);
        var reqhead = {
            "reqHead": {
                "version": "1.0.0",
                "application": api,
                "sysSource": "jfpal",
                "token": tokenData.token,
                "phone": tokenData.phone
            }
        };
        var reqbean = {
            "reqBean": {
                "detail":  reqbody,
                "cat": _.omit(tokenData, 'token')
            }
        };
        var msg = _.merge(reqhead, reqbean);
        console.log(msg);
        $jf.getEnv().then(function(data){
        // q.resolve(data);
        // q.resolve(_.merge(data, reqhead.reqHead));
            msg.reqHead = _.merge(data, reqhead.reqHead);
            console.log(msg);
            var reqContent = JSON.stringify(msg);
            $jf.digestWithMD5(reqContent).then(function(sign){
                var reqData = 'reqContent='+ encodeURI(JSON.stringify(msg)) + "&sign=" + sign;
                var req = {
                    method: 'POST',
                    url: $interface.getUrl(api),
                  headers: {
                        'Content-Type': "application/x-www-form-urlencoded",
                },
                  data: 'name=yangyu'
                };
                $http(req).error(function(err){
                    console.log(err);
                    $rootScope.$broadcast("network:error", err);
                    q.reject(err);
                }).success(function(data){
                
                  console.log(data);
                    // q.resolve(data);
                    // console.log(JSON.stringify(data));
                    // token invalidation
                    /*if(data.respHead.code === 'FP02'||data.respHead.code === 'FP91'){
                        $rootScope.$broadcast("token:invalidation", data);
                        $jf.OpenSignPanelWhenSessionExpired();
                        q.reject(data);
                    }else {
                        q.resolve(data);
                    }*/
                    q.resolve(data);
                    // if(data.respHead.code === 'FP99'){
                    //   $rootScope.$broadcast("token:invalidation", data);
                    // }
                    // if data.respHead.code === 'FP02'
                    // $rootScope.$broadcast("token:invalidation", data);
                    // sign error
                    // $rootScope.$broadcast("sign:error", data);
                });
            });
        } ,function(err){
            q.reject(err); 
        });
    });
    return q.promise;
  };
})
.factory('$interface', function(API_URL){
  return {
    getUrl: function(api){
      return API_URL + api;
    }
  };
})

.factory('$popconfirm', function(){
  return {
    getContent: function(api){
      return "<div class=\"pop-div\" ><p>"+api +"<p><div>";
    }
  };
})
.factory('$poptoast', function(){
  return {
    gettoastcontent: function(api){
      return "<div class=\"pop-div\" ><p>"+api +"<p><div>";
    }
  };
})
.service('$BK', function($state,$ionicHistory,$timeout, toaster) {
  // 自定义返回事件
  this.goback = function(backType){
    // 返回类型
    // 未定义:返回上一页
    // 1:返回上一页
    // 2:返回收银台
    // 3:返回主页
    // 4:返回登录页
    // 5:返回上一页,否则返回主页
    backType = backType || 1;
    if(backType == 1){
      // 返回上一页
      if (!!$ionicHistory.backView()) {
          $ionicHistory.goBack();
      }
    }
    else if(backType==2){
      $state.go('gathering');
    }
    else if(backType ==3){
      if (!!window.signinservice) {
          // 返回主页
          window.signinservice.quit({type: 1}, function (result) {}, function (result) {});
      }
    } else if(backType == 4){
      if (!!window.signinservice) {
          // 返回登录
          window.signinservice.quit({type: 2}, function (result) {}, function (result) {});
      }
    } else if(backType == 5){
      if (!!$ionicHistory.backView()) {
          // 返回上一页
          $ionicHistory.goBack();
      } else {
        if (!!window.signinservice) {
            // 返回主页
          window.signinservice.quit({type: 1}, function (result) {}, function (result) {});
        }
      }
    }
  };

  // 获取定位
  this.getCurrentPosition = function(callBack){ 
    //开始获取定位数据
    navigator.geolocation.getCurrentPosition(function(position){
      //定位数据获取成功响应
      // alert('纬度: '          + position.coords.latitude          + '\n' +
      // '经度: '         + position.coords.longitude         + '\n' +
      // '海拔: '          + position.coords.altitude          + '\n' +
      // '水平精度: '          + position.coords.accuracy          + '\n' +
      // '垂直精度: ' + position.coords.altitudeAccuracy  + '\n' +
      // '方向: '           + position.coords.heading           + '\n' +
      // '速度: '             + position.coords.speed             + '\n' +
      // '时间戳: '         + position.timestamp                + '\n');
      callBack(1, position);
    }, function(error){
      //定位数据获取失败响应
      // alert('code: '    + error.code    + '\n' + 'message: ' + error.message + '\n');
      callBack(0, error);
    });
  }

  // 取得支付类型
  this.getServerCode = function(){
    return {
        alipayType : "10003",//"支付宝";
        weichatType : "10002",//"微信";
        bankcardType : "10001",//"银行卡";
        cashType : "20001"//"现金";
    }
  }
  this.getServerCodeValue = function(code){
    // 支付类型
    var serverCodes = this.getServerCode();
    // 支付类型code与值对应
    if(code==serverCodes.cashType){
        return "现金";
    } else if(code==serverCodes.bankcardType){
        return "银行卡";
    } else if(code==serverCodes.alipayType){
        return "支付宝";
    } else if(code==serverCodes.weichatType){
        return "微信";
    } else if(!code || code==serverCodes.forallType){
        return "全部";
    }
    return "";
  }

  // 补位
  // value:需要补位的内容
  // pad:补位值
  // len:补到多长
  // isLeft:是否从左开始补位
  this.pad = function(value,pad,len,isLeft){
    // 默认从左开始补位
    isLeft = isLeft || true;
    value = value || "";
    value += "";
    if(value.length >= len){
      return value;
    }
    // 补位长
    var padLen = len - value.length;
    // 补位内容
    var padContent = this.getSomeLen(pad,padLen);
    if(isLeft){
      // 左补
      return padContent + value;
    } else {
      // 右补
      return value + padContent;
    }
  }

  // 获得填充
  this.getSomeLen = function(some, len){
    var result = "";
    for(;result.length<len;){
      result+=some;
    }
    result = result.substring(0,len);
    return result;
  }

  // 日期转换(账簿页面,交易记录列表)
  // 参数类型(day:yyyy-MM-dd,time:HH:mm:ss,daytime:yyyy/MM/dd HH:mm:ss)
  // 结果示例：今天17:34 昨天09:07 周四11-12
  this.getDateFormat = function(day, time, daytime){
      var daySplit = '-';
      var timeSplit = ':';
      if(!!daytime){
        daySplit = '/';
        day = daytime.substring(0,10);
        time = daytime.substring(11);
      }
      var rslt = "";
      try{
        // 年月日
        var tradeDate = day;
        var tradeDate_array = tradeDate.split(daySplit);
        // 时分秒
        var tradeTime = time;
        var tradeTime_array = tradeTime.split(timeSplit);
        var useDate = new Date();
        useDate.setFullYear(tradeDate_array[0], parseInt(tradeDate_array[1])-1, tradeDate_array[2]);
        useDate.setHours(tradeTime_array[0]);
        useDate.setMinutes(tradeTime_array[1]);
        // useDate.setSeconds(tradeTime_array[2]);
        if(useDate != 'Invalid Date'){
          var curDate = new Date(); // 当天
          var preDate = new Date(curDate.getTime() - 24*60*60*1000); //前一天

          if(curDate.getFullYear() == useDate.getFullYear() &&
              curDate.getMonth() == useDate.getMonth() &&
              curDate.getDate() == useDate.getDate()){
              // 今天
              rslt =  "今天" + this.pad(useDate.getHours(),'0',2) + ":" + this.pad(useDate.getMinutes(),'0',2);
          } else if(preDate.getFullYear() == useDate.getFullYear() &&
              preDate.getMonth() == useDate.getMonth() &&
              preDate.getDate() == useDate.getDate()){
              // 昨天
              rslt = "昨天" + this.pad(useDate.getHours(),'0',2) + ":" + this.pad(useDate.getMinutes(),'0',2);
          } else if(!!useDate){
              // 前天及以上
              rslt = "周" + (useDate.getDay()==1&&"一" ||
                          useDate.getDay()==2&&"二" ||
                          useDate.getDay()==3&&"三" ||
                          useDate.getDay()==4&&"四" ||
                          useDate.getDay()==5&&"五" ||
                          useDate.getDay()==6&&"六" ||
                          useDate.getDay()==0&&"日") +
                          (useDate.getMonth() + 1) + "-" + useDate.getDate();
          }
        }
      }catch(e){}

      return rslt;
  }

  // 保留小数，设置千分位
  this.setNumThousandth = function(num,bit){
    bit = bit || 0;
    num = parseFloat(num);
    return (num.toFixed(bit) + '').replace(/\d{1,3}(?=(\d{3})+(\.\d*)?$)/g, '$&,');
  }

  // 银行卡加密
  this.cardMakeSecret = function(cardNo){
    // 加密效果
    var SECRET = "*";

    var tmp = cardNo || "";
    tmp = tmp.split('');
    var isSecrted = false;
    for(var i=0;i<tmp.length;i++){
      if(isNaN(tmp[i])){
        tmp[i] = SECRET;
        isSecrted = true;
      }
    }
    var rslt = tmp.join('');

    // 未加密则加密
    if(!isSecrted){
      var endStart = 4;
      var secretLen = 8;
      if(!!cardNo && cardNo.length >= endStart+secretLen){
        var len = cardNo.length;
        var str1 = cardNo.substring(0,len - endStart - secretLen);
        var str2 = "";
        for(var i=0;i<secretLen;i++){
          str2+=SECRET;
        }
        var str3 = cardNo.substring(len - endStart,len);
        rslt = str1+str2+str3;
      }
    }

    return rslt;
  }

  // 设置时间格式
  this.setTimeFormat = function(date,time,datetime){
    if(!!date && !! time){
      return date.replace(new RegExp('-','gm'),'/') + " " + time;
    } else if(!!datetime){
      return datetime;
    } else {
      return "---";
    }
  }

  // 银行卡交易数据
  this.cardInfo = function(data){
      var info = [
          {id:"orderId",name:"订单号",value:data.orderId},
          {id:"merchantName",name:"商户名称",value:data.merchantName},
          {id:"merchantId",name:"商户号",value:data.merchantId},
          {id:"terminalId",name:"终端号",value:data.terminalId},
          {id:"serverCodeValue",name:"交易类型",value:"刷卡支付"},
          {id:"issuingBank",name:"发卡行",value:data.issuingBank},
          {id:"cardNo",name:"卡号",value:data.cardNo},
          {id:"expiry",name:"有效期",value:data.expiry},
          {id:"transBatchNo",name:"批次号",value:data.transBatchNo},
          {id:"bankcardAssociation",name:"卡组织",value:data.bankcardAssociation},
          {id:"dateTimes",name:"日期/时间",value:this.setTimeFormat(data.transDate, data.transTime, data.transDateTime)},
          {id:"refNo",name:"序号",value:data.refNo},
          {id:"authCode",name:"授权号",value:data.authCode},
          {id:"amount",name:"金额",value:"RMB " + this.setNumThousandth(data.amount,2) + "元"},
      ];

      return info;
  }

  // 支付宝/微信交易数据
  this.wx_aliInfo = function(data){
      var info = [
          {id:"orderId",name:"订单号",value:data.orderId},
          {id:"merchantName",name:"商户名称",value:data.merchantName},
          {id:"merchantNum",name:"支付渠道",value:this.getServerCodeValue(data.serverCode)},
          {id:"terminalNum",name:"交易号",value:data.outTransactionId},
          {id:"status",name:"当前状态",value:"支付成功"},
          {id:"dateTimes",name:"日期/时间",value:this.setTimeFormat(data.transDate, data.transTime, data.transDateTime)},
          {id:"amount",name:"付款金额",value:"RMB " + this.setNumThousandth(data.amount,2) + "元"},
      ];

      return info;
  }

  // 交易数据
  this.tradeInfo = function(data){
    var serverCode = data.serverCode;
    var serverCodes = this.getServerCode();
    if(serverCode == serverCodes.bankcardType){
      // 银行卡
      return this.cardInfo(data);
    } else if(serverCode == serverCodes.alipayType || serverCode == serverCodes.weichatType){
      // 微信/支付宝
      return this.wx_aliInfo(data);
    }
  }

  // 处理重打印签购单逻辑
  this.accountReprint = function(result){
    var data = result.result;
    // 交易类型
    var serverCode = data.serverCode;
    var serverCodes = this.getServerCode();
    // 银行卡号加密
    data.candNo = this.cardMakeSecret(data.candNo);
    if(serverCode == serverCodes.bankcardType ||
            serverCode == serverCodes.alipayType ||
            serverCode == serverCodes.weichatType){
        // 银行卡/支付宝/微信交易
        var info = this.tradeInfo(data);

        // 跳转重打印交易页面
        $state.go('heavyprintdetail', {data:{ret:1,msg:"",data:info,result:result}});
    } else if(serverCode == serverCodes.cashType){
        // 现金
        $timeout(function() {
          toaster.pop('warning', null,  "现金交易不可打印", null, 'trustedHtml');
        }, 10);
    } else {
        $timeout(function() {
          toaster.pop('warning', null,  "数据异常", null, 'trustedHtml');
        }, 10);
    }
  }

  // 金额显示转化(分->元)
  this.showAmount = function(amount){
    if(!!amount && !isNaN(amount)){
      return amount / 100;
    }
    return amount;
  }
})
.service("validation", function(){
    this.isnull=function(text){
      if(text == undefined || text == null || text == "")
      {
        return false;
      }else{
        return true;
      }
      // return (text === undefined || text == null || text === "");
    };
    this.money=function(money){
      return  (/^\d+(\.\d+)?$/.test(money));
    };
    this.isNumber100Times = function(money){
        return (/^[0-9]*[0-9]$/i.test(money) && (money % 10000===0));
    };
    this.phone =function(mobile){
        return (/^1[3|4|5|7|8][0-9]\d{8}$/.test(mobile));
    };
    this.number = function(number){
        return(/^[1-9]+\d*$/.test(number));
    };
    this.cardid = function(cardid){
      return(/^(\d{16}|\d{19})$/.test(cardid));
    };
})


.service('$h', function($state, $ionicHistory) {

  this.getHistory = function(){
    return $ionicHistory.viewHistory();
  };

  this.setBackToState = function(state){
    var histack = $ionicHistory.viewHistory().histories[name? name: "root"].stack,
        views = $ionicHistory.viewHistory().views,
        viewId,
        the_idx;

    histack.forEach(function(view, idx) {
      if(view.stateName == state) {
        viewId = view.viewId
        the_idx  = idx;
        return;
      }
    });
    if(viewId){
      $ionicHistory.viewHistory().backView = views[viewId]
      for(var i = histack.length; i > the_idx ; i--){
        delete histack[i];
      }
    }
    return viewId;
  }

  this.popToState = function(state){
    
    this.setBackToState(state);
    $ionicHistory.goBack();
  }
  
  this.gotoapp=function(){
      $state.go("app");
      $ionicHistory.nextViewOptions({
         disableAnimate: true,
         //disableBack: true
         historyRoot: true,
         expire: 100
      });
  };
})

.factory('$poptoast', function(){
  return {
    gettoastcontent: function(api){
      return "<div class=\"pop-div\" ><p>"+api +"<p><div>";
    }
  };
})

.factory("$cache", function(){
  var user = {
      token: "0000",
      username:"",
      phone: "15121074003",
      idcard: ""
  },
  withdraw_bank= {};
  return {
    resetToken: function(){
      user.token = "0000"; 
    },
    setUser:function(user_o){
      user=user_o;
    },
    getPhone: function(){
     return user.phone; 
    },
    getToken: function(){
      return user.token;
    },
    setToken: function(value){
      user.token = value;
      // todo store token to app
    },
    setPhone: function(phone){
      user.phone = phone;
    },
    getBank: function(key){
        return withdraw_bank[key];
    },
    setBank: function(key,bank){
        withdraw_bank[key] = bank;
    },
    getIdCard: function(){
      return user.idcard;
    },
    getUserName:function(){
        return user.username;
    }
  };
})
.filter('bank_url', function() {
  return function(url) {
    return "./img/bank_icons/bank_" + url+"@2x.png";
  };
})
.filter('img_url', function() {
  return function(url) {
    return "./img/public/" + url+".png";
  };
})
.filter('tomoney', function() {
    return function(s, n) { 
          n = n > 0 && n <= 20 ? n : 2;
          var money = parseFloat(s);
          if(money){
            s = ( money / 100 ).toFixed(n) + "";
            var l = s.split(".")[0].split("").reverse(), r = s.split(".")[1];
            t = "";
            for (i = 0; i < l.length; i++) {
              t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
            }
            return t.split("").reverse().join("") + "." + r;
          }else if (s == 0 ){
            return "0.00"
          } else {
            return '---';

          }
    };
})
.filter('todate', function() {
    return function(thisdate) { 
      if (thisdate) {
        var y=thisdate.substr(0,4);
        var m=thisdate.substr(4,2);
        var d=thisdate.substr(6,2);
        return y+'-'+m+'-'+d;
      }else{
        return  '---';
      };
    };
})
.filter('totime',function(){
  return function(thistime){
    if (thistime) {
      var h=thistime.substr(0,2);
      var m=thistime.substr(2,2);
      return h+':'+m;
    }else{
      return '---';
    };
  };
})
.filter('hidephone', function() {
    return function(thisphone) {
      if (thisphone) {
        return thisphone.substr(0,4)+'****'+thisphone.substr(7,4)
      }else{
        return  '---';
      };
    };
})
.filter('tofloat', function() {
    return function(tofloat) { 
      if (tofloat||tofloat==0) {
        var result=parseFloat(tofloat*100).toFixed(2);
        return result;
      }else{
        return  '---';
      };
    };
})
;
