angular.module('controllers')
	
.controller('applyCtrl', function ($scope, $http,$compile, $state, $BK, toaster, $timeout) {
 		$scope.position='保存';
 			$(".bar-stable").hide();
 			$('.phone').blur(function(){
 				var phone = $('#phone').val();
 	     		 var myreg = /^1(3|4|5|7|8)\d{9}$/; 
 	     		 console.log(1234);
 	     		if(!myreg.test(phone)){
 	     			console.log(123456789);
 	     		}
 			});
 	    //住宅地址选择控件
        var area1 = new LArea();
    	area1.init({
     	 'trigger': '#apply_taddress', //触发选择控件的文本框，同时选择完毕后name属性输出到该位置
      	'valueTo': '#locationvalue', //选择完毕后id属性输出到该位置
      	'keys': {
        id: 'id',
        name: 'name'
      }, //绑定数据源相关字段 id对应valueTo的value属性输出 name对应trigger的value属性输出
     	 'type': 1, //数据源类型
     	 'data': LAreaData //数据源
    });
    	var LAreaData1 = [{
         "id": "2",
         "name": "一级",
         "child": [{
              "id": "21",
              "name": "二级1",
              "child": [{
                  "id": "211",
                  "name": "三级1"
             }, {
                 "id": "212",
                 "name": "三级2"
             }, {
                 "id": "213",
                 "name": "三级3"
             }]
         }, {
             "id": "22",
             "name": "二级2"
         }, {
             "id": "23",
             "name": "二级3"
         }]
     }];
      //单位地址选择控件
        var area1 = new LArea();
    	area1.init({
     	 'trigger': '#apply_taddress1', //触发选择控件的文本框，同时选择完毕后name属性输出到该位置
      	'valueTo': '#locationvalue1', //选择完毕后id属性输出到该位置
      	'keys': {
        id: 'id',
        name: 'name'
      }, //绑定数据源相关字段 id对应valueTo的value属性输出 name对应trigger的value属性输出
     	 'type': 1, //数据源类型
     	 'data': LAreaData //数据源
    });
    	var LAreaData1 = [{
         "id": "2",
         "name": "一级",
         "child": [{
              "id": "21",
              "name": "二级1",
              "child": [{
                  "id": "211",
                  "name": "三级1"
             }, {
                 "id": "212",
                 "name": "三级2"
             }, {
                 "id": "213",
                 "name": "三级3"
             }]
         }, {
             "id": "22",
             "name": "二级2"
         }, {
             "id": "23",
             "name": "二级3"
         }]
     }];
    // area1.value=[1,13,3];//控制初始位置，注意：该方法并不会影响到input的value
})