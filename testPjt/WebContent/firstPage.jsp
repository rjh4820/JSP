<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<p> firstPage </p>
		<%
			response.sendRedirect("secondPage.jsp");
		%>
</body>
</html>