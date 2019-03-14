<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="boardError.jsp" %>
<%@ page import="event.model.vo.Event, java.util.*, java.sql.Date" %>
<%
	Event event = (Event)request.getAttribute("event");
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
		
			<div id="list_name">이벤트</div>
			<br>
			
			<table id="title_form">
				<tr>
					<th id="form_title">제목</th>
					<td colspan="3" id="form_content"><%= event.getEventTitle() %></td>
				</tr>
				<tr>
					<th id="form_title">작성자</th>
					<td colspan="3" id="form_content"><%= event.getMemUserid() %></td>
				</tr>
				<tr>
					<th id="form_title">작성일</th>
					<td id="form_content"><%= event.getEventDate() %></td>
					<th id="form_title">조회수</th>
					<td id="form_content"><%= event.getEventReadCount() %></td>
				</tr>
				<tr>
					<td colspan="4" id="board_content"><%= event.getEventContent() %></td>
				</tr>
				<tr>
					<th id="form_title">첨부파일</th>
					<td colspan="3" id="form_content">
						<% if(event.getEventImg() == null) { %>
							첨부파일 없음
						<% } else { %>
							<a href="/semi/efdown?file=<%= event.getEventImg() %>">
							<%= event.getEventImg() %></a>
						<% } %>
					</td>
				</tr>
			</table>
			
			<div id="list_button">
				<button type="button" id="button_border"><a href="/semi/elist" id="button_title">목록</a></button>
			</div>
		</div>
	<%@ include file="../common/footer.jsp" %>
	</body>
</html>