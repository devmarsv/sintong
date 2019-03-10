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
			<h1 class="h3 mb-0 text-gray-800" id="head">주문상세정보</h1>
		</div>

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">주문 정보</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">주문코드</th>
								<td>2019111111</td>
							</tr>
							<tr>
								<th width="20%">주문일시</th>
								<td>2019-03-04</td>
							</tr>
							<tr>
								<th width="20%">주문금액</th>
								<td>33,200 원</td>
							</tr>
							<tr>
								<th width="20%">수령자정보</th>
								<td>kim</td>
							</tr>
							<tr>
								<th width="20%">배달코드</th>
								<td>Y222</td>
							</tr>
							<tr>
								<th width="20%">판매 매장명</th>
								<td>홍사과</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">삭제</span>
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
