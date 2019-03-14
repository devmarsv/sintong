<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="point.model.vo.Point, java.util.*"%>
<%
	ArrayList<Point> list = (ArrayList<Point>)request.getAttribute("pointList");
	int totalp = (Integer)request.getAttribute("totalPoint");
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
	<div class="container myContainer">
		<h2 class="conTit">적립금</h2>
		
		<div class="alert alert-info" style="text-align:center;">
			<%= loginMember.getMemName() %> 님의 총 적립금은 <b style="font-weight:bold;font-size:18px;"><i class="fas fa-coins"></i> <%= totalp %> P</b> 입니다
		</div>
		
		<div>
			<table class="table table-hover">
				<thead class="thead-light">
					<tr align="center">
						<th width="15%">날짜</th>
						<th width="65%">적립금설명</th>
						<th width="20%">적립금</th>
					</tr>
				</thead>
				<tbody>
					<% if(list.size() == 0) { %>
					<tr>
						<td colspan=3 align="center" style="padding:80px 0 100px;">
							<p class="far fa-question-circle" style="margin-bottom:10px;display:block;font-size:30px;"></p>
							적립금 내역이 없습니다.
						</td>
					</tr>
					<% } else { %>
					<% for(Point p : list) { %>
						<tr class="boardlist">
							<td align="center" style="vertical-align:middle;"><%= p.getPointPublish() %></td>
							<td align="left" style="vertical-align:middle;">
								<% if(p.getPointValue() >= 0) { %>
								<span class="pmark mPoint">적립</span>
								<% } else { %>
								<span class="pmark mUse">사용</span>
								<% } %>
								<%= p.getPointContent() %>
							</td>
							<td align="center" style="vertical-align:middle;">
								<% if(p.getPointValue() >= 0) { %>
								+<%= p.getPointValue() %>
								<% } else { %>
								<%= p.getPointValue() %>
								<% } %>
							</td>
						</tr>
					<% } %>
					<% } %>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>