<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="jspPack.Studentdetails "%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<title>Student List</title>
	<style>
		table, th, td {
		  border: 1px solid black;
		  border-collapse: collapse;
		  padding: 10px;
		}
	</style>
</head>
<body>
	<h1>Student List</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>Address</th>
			</tr>
		</thead>
		<tbody>
			<%List<Studentdetails> l =(List)session.getAttribute("list");%>
			<%for(Studentdetails  s :l){ %>
				<tr>
					<td><%=s.getId() %></td>
					<td><%=s.getName() %></td>
					<td><%=s.getEmail() %></td>
					<td><%=s.getAge() %></td>
					<td><%=s.getAddress() %></td>
					
					<%}; %>
				</tr>
			
		</tbody>
	</table>
</body>
</html>
