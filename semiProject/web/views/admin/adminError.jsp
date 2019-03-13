<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin error</title>
</head>
<body>
<h2>관리자 페이지</h2>
<h3>
<% if(exception != null){ %>
예외 발생 : <%= exception.getMessage() %> <br>
<% } %>
<% if(request.getAttribute("message") != null){ %>
<%= request.getAttribute("message") %></h3>
<% } %>
<a href="/semi/views/admin/adminIndex.jsp">관리자 첫 페이지로 이동</a>
</body>
</html>