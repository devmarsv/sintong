<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="purchase.model.vo.MyPurchase, java.util.*" %>
<%
	ArrayList<MyPurchase> mypList = (ArrayList<MyPurchase>)request.getAttribute("mypList");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();			
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
		<div class="container myContainer">
			<h2 class="conTit">주문조회(<%= listCount %>)</h2>
			<div>
				<table class="table table-hover">
					<thead>
						<th width="20%" style="text-align:center;">주문번호</th>
						<th width="50%" style="text-align:center;">주문내역</th>
						<th width="15%" style="text-align:center;">주문수량</th>
						<th width="15%" style="text-align:center;">결제금액</th>
					</thead>
					<tbody>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
				
				<!-- Paging 처리 -->
				<% if(mypList.size() > 0) { %>
				<nav aria-label="Page navigation example" style="text-align:center;margin-top:30px;">
				  <ul class="pagination justify-content-center">
				  	<!-- 이전 -->
				    <li class="page-item">
				   	<% if((currentPage - 5) < startPage && (currentPage - 5) > 1){ %>
				      <a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= startPage - 5 %>" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				        <span class="sr-only">Previous</span>
				      </a>
				    <% } else { %>
				      <a class="page-link" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				        <span class="sr-only">Previous</span>
				      </a>
				   	<% } %>
				    </li>
				    <!-- //이전 -->
				    
				   <!-- 페이지 -->
				    <% for(int p = startPage; p <= endPage; p++){ 
				    	if(p == currentPage){
				    %>
				    <li class="page-item active">
				    	<a class="page-link" ><%= p %></a>
				    </li>
					<% } else { %>
					<li class="page-item">
						<a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= p %>"><%= p %></a>
					</li>
					<% }} %>
					<!--// 페이지 -->
					
					<!-- 다음 -->
				    <li class="page-item">
				   <% if((currentPage + 5) > endPage && (currentPage + 5) < maxPage){ %>
				      <a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= endPage + 5 %>" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				        <span class="sr-only">Next</span>
				      </a>
				    <% } else { %>
				      <a class="page-link" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				        <span class="sr-only">Next</span>
				      </a>
				    <% } %>
				    </li>
				    <!-- //다음 -->
				  </ul>
				</nav>
				<% } %>
			</div>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>