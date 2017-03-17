var moudel1 = angular.module('controllers')
//制作加载动画界面
moudel1.directive('load', function () {
    return {
        restrict: 'AEMC',
        template: '<div class=\"shade_div\" id=\"loading\" ><b>正在加载中....</b></div> ',
        replace: true
    }
});

//制作屏障
moudel1.directive('hidebackground', function () {
    return {
        restrict: 'AEMC',
        template: '<div class=\"shade_div1\" id=\"hidebackground\" ></div> ',
        replace: true
    }
});
//制作屏障
moudel1.directive('cardsearch', function () {
    return {
        restrict: 'AEMC',
        template: '<input type=\"text\" value=\"search\">',
        replace: true
    }
});
//制作长久屏障
moudel1.directive('shadow', function () {
    return {
        restrict: 'AEMC',
        template: '<div class=\"longshadow\" id=\"longshadow\" ></div> ',
        replace: true
    }
});

//制作自定义返回键
moudel1.directive('smposBack', function ($state, $BK, $ionicPlatform) {
    return {
        restrict: 'AE',
        template: '<ion-nav-buttons side="left">' +
                      '<button class="button" ng-click="smposBack()">' +
                          '<img ng-src={{"back"|img_url}} class="back_img">' +
                      '</button>' +
                  '</ion-nav-buttons>',
        replace: true,
        link: function (scope, element, attr) {
            // 返回类型
            var backType = attr.backType || 1;
            scope._backType = backType;

            // 左上角返回键
            scope.smposBack = function () {
                $BK.goback(backType);
            };

            // 注册物理返回键
            var backRgst = $ionicPlatform.registerBackButtonAction(function (e) {
                e.preventDefault();
                // 当业务上不是返回上一页时，不做处理
                if(backType==1){
                    alert(1);
                    scope.smposBack();
                }
            }, 100);
            // 页面销毁时注销此返回事件
            scope.$on('$destroy', backRgst);
        }
    }
});
//制作按钮返回键
moudel1.directive("smposhomeback", function ($state, $BK) {
    return {
        restrict: "AEMC",
        link: function (scope, elem, attrs) {
            $(elem).click(function () {
                var backType = attrs.backType || scope._backType;
                backType = backType || 1;
                // 返回类型
                $BK.goback(backType);
            });
        }
    }
});
function hideshadow() {
    if (document.getElementById("longshadow") != null) {
        document.getElementById("longshadow").style.display = "none";
    }
};
function showshadow() {
    if (document.getElementById("longshadow") != null) {
        document.getElementById("longshadow").style.display = "block";
    }
};

function hidebackground() {
    if (document.getElementById("hidebackground") != null) {
        document.getElementById("hidebackground").style.display = "none";
    }
};
function showbackground() {
    if (document.getElementById("hidebackground") != null) {
        document.getElementById("hidebackground").style.display = "block";
    }
};
function showloading() {
    showbackground();
    document.getElementById("loading").style.display = "block";
};
function hideloading() {
    hidebackground();
    document.getElementById("loading").style.display = "none";
};



 