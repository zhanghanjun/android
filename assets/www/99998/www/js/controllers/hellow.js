angular.module('controllers', [])

.controller('hellowCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
	$scope.hellow='Hellow,welcome to angularjs';
})

