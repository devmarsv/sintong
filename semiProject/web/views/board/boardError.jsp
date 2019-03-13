<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardError</title>
</head>
<body>
<% if(exception != null){ %>
에러 : <%= exception.getMessage() %><br>
<% } %>
<% if(request.getAttribute("message") != null) { %>
<%= request.getAttribute("message") %>
<% } %>
<a href="/semi/blist">고객센터 메인페이지로 이동</a>
</body>
</html>