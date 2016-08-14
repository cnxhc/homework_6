<%@page import="com.xhc.bean.Poetries"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过诗词名句，搜索诗词名称、作者、诗词内容</title>
<link rel="stylesheet" type="text/css" href="../css/display.css" />
</head>
<body>
	<%
		List pes = (List) session.getAttribute("poetries");
		Iterator it = pes.iterator();
	%>
	<div class="context">
		<center>
			<table>
				<tr style="background:#ccccca">
					<td style="width:80px ;text-align: center;">编号</td>
					<td style="width:80px;text-align: center;">作者</td>
					<td style="width:150px;text-align: center;">诗词名称</td>
					<td style="text-align: center;">诗词内容</td>
				</tr>
				<%
					int i = 0;
					while (it.hasNext()) {
						Poetries poets = (Poetries) it.next();
				%>
				<tr <%if (i % 2 == 0) {%> bgcolor="#f0f8ff" <%}%>>
					<td style="text-align: center;"><%=i + 1%></td>
					<td style="text-align: center;"><%=poets.getName()%></td>
					<td style="text-align: center;"><<<%=poets.getTitle()%>>></td>
					<td style="text-align: center;"><%=poets.getContent()%></td>
				</tr>
				<%
					i++;
					}
				%>
			</table>
		</center>
	</div>
</body>
</html>