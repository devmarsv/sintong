<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="boardError.jsp" %>
<%@ page import="notice.model.vo.Notice, java.util.*, java.sql.Date" %>
<%
	Notice notice = (Notice)request.getAttribute("notice");
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
		<div id="list_name">공지사항</div>
		<br>
		
		<table id="title_form">
			<tr>
				<th id="form_title">제목</th>
				<td colspan="3" id="form_content"><%= notice.getNoticeTitle() %></td>
			</tr>
			<tr>
				<th id="form_title">작성자</th>
				<td colspan="3" id="form_content"><%= notice.getMemUserid() %></td>
			</tr>
			<tr>
				<th id="form_title">작성일</th>
				<td id="form_content"><%= notice.getNoticeDate() %></td>
				<th id="form_title">조회수</th>
				<td id="form_content"><%= notice.getNoticeReadCount() %></td>
			</tr>
			<tr>
				<td colspan="4" id="board_content"><%= notice.getNoticeContent() %></td>
			</tr>
			<tr>
				<th id="form_title">첨부파일</th>
				<td colspan="3" id="form_content">
					<% if(notice.getNoticeImg() == null){ %>
						첨부파일 없음
					<% } else { %>
						<a href="/semi/bfdown?file=<%= notice.getNoticeImg() %>">
					<%= notice.getNoticeImg() %></a>
					<% } %>
				</td>
			</tr>
		</table>

		<div id="list_button">
			<button type="button" id="button_border">
				<a href="/semi/blist" id="button_title">목록</a>
			</button>
		</div>

	</div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>