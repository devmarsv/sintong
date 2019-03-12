<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="./boardError.jsp" %>
<
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

		<div id="write_button">
			<button type="button" id="button_border">
				<a href="boardQnAWrite.jsp" id="button_title">작성</a>
			</button>
		</div>

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
				<tbody>
					<tr id="boardlist">
						<td>예시</td>
						<td><a href="boardQnAContent.jsp">예시</a></td>
						<td>예시</td>
						<td>예시</td>
						<td>예시</td>
					</tr>
				</tbody>
			</table>

			<div class="input-group" id="search_bar">
				<input type="text" class="form-control" placeholder="검색 키워드를 입력하세요" id="search_input">
				<span class="input-group-btn"><button class="btn btn-secondary" type="button" id="search_button">검색</button></span>
			</div>

			<!-- Paging 처리 -->

			<div id="paging">
				<ul class="pagination justify-content-center">
					<li class="page-item">
						<a class="page-link" href="#" aria-label="Previous" id="page_num">
						<span aria-hidden="true">&laquo;</span><span class="sr-only">Previous</span></a>
					</li>
					<li class="page-item"><a class="page-link" href="#"
						id="page_num">1</a></li>
					<li class="page-item"><a class="page-link" href="#"
						id="page_num">2</a></li>
					<li class="page-item"><a class="page-link" href="#"
						id="page_num">3</a></li>
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Next" id="page_num"> <span aria-hidden="true">&raquo;</span>
							<span class="sr-only">Next</span>
					</a></li>
				</ul>
			</div>
		</div>
	</div>

	<%@ include file="../common/footer.jsp"%>
</body>
</html>