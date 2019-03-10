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
			<!-- 매장 현황 -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-success shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-success text-uppercase mb-1">매장 현황</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">33개</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-calendar fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!-- 오늘의 신규 매장 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-success shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-success text-uppercase mb-1">오늘의 신규 매장 현황</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">1개</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-calendar fa-2x text-gray-300"></i>
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
											<button class="btn btn-default dropdown-toggle"
												id="dropoption" data-toggle="dropdown" aria-expanded="true">검색옵션</button>
											<div class="dropdown-menu">
												<a class="dropdown-item" href="#">매장명</a>
												<a class="dropdown-item" href="#">점주명</a>
												<a class="dropdown-item" href="#">매장 전화번호</a>
												<a class="dropdown-item" href="#">매장주소</a>
											</div> 
										</div>
									</td>
									<td width="60%">
										<input type="text" class="form-control"	aria-describedby="inputForm" id="searchoption">
									</td>
								</tr>
								
								<tr>
									<th>입점일</th>
									<td colspan="2">
										<input type="text" class="form-control"	aria-describedby="inputForm" id="entryDate1">
										~
										<input type="text" class="form-control"	aria-describedby="inputForm" id="entryDate2">
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

		<!-- 검색결과 area -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">조회 결과</h6>
			</div>
			<div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>매장코드</th>
                      <th>매장명</th>
                      <th>점주명</th>
                      <th>전화번호</th>
                      <th>매장위치</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>사과왕</td>
                      <td>홍사과</td>
                      <td>01044443333</td>
                      <td>1구역 25번</td>
                    </tr>
                  </tbody>
                </table>
              </div>
          
			</div>
		</div>
		<!-- 검색결과 area -->
	</div>
	<!-- container -->

	<%@ include file="../common/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
