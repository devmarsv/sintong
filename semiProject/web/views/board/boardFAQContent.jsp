<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="boardError.jsp" %>
<%@ page import="FAQ.model.vo.FAQ, java.util.*, java.sql.Date" %>
<%
	FAQ faq = (FAQ)request.getAttribute("faq");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/header.jsp"%>
<link rel="stylesheet" href="/semi/resources/css/board.css" />
</head>
<body>
	<%@ include file="boardHead.jsp"%>
	<div class="container">
		<div id="list_name">FAQ</div>

		<br>
		<table id="title_form">
			<tr>
				<th id="form_title">제목</th>
				<td colspan="3" id="form_content"><%= faq.getFaqTitle() %></td>
			</tr>
			<tr>
				<th id="form_title">작성자</th>
				<td colspan="3" id="form_content"><%= faq.getMemUserid() %></td>
			</tr>
			<tr>
				<th id="form_title">작성일</th>
				<td id="form_content"><%= faq.getFaqDate() %></td>
				<th id="form_title">조회수</th>
				<td id="form_content"><%= faq.getFaqReadCount() %></td>
			</tr>
			<tr>
				<td colspan="4" id="board_content-1"><%= faq.getFaqContent() %></td>
			</tr>
			<tr>
				<td colspan="4" id="board_content-2"><%= faq.getFaqReplyContent() %></td>
			</tr>
		</table>

		<div id="list_button">
			<button type="button" id="button_border">
				<a href="/semi/flist" id="button_title">목록</a>
			</button>
		</div>

	</div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>