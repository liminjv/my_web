<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="true"%>
<!doctype html>
<html>
<head>
<title>测试001</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/jquery/jquery-1.11.1.min.js"></script>

</head>
<body>
${pageContext.request.contextPath}
	<div>
		1111111111111
		<a href="${pageContext.request.contextPath}" >aaa</a>
		<input value="${pageContext.request.contextPath}">
		<%=request.getContextPath()%>
	</div>
</body>
</html>
