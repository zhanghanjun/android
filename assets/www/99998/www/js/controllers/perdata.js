angular.module('controllers')
.controller('perdataCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
		//���ؼ�
		$scope.cardAapply_back = function () {
			window.homeservice.quit({},function (info) {}, function (error) {});
		}
		//��ȡ��������߶�
		var contentHeight = document.body.scrollHeight - 104;
		$("#perdata_scroll").height(contentHeight + "px");
		//�Ƿ���ְѡ��0:ѡ�У�1����ѡ��
		$scope.isonduty = function(a){
			if(a==0){
				$scope.isOnduty=1;
			}else{
				$scope.isOnduty=0;
			}
		}
		//�Ƿ��ṩ����֤����0:��ְ��1������ְ
		$scope.isincome = function(a){
			if(a==0){
				$scope.isIncome=1;
			}else{
				$scope.isIncome=0;
			}
		}
		//�Ƿ��ṩ������ˮ��0:ѡ�У�1����ѡ��
		$scope.isbankWater = function(a){
			if(a==0){
				$scope.isBankWater=1;
			}else{
				$scope.isBankWater=0;
			}
		}
		//�Ƿ��б����籣��0:ѡ�У�1����ѡ��
		$scope.issecurity = function(a){
			if(a==0){
				$scope.isSecurity=1;
			}else{
				$scope.isSecurity=0;
			}
		}
		//�Ƿ��г���0:ѡ�У�1����ѡ��
		$scope.iscar = function(a){
			if(a==0){
				$scope.isCar=1;
			}else{
				$scope.isCar=0;
			}
		}
		//�Ƿ��з���0:ѡ�У�1����ѡ��
		$scope.ishouse = function(a){
			if(a==0){
				$scope.isHouse=1;
			}else{
				$scope.isHouse=0;
			}
		}
		//�Ƿ�ͬ���Ƽ����Ŵ�����0:ѡ�У�1����ѡ��
		$scope.iscontacted = function(a){
			if(a==0){
				$scope.isContacted=1;
			}else{
				$scope.isContacted=0;
			}
		}
		//�Ƿ�����0:ѡ�У�1����ѡ��
		$scope.isloan = function(a){
			if(a==0){
				$scope.isLoan=1;
			}else{
				$scope.isLoan=0;
			}
		}
		//�Ƿ�������ÿ���0:ѡ�У�1����ѡ��
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
		//�ύ
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
		//    // �ص�����
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
		//    //������Ӧʧ��
		//    toaster.pop('warning', null,  '�������쳣', null, 'trustedHtml');
		//});


})