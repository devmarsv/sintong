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
			<h1 class="h3 mb-0 text-gray-800" id="head">상품상세정보</h1>
		</div>

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">상품 정보</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">상품코드</th>
								<td>111</td>
							</tr>
							<tr>
								<th width="20%">상품명</th>
								<td>사과</td>
							</tr>
							<tr>
								<th width="20%">가격명</th>
								<td>5000 원</td>
							</tr>
							<tr>
								<th width="20%">옵션1</th>
								<td></td>
							</tr>
							<tr>
								<th width="20%">옵션2</th>
								<td></td>
							</tr>
							<tr>
								<th width="20%">재고수량</th>
								<td>55</td>
							</tr>
							<tr>
								<th width="20%">상품설명</th>
								<td>영천에서 올라온 금사과</td>
							</tr>
							<tr>
								<th width="20%">상품상세설명</th>
								<td>영천은 사과로 유명한 곳이다.</td>
							</tr>
							<tr>
								<th width="20%">상품이미지</th>
								<td></td>
							</tr>
							<tr>
								<th width="20%">상품리뷰 개수</th>
								<td>50</td>
							</tr>
							<tr>
								<th width="20%">상품문의 개수</th>
								<td>4319</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">수정</span>
									</a> &nbsp; &nbsp;
									<a href="#" class="btn btn-danger btn-icon-split">
										<span class="icon text-white-50"> <i class="fas fa-trash"></i></span>
										<span class="text">상품 삭제</span>
									</a>
								</td>
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
