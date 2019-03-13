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
			<h1 class="h3 mb-0 text-gray-800" id="head">회원정보 수정</h1>
		</div>


		<!-- Content -->

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">회원 정보</h6>
			</div>

			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">이름</th>
								<td>kim</td>
							</tr>
							<tr>
								<th width="20%">아이디</th>
								<td>user1</td>
							</tr>
							<tr>
								<th width="20%">생년월일</th>
								<td>000000</td>
							</tr>
							<tr>
								<th width="20%">전화번호</th>
								<td>01044443333</td>
							</tr>
							<tr>
								<th width="20%">회원등급</th>
								<td>
									<div class="dropdown">
											<button class="btn btn-default dropdown-toggle"	id="dropoption" data-toggle="dropdown" aria-expanded="true">등급</button>
											<div class="dropdown-menu">
												<a class="dropdown-item" href="#">1</a>
												<a class="dropdown-item" href="#">2</a>
												<a class="dropdown-item" href="#">3</a>
											</div> 
										</div>
								</td>
							</tr>
							<tr>
								<th width="20%">성별</th>
								<td>남</td>
							</tr>
							<tr>
								<th width="20%">주소1</th>
								<td>서울시 강남구</td>
							</tr>
							<tr>
								<th width="20%">주소2</th>
								<td></td>
							</tr>
							<tr>
								<th width="20%">회원가입일</th>
								<td>2019년 3월 4일</td>
							</tr>
							<tr>
								<th width="20%">총 적립금</th>
								<td>12,300원</td>
							</tr>
							<tr>
								<th width="20%">총 쿠폰수</th>
								<td>3장</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-primary btn-icon-split">
										<span class="icon text-white-50"> <i class="fas fa-check"></i></span>
										<span class="text">수정완료</span>
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
