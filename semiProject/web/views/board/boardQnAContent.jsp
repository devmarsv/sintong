<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./boardError.jsp"%>
<%@ page import="QNA.model.vo.QNA, java.util.*, java.sql.Date" %>
<%
	QNA qna = (QNA)request.getAttribute("qna");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="../common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/board.css" />
	</head>
	<body>
		<%@ include file="boardHead.jsp" %>
	<div class="container">
		
		<div id="list_name">QnA</div>
		<br>
		
		<table id="title_form">
			<tr>
				<th id="form_title">제목</th>
				<td colspan="3" id="form_content"><%= qna.getQnaTitle() %></td>
			</tr>
			<tr>
				<th id="form_title">작성자</th>
				<td colspan="3" id="form_content"><%= qna.getQnaQid() %></td>
			</tr>
			<tr>
				<th id="form_title">작성일</th>
				<td id="form_content"><%= qna.getQnaDate() %></td>
				<th id="form_title">답변여부</th>
				<td id="form_content"><%= qna.getQnaAnsYN() %></td>
			</tr>
			<tr>
				<td colspan="4" id="board_content-1"><%= qna.getQnaQcontent() %></td>
			</tr>
			<tr>
				<td colspan="2" id="form_title">답변 내용입니다.</td>
				<th id="form_title">작성자</th><td id="form_content"><%= qna.getQnaAid() %></td>
			</tr>
			<tr>
				<td colspan="4" id="board_content-2"><%= qna.getQnaAcontent() %></td>
			</tr>
		</table>

		<div id="list_button">
			<button type="button" id="button_border">
				<a href="/semi/qlist" id="button_title">목록</a>
			</button>
		</div>

	</div>
	<%@ include file="../common/footer.jsp" %>
	</body>
</html>