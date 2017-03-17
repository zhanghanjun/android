angular.module('cat')
.config(function ($stateProvider, $urlRouterProvider) {
    $stateProvider
	
	 
    //首页界面
    .state('firstpage', {
        url: "/firstpage",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/firstpage.html",
        controller: 'firstpageCtrl'
    })
	
    //注册
    .state('register', {
        url: "/register",
        cache: 'true',
        //params: {"data": null},
        templateUrl: "templates/register.html",
        controller: 'registerCtrl'
    })

    //登录
    .state('login', {
        url: "/login",
        cache: 'true',
        //params: {"data": null},
        templateUrl: "templates/login.html",
        controller: 'loginCtrl'
    })

    //忘记密码
    .state('forgetpwd', {
        url: "/forgetpwd",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/forgetpwd.html",
        controller: 'forgetpwdCtrl'
    })
	 

    //登录错误
    .state('login_err',{
        url:"/login_err",
        cache:'false',
        //params:{"data":null},
        templateUrl: "templates/login_err.html",
        controller: 'loginerrCtrl'
    })

     //贷款产品列表
    .state('productList',{
        url:"/productList",
        cache:'true',
        //params:{"data":null},
        templateUrl: "templates/productList.html",
        controller: 'productListCtrl'
    })

      //贷款产品列表
    .state('productDetail',{
        url:"/productDetail",
        cache:'false',
        //params:{"data":null},
        templateUrl: "templates/productDetail.html",
        controller: 'productDetailCtrl'
    })
 
     //信用卡列表
    .state('listview',{
        url:"/listview",
        cache:'false',
        //params:{"data":null},
        templateUrl: "templates/listview.html",
        controller: 'listviewCtrl'
    })
     //信用卡申请
    .state('cardApply',{
        url:"/cardApply",
        cache:'false',
        //params:{"data":null},
        templateUrl: "templates/cardApply.html",
        controller: 'cardApplyCtrl'
    })
     


    //注册
    .state('registerp', {
        url: "/registerp",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/registerp.html",
        controller: 'registerpCtrl'
    })

    //登录

    .state('loginp', {
        url: "/loginp",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/loginp.html",
        controller: 'loginpCtrl'
    })


    //密码错误
    .state('pwder', {
        url: "/pwder",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/pwder.html",
        controller: 'pwderCtrl'
    })
    //找回密码
    .state('seek', {
        url: "/seek",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/seek.html",
        controller: 'seekCtrl'
    })

    // 会员个人信息
    //.state('personaldata', {
    //    url: "/personaldata",
    //    cache: 'false',
    //    //params: {"data": null},
    //    templateUrl: "templates/personaldata.html",
    //    controller: 'personaldataCtrl'
    //})

     // 客户详情页
    .state('clientele', {
        url: "/clientele",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/clientele.html",
        controller: 'clienteleCtrl'
    })
    // 个人资料
    .state('perdata', {
        url: "/perdata",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/perdata.html",
        controller: 'perdataCtrl'
    })


     // 登录首页
    .state('loginpage', {
        url: "/loginpage",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/loginpage.html",
        controller: 'loginpageCtrl'
    })
 
    // 账号信息
    .state('countMsg', {
        url: "/countMsg",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/countMsg.html",
        controller: 'countMsgCtrl'
    })
     // 设置
    .state('set', {
        url: "/set",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/set.html",
        controller: 'setCtrl'
    })
   // 我的申请记录
    .state('applicationsRecord', {
        url: "/applicationsRecord",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/applicationsRecord.html",
        controller: 'applicationsRecordCtrl'
    })
 
       // 个人中心
    .state('personnalcenter', {
        url: "/personnalcenter",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/personnalcenter.html",
        controller: 'personnalcenterCtrl'
    })


     // 项目详情页
    .state('projectdetails', {
        url: "/projectdetails",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/projectdetails.html",
        controller: 'projectdetailsCtrl'
    })
     // 申请信息
    .state('apply', {
        url: "/apply",
        cache: 'false',
        //params: {"data": null},
        templateUrl: "templates/apply.html",
        controller: 'applyCtrl'
    })

    


   // 个人中心
   // .state('applyRecord', {
   //     url: "/applyRecord",
   //     cache: 'false',
   //     //params: {"data": null},
   //     templateUrl: "templates/applyRecord.html",
   //     controller: 'applyRecordCtrl'
   // })
 
    $urlRouterProvider.otherwise('/loginpage');
 
});
