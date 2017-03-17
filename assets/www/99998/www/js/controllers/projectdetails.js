angular.module('controllers')
.controller('projectdetailsCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
		 $(".bar-stable").hide();
		 $('.projectdetails_show1').hide();
		 $('.projectdetails_show2').hide();
		var tiao = 1;
 		 var aa = $('#div').text();
 		 
 		 if(aa.length>10){
 				var str = aa.substring(0,10);
 				var str1 =str + '...'; 
 				$('#div').text(str1);
 			}

 		$scope.toggle=function(){
 			console.log('触发事件了');
 			
 			if(tiao==1){
 				var heigh = (aa.length/13)*20;
	 			$('.projectdetails_show2').css("height",heigh+'px');
	 			$('.projectdetails_show2').text(aa);

	 			$('.projectdetails_show1').show();
		 		$('.projectdetails_show2').show();

	 			tiao=2;
	 			return;
 			}
 			if(tiao==2){
 				$('.projectdetails_show1').hide();
		 		$('.projectdetails_show2').hide();
		 		tiao=1;
		 		return;
 			}
 			
 			
 			
 			
 		}
})