<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="./boardError.jsp" %>
<%@ page import="FAQ.model.vo.FAQ, java.util.ArrayList, java.sql.Date" %>
<%
	ArrayList<FAQ> list = (ArrayList<FAQ>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	String search = request.getAttribute("search").toString();
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
		<div id="list_name">검색결과</div>

		<div>
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th width="10%">번호</th>
						<th width="50%">제목</th>
						<th width="10%">작성자</th>
						<th width="20%">작성일</th>
						<th width="10%">조회수</th>
					</tr>
				</thead>
				<% for(FAQ f : list){ %>
				<tbody>
					<tr id="boardlist">
						<td><%= f.getFaqNo() %></td>
						<td><a href="/semi/fdetail?fno=<%= f.getFaqNo() %>&page=<%= currentPage %>">
						<%= f.getFaqTitle() %></a></td>
						<td><%= f.getMemUserid() %></td>
						<td><%= f.getFaqDate() %></td>
						<td><%= f.getFaqReadCount() %></td>
					</tr>
				</tbody>
				<% } %>
			</table>

			<div class="input-group" id="search_bar">
				<form action="/semi/ftitlesearch?page=<%= currentPage %>" method="post">
					<label>
					<input type="search" class="form-control" placeholder="검색 키워드를 입력하세요" name="serach" id="search_input"></label> 
					<span class="input-group-btn">
						<input class="btn btn-secondary" type="submit" value="검색" id="search_button"></button>
					</span>
				</form>
			</div>

			<!-- Paging 처리 -->

			<div id="paging">
				<ul class="pagination justify-content-center">
				<% if(currentPage <= 1){ %>	
					<li class="page-item"><a class="page-link" href="#"	id="page_num">처음</a></li>
				<% } else { %>
					<li class="page-item"><a class="page-link" href="/semi/ftitlesearch?page=1&search=<%= search %>"	id="page_num">처음</a></li>
				<% } %>
				<% if((currentPage - 10) < startPage && (currentPage - 10) > 1){ %>
					<li class="page-item">
						<a class="page-link" href="/semi/ftitleseatch?page=<%= startPage - 10 %>&search=<%= search %>"	aria-label="Previous" id="page_num">
						<span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span></a>
					</li>
				<% } else { %>
					<li class="page-item">
						<a class="page-link" href="#"	aria-label="Previous" id="page_num">
						<span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span></a>
					</li>	
				<% } %>
				<% for(int p=startPage; p<=endPage; p++) {
						if(p == currentPage) {	
				%>			
					<li class="page-item"><a class="page-link" href="#"	id="page_num"><%= p %></a></li>
				<% } else { %>
					<li class="page-item"><a class="page-link" href="/semi/ftitlesearch?page=<%= p %>&search=<%= search %>"	id="page_num"><%= p %></a></li>
				<% }} %>
				<% if((currentPage + 10) > endPage && (currentPage + 10) < maxPage) { %>
					<li class="page-item">
						<a class="page-link" href="/semi/ftitlesearch?page=<%= endPage + 10 %>&search=<%= search %>"	aria-label="Next" id="page_num">
						<span aria-hidden="true">&raquo;</span>
						<span class="sr-only">Next</span></a>
					</li>
				<% } else { %>
					<li class="page-item">
						<a class="page-link" href="#"	aria-label="Next" id="page_num">
						<span aria-hidden="true">&raquo;</span>
						<span class="sr-only">Next</span></a>
					</li>
				<% } %>
				<% if(currentPage >= maxPage) { %>
					<li class="page-item"><a class="page-link" href="#"	id="page_num">&nbsp;끝&nbsp;</a></li>
				<% } else { %>
					<li class="page-item"><a class="page-link" href="/semi/ftitlesearch?page=<%= maxPage %>&search=<%= search %>"	id="page_num">&nbsp;끝&nbsp;</a></li>
				<% } %>
				</ul>
			</div>
		</div>
	</div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>