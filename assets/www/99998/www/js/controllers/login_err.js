angular.module('controllers')

.controller('loginerrCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	$("#back_login").click(
		function(){
	 	$state.go("login");
	 	}
 	);

 	$("#findpwd").click(
		function(){
	 	$state.go("forgetpwd");
	 	}
 	);
})
