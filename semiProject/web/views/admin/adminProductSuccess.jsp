<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
</head>
<body>
<div class="container">
	<div class="d-sm-flex align-items-center justify-content-between mb-4">
		<h1 class="h3 mb-0 text-gray-800" id="head">
		<% if(request.getAttribute("message") != null){ %>
		<%= request.getAttribute("message") %>
		<% } %>
		<a href="/semi/views/admin/adminProduct.jsp">상품관리 첫 페이지로 이동</a>
		</h1>
	</div>
</div>
</body>
</html>