<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원서비스 에러</title>
	</head>
	<body>
		<h2>회원 서비스</h2>
		<h3>
			<% if(exception != null) { %>
				예외 발생 : <%= exception.getMessage() %>
			<% } %>
			<% if(request.getAttribute("message") != null) { %>
				<%= request.getAttribute("message") %>
			<% } %>
		</h3>
		<a href="/semi">시작페이지로 이동<</a>
	</body>
</html>