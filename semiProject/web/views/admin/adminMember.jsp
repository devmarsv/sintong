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

			<!-- 회원 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">회원수</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">607</div>
							</div>
							<div class="col-auto">
								<i class="far fa-user fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!-- 오늘의 신규 회원 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">신규 회원</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">5</div>
							</div>
							<div class="col-auto">
								<i class="far fa-user fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- Content Row -->

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
												<a class="dropdown-item" href="#">아이디</a>
												<a class="dropdown-item" href="#">이름</a>
												<a class="dropdown-item" href="#">이메일</a>
												<a class="dropdown-item" href="#">전화번호</a>
											</div> 
										</div>
									</td>
									<td width="60%"><input type="text" class="form-control"	aria-describedby="inputForm" id="searchoption"></td>
								</tr>
								<tr>
									<th width="20%">회원등급</th>
									<td width="20%" colspan="2">
										<div class="dropdown">
											<button class="btn btn-default dropdown-toggle" id="dropoption" data-toggle="dropdown" aria-expanded="true">등급</button>
											<div class="dropdown-menu">
												<a class="dropdown-item" href="#">1</a>
												<a class="dropdown-item" href="#">2</a>
												<a class="dropdown-item" href="#">3</a>
											</div> 
										</div>
									</td>
								</tr>
								<tr>
									<th>회원가입일</th>
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
										</a>&nbsp; &nbsp;
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
				<!-- DataTales Example -->
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>이름</th>
                      <th>아이디</th>
                      <th>생년월일</th>
                      <th>전화번호</th>
                      <th>회원등급</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>kim</td>
                      <td>user1</td>
                      <td>000000</td>
                      <td>01044443333</td>
                      <td>1</td>
                    </tr>
                    <tr>
                      <td>lee</td>
                      <td>user2</td>
                      <td>001201</td>
                      <td>01044223333</td>
                      <td>1</td>
                    </tr>
                    <tr>
                      <td>hong</td>
                      <td>user3</td>
                      <td>881203</td>
                      <td>01047773333</td>
                      <td>2</td>
                    </tr>
                    <tr>
                      <td>lee2</td>
                      <td>user4</td>
                      <td>600115</td>
                      <td>01043112331</td>
                      <td>3</td>
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
