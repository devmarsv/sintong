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
		<div id="list_name">적립금</div>
		
		<h3><%= loginMember.getMemUserid() %> 님의 총 포인트는 <%= totalp %>p 입니다</h3>

		<div>
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr align="center">
						<th width="15%">날짜</th>
						<th width="65%">적립금설명</th>
						<th width="20%">적립금</th>
					</tr>
				</thead>
				<tbody>
					<% for(Point p : list) { %>
						<tr class="boardlist">
							<td><%= p.getPointPublish() %></td>
							<td>
								<% if(p.getPointValue() >= 0) { %>
								<span class="mark">적립</span>
								<% } else { %>
								<span class="mark">사용</span>
								<% } %>
								<%= p.getPointContent() %>
							</td>
							<td>
								<% if(p.getPointValue() >= 0) { %>
								+<%= p.getPointValue() %>
								<% } else { %>
								<%= p.getPointValue() %>
								<% } %>
							</td>
						</tr>
					<% } %>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>