<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a=Integer.parseInt(request.getParameter("n1"));
int b=Integer.parseInt(request.getParameter("n2"));
int c=a+b;
out.println("OutPut = "+c);

%>
</body>
</html>