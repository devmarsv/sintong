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
			<h1 class="h3 mb-0 text-gray-800" id="head">매장상세정보</h1>
		</div>

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">매장 정보</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">매장코드</th>
								<td>1</td>
							</tr>
							<tr>
								<th width="20%">매장명</th>
								<td>사과왕</td>
							</tr>
							<tr>
								<th width="20%">점주명</th>
								<td>홍사과</td>
							</tr>
							<tr>
								<th width="20%">매장위치</th>
								<td>1구역 25번</td>
							</tr>
							<tr>
								<th width="20%">입점일</th>
								<td>2019년 3월 4일</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">수정</span>
									</a> &nbsp; &nbsp;
									<a href="#" class="btn btn-danger btn-icon-split">
										<span class="icon text-white-50"> <i class="fas fa-trash"></i></span>
										<span class="text">매장 삭제</span>
									</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>

			</div>
		</div>
		
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">매장 상품</h6>
			</div>
			<div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>상품코드</th>
                      <th>상품명</th>
                      <th>가격</th>
                      <th>재고수량</th>
                      <th>원산지</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>11</td>
                      <td>사과</td>
                      <td>5000 원</td>
                      <td>55개</td>
                      <td>영천</td>
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
