<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>synchronize测试页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/js/test/synchronize_lm.js"></script>

</head>
<body>
	<div>
		测试synchronize
		<button  onclick="dotest()">锁对象是静态成员变量</button>
		<button  onclick="dotestValue()">锁对象是成员变量</button>
		<button  onclick="dotestInteger()">锁对象是Integer变量</button>
		<button  onclick="dotest4()">测试map并发写入</button>
	</div>
</body>
</html>
