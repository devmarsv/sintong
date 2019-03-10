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
		
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">매장 정보 입력</h6>
			</div>
			
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">매장명</th>
								<td>
									<input type="text" class="form-control"	aria-describedby="inputForm">
								</td>
							</tr>
							<tr>
								<th width="20%">점주명</th>
								<td>
									<a href="#" class="btn btn-info btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">회원 검색</span>
									</a>
								</td>
							</tr>
							<tr>
								<th width="20%">매장위치</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm"></td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">완료</span>
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
