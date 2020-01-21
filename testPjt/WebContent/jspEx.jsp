<%@ page import="java.util.ArrayList, java.util.LinkedList" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!
	int num = 10;
	String str = "jsp";
	ArrayList<String> list = new ArrayList<String>();
	LinkedList<String> list2 = new LinkedList<String>();
	public void jspMethod(){
		System.out.println("--jspMethod()--");
	}
	%>
	<%-- <%@ include ~ %> => 동일한 내용의 Header or Footer 파일을 많이 사용할 경우에 이용하면 좋음 --%>
	
</body>
</html>