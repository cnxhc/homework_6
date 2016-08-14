<%@page import="com.xhc.bean.Poetries"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示诗词名称</title>
<link rel="stylesheet" type="text/css" href="../css/display.css" />
</head>
<body>
	<%
		List pes = (List) session.getAttribute("poetries");
		System.out.println(pes.size());
		Iterator it = pes.iterator();
	%>
	<div class="context">
		<center>
			<table>
				<tr style="background:#ccccca">
					<td style="width:80px ;text-align: center;">编号</td>
					<td style="width:180px;text-align: center;">作者</td>
					<td style="width:500px;text-align: center;">诗词名</td>
				</tr>
				<%
				int i = 0;
				while (it.hasNext()) {
					Poetries poets = (Poetries) it.next();
			%>
				<tr <%if (i % 2 == 0) {%> bgcolor="#f0f8ff" <%}%>>
					<td style="text-align: center;"><%=i + 1%></td>
					<td style="text-align: center;"><%=session.getAttribute("serach_name")%></td>
					<td style="text-align: center;"><<<%=poets.getTitle()%>>></td>
				</tr>
				<%
				i++;
				}
			%>
			</table>
			<%-- <a href="searchAction!queryByName.action&page=<%=Integer.parseInt(session.getAttribute("page")+"-1")%>">前一页</a>
			<a href="searchAction!queryByName.action&page=<%=Integer.parseInt(session.getAttribute("page")+"+1")%>">前一页</a> --%>
		</center>
	</div>
</body>
</html>