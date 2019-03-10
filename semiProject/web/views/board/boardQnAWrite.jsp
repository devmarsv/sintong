<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					<td colspan="3" id="form_content">기본날짜</td>
				</tr>
				<tr>
					<td colspan="4" id="board_content"><textarea cols="100"	rows="20" name="bcontent"></textarea></td>
				</tr>
				<tr>
					<th id="form_title">파일첨부</th>
					<td colspan="3" id="form_content"><input type="file" name="upfile"></td>
				</tr>
			</table>

			<div id="list_button">
				<input type="submit" value="등록" id="button_border">&nbsp;
				<button type="button" id="button_border">
					<a href="board_QnA.html" id="button_title">목록</a>
				</button>
			</div>
		</div>
		<!-- /.container -->

	</div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>