var dotest = function(){
	var param = {'key':'abc','name':'lisi'};
	var param2 = {'key':'abc','name':'zsan'};
	var url = './test1';
	$ajax(param,url);
	$ajax(param2,url);
}
var dotestHashMap = function(){
	var param = {'key':'abc','name':'lisi'};
	var param2 = {'key':'abc','name':'zsan'};
	var url = './testHashMap';
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
var init = function(){
	$.ajax({
		type:'post',
		url:'./init',
		dataType:'text',
		success:function(data){
			alert(data);
		}
	})
}