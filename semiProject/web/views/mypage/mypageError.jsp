<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
		<div class="container myContainer">
		<h2>마이페이지 서비스</h2>
		<h3>
			<% if(exception != null){ %>
				<p>예외 발생 : <%= exception.getMessage() %></p>
			<% } %>
			<% if(request.getAttribute("message") != null){ %>
				<p><%= request.getAttribute("message") %></p>
			<% } %>
			<a href="/semi">시작페이지로 이동</a>
		</h3>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>