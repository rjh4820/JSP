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
	<%-- <%@ include ~ %> => ������ ������ Header or Footer ������ ���� ����� ��쿡 �̿��ϸ� ���� --%>
	
</body>
</html>