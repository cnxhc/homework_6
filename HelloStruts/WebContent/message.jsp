<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.xhc.bean.User"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
	<div id="div_bg">
		<div id="div_context">
			<%
				User user = (User) session.getAttribute("user");
			%>
			欢迎：<%=user.getUsername()%>登录！<br>
			<a href="login.jsp">返回主页</a>
		</div>
	</div>

</body>
</html>