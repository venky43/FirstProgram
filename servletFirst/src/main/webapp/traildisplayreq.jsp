<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%=session.getAttribute("id") %></h1>
<h1><%=session.getAttribute("name") %></h1>
<h1><%=session.getAttribute("email") %></h1>
 <%String clas1 = (String)request.getAttribute("class"); %>
 <%out.write(clas1); %>
 <% response.getWriter(); %> 
</body>
</html>