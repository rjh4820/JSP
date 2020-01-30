<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String m_name;
		String m_password;
		String[] m_hobby;
	%>
	<%
		m_name = request.getParameter("m_name");
		m_password = request.getParameter("m_pass");
		m_hobby = request.getParameterValues("m_hobby");
	%>
	
	이름: <%= m_name %> <br>
	비밀번호: <%= m_password %> <br>
	취미: <% for(String str : m_hobby){ %> <%= str %> <% } %>
</body>
</html>