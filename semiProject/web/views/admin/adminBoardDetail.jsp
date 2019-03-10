<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
</head>

<body>

	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800" id="head">게시판 상세정보</h1>
		</div>

		<!-- 검색옵션 설정 -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">게시판 정보</h6>
			</div>
			<div class="card-body">
				<div class="text-left">
					<div class="table-responsive">
						<table class="table table-bordered" id="dataTable" cellspacing="0">
							<tbody>
								<tr>
									<th width="20%">게시판코드</th>
									<td>b111</td>
								</tr>
								<tr>
									<th width="20%">게시판명</th>
									<td>상품 문의</td>
								</tr>
								<tr>
									<th width="20%">카테고리코드</th>
									<td>3232</td>
								</tr>
								<tr>
									<th width="20%">카테고리명</th>
									<td>질문</td>
								</tr>
								<tr>
									<td colspan="2">
										<a href="#" class="btn btn-success btn-icon-split">
											<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i> </span>
											<span class="text">수정</span>
										</a> &nbsp; &nbsp;
										<a href="#"	class="btn btn-danger btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-trash"></i></span>
											<span class="text">게시판 삭제</span>
										</a>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">글 목록</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"	cellspacing="0">
						<thead>
							<tr>
								<th>게시글 코드</th>
								<th>게시글 제목</th>
								<th>작성자</th>
								<th>답변여부</th>
								<th>작성일</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1112222</td>
								<td>이거뭐에요</td>
								<td>user1</td>
								<td>N</td>
								<td>2019-03-04</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- container -->

	<%@ include file="../common/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
