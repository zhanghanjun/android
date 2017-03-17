angular.module('controllers')
.controller('perdataCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
		//返回键
		$scope.cardAapply_back = function () {
			window.homeservice.quit({},function (info) {}, function (error) {});
		}
		//获取滚动区域高度
		var contentHeight = document.body.scrollHeight - 104;
		$("#perdata_scroll").height(contentHeight + "px");
		//是否在职选择，0:选中，1：不选中
		$scope.isonduty = function(a){
			if(a==0){
				$scope.isOnduty=1;
			}else{
				$scope.isOnduty=0;
			}
		}
		//是否提供收入证明，0:在职，1：不在职
		$scope.isincome = function(a){
			if(a==0){
				$scope.isIncome=1;
			}else{
				$scope.isIncome=0;
			}
		}
		//是否提供银行流水，0:选中，1：不选中
		$scope.isbankWater = function(a){
			if(a==0){
				$scope.isBankWater=1;
			}else{
				$scope.isBankWater=0;
			}
		}
		//是否有本地社保，0:选中，1：不选中
		$scope.issecurity = function(a){
			if(a==0){
				$scope.isSecurity=1;
			}else{
				$scope.isSecurity=0;
			}
		}
		//是否有车，0:选中，1：不选中
		$scope.iscar = function(a){
			if(a==0){
				$scope.isCar=1;
			}else{
				$scope.isCar=0;
			}
		}
		//是否有房，0:选中，1：不选中
		$scope.ishouse = function(a){
			if(a==0){
				$scope.isHouse=1;
			}else{
				$scope.isHouse=0;
			}
		}
		//是否同意推荐给信贷经理，0:选中，1：不选中
		$scope.iscontacted = function(a){
			if(a==0){
				$scope.isContacted=1;
			}else{
				$scope.isContacted=0;
			}
		}
		//是否想贷款，0:选中，1：不选中
		$scope.isloan = function(a){
			if(a==0){
				$scope.isLoan=1;
			}else{
				$scope.isLoan=0;
			}
		}
		//是否想办信用卡，0:选中，1：不选中
		$scope.iscreditcard = function(a){
			if(a==0){
				$scope.isCreditcard=1;
			}else{
				$scope.isCreditcard=0;
			}
		}
		var data = {};
		window.memberservice.getMemberInfo(data,
			function (info) {
				if(info.errorCode==0){
					$scope.memberName=info.data.memberName;
					$scope.idCardNo=info.data.idCardNo;
					$scope.isOnduty=info.data.isOnduty;
					$scope.isIncome=info.data.isIncome;
					$scope.isBankWater=info.data.isBankWater;
					$scope.isSecurity=info.data.isSecurity;
					$scope.isCar=info.data.isCar;
					$scope.isHouse=info.data.isHouse;
					$scope.isContacted=info.data.isContacted;
					$scope.isLoan=info.data.isLoan;
					$scope.isCreditcard=info.data.isCreditcard;
				}
			}, function (error) {

			}
		)
		//提交
		$scope.perdataSumbit = function(){
			alert($scope.memberName+","+
			$scope.cellPhone+","+
			$scope.idCardNo+","+
			$scope.memberId+","+
			$scope.email+","+
			$scope.isOnduty+","+
			$scope.isIncome+","+
			$scope.isBankWater+","+
			$scope.isSecurity+","+
			$scope.isCar+","+
			$scope.isHouse+","+
			$scope.isContacted+","+
			$scope.isLoan+","+
			$scope.isCreditcard);
		}
		//$http({
		//    method : 'GET',
		//    url : "http://localhost:8080/MDM-QX-FINANCE/api/member/getMemberInfo",
		//    params : {
		//		"token":"d5856d448e044e52aa52adcc05a4d4ad"
		//    }
		//}).success(function(json){
		//    // 回调函数
		//    if(json.data!=null){
		//        $scope.memberName=json.data.memberName;
		//        //$scope.cellPhone=json.data.cellPhone;
		//        $scope.idCardNo=json.data.idCardNo;
		//		//$scope.memberId=json.data.memberId;
		//		//$scope.email=json.data.email;
		//		$scope.isOnduty=json.data.isOnduty;
		//		$scope.isIncome=json.data.isIncome;
		//		$scope.isBankWater=json.data.isBankWater;
		//		$scope.isSecurity=json.data.isSecurity;
		//		$scope.isCar=json.data.isCar;
		//		$scope.isHouse=json.data.isHouse;
		//		$scope.isContacted=json.data.isContacted;
		//		$scope.isLoan=json.data.isLoan;
		//		$scope.isCreditcard=json.data.isCreditcard;
		//    }
		//}).error(function(json){
		//    //处理响应失败
		//    toaster.pop('warning', null,  '服务器异常', null, 'trustedHtml');
		//});


})