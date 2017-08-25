<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>ConcurrentMap测试页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/js/test/concurrentMap.js"></script>

</head>
<body>
	<div>
		测试map
		<button  onclick="dotest()">测试多个请求</button>
		<button  onclick="dotestHashMap()">测试多个请求HashMap</button>
		<button onclick="init()">初始化map集合</button>
	</div>
</body>
</html>
