<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="./boardError.jsp" %>
<%@ page import = "java.sql.Date" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/header.jsp"%>
<link rel="stylesheet" href="/semi/resources/css/board.css" />
</head>
<body>
	<%@ include file="boardHead.jsp"%>
	<div class="container">
		<div id="list_name">QnA</div>

		<br>
		<form action="/semi/qwrite" method="post" enctype="multipart/form-data">
			<table id="write_form">
				<tr>
					<th id="form_title">제목</th>
					<td colspan="3" id="form_content"><input type="text" name="btitle"></td>
				</tr>
				<tr>
					<th id="form_title">작성자</th>
					<td colspan="3" id="form_content"><input type="text" name="bwriter"></td>
				</tr>
				<tr>
					<th id="form_title">작성일</th>
					<td colspan="3" id="form_content">sysdate</td>
				</tr>
				<tr>
					<td colspan="4" id="board_content"><textarea cols="100"	rows="20" name="bcontent"></textarea></td>
				</tr>
			</table>
		</form>
			
			<div id="list_button">
				<input type="submit" value="등록" id="button_border">&nbsp;
				<button type="button" id="button_border">
					<a href="/semi/qlist" id="button_title">목록</a>
				</button>
			</div>
		</div>
		<!-- /.container -->

	</div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>