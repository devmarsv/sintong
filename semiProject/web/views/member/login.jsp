<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member"%>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/member.css" />
	</head>
	<body>
		<div class="container">
		    <form action="/semi/login" method="post"><!-- 절대경로임. -->
				<table width="200" cellpadding="0" cellspacing="5" border="0">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<td>암 호</td>
					<td><input type="password" name="userpwd"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="로그인">
					</td>
				</tr>
				</table>
			</form>
		</div>
		<%@ include file="/views/common/footer.jsp" %>
	</body>
</html>