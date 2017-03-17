angular.module('controllers')

.controller('registerCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	 $(".bar.bar-stable").css("background","red");
 	$scope.back = function() {
        $state.go("login");
    };
})
