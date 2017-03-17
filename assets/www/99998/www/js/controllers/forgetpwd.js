angular.module('controllers')

.controller('forgetpwdCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	$scope.back = function() {
        $state.go("login");
    };
})
