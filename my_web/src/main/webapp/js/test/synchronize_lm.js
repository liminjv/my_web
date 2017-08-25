var dotest = function(){
	var param = {'key':'abc'};
	var param2 = {'key':'abcd'};
	var url = './test1';
	$ajax(param,url);
	$ajax(param2,url);
}
var dotestValue = function(){
	var param = {'keys':'xyz','value':'ssh'};
	var param2 = {'keys':'xyzz','value':'ssh'};
	var url = './test2';
	$ajax(param,url);
	$ajax(param2,url);
}
var dotestInteger = function(){
	var param = {'keys':'xyz','value':8989};
	var param2 = {'keys':'xyzz','value':8989};
	var url = './test3';
	$ajax(param,url);
	$ajax(param2,url);
}
var dotest4 = function(){
	var param = {'value':8989};
	var param2 = {'value':8989};
	var url = './test4';
	$ajax(param,url);
	$ajax(param2,url);
}
var $ajax = function(param,url){
	$.ajax({
		data:param,
		type:'post',
		url:url,
		dataType:'json',
		success:function(data){
			console.info(data);
		}
	})
}
