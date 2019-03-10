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
			<h1 class="h3 mb-0 text-gray-800" id="head">대쉬보드</h1>
		</div>

		<!-- Content Row -->
		<div class="row">
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-primary shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">일 주문금액</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">1,236,000원</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-primary shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">월 주문금액</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">37,336,000원</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 오늘의 신규 상품 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-primary shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">결제대기 금액</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">36,000원</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- Content Row -->

		<!-- 검색옵션 설정 -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">검색</h6>
			</div>
			<div class="card-body">
				<div class="text-left">
					<div class="table-responsive">
						<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
							<tbody>
								<tr>
									<th width="20%">검색어</th>
									<td width="20%">
										<div class="dropdown">
											<button class="btn btn-default dropdown-toggle" id="dropoption" data-toggle="dropdown" aria-expanded="true">검색옵션</button>
											<div class="dropdown-menu">
												<a class="dropdown-item" href="#">주문코드</a>
												<a class="dropdown-item" href="#">주문 상품</a> 
												<a class="dropdown-item" href="#">판매 매장명</a>
												<a class="dropdown-item" href="#">구매자 아이디</a>
											</div>
										</div>
									</td>
									<td width="60%"><input type="text" class="form-control" aria-describedby="inputForm" id="searchoption"></td>
								</tr>

								<tr>
									<th>구매 기간</th>
									<td colspan="2">
										<input type="text" class="form-control" aria-describedby="inputForm" id="entryDate1"> ~
										<input type="text" class="form-control" aria-describedby="inputForm" id="entryDate2">
									</td>
								</tr>
								<tr>
									<th>구매금액</th>
									<td colspan="2">
										<input type="text" class="form-control" aria-describedby="inputForm" id="price1"> ~ 
										<input type="text" class="form-control" aria-describedby="inputForm" id="price2">
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="#" class="btn btn-primary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-check"></i></span>
											<span class="text">전체 검색</span>
										</a> &nbsp; &nbsp;
										<a href="#" class="btn btn-success btn-icon-split">
											<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
											<span class="text">검색</span>
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
				<h6 class="m-0 font-weight-bold text-primary">조회 결과</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
						<thead>
							<tr>
								<th>주문코드</th>
								<th>주문일시</th>
								<th>결제금액</th>
								<th>수령자정보</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>20191111</td>
								<td>2019-03-04</td>
								<td>33,200 원</td>
								<td>kim</td>
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
