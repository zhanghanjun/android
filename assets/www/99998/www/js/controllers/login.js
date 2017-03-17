angular.module('controllers')

.controller('loginCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	//跳注册页面
	$("#register").click(
		function(){
	 	$state.go("register");
	 	}
 	);
	 //登录按钮
	$("#login").click(
		function(){
	 	$state.go("login_err");
	 	}
 	);
	$scope.forget = function() {
        $state.go("forgetpwd");
    };
})
