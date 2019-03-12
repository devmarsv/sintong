<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
<script type="text/javascript">

	$(function(){
		$.ajax({
			url: "/semi/mcount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.memCount;
				
				console.log("value : " + value);
				
				$("#memcount").html(value);
			},
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //mcount
		
		
		$.ajax({
			url: "/semi/scount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.storeCount;
				
				console.log("value : " + value);
				
				$("#storecount").html(value);
			},
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //scount
		
	}); //document ready
</script>
</head>
<body>
	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">대쉬보드</h1>
		</div>

		<!-- Content Row -->
		<div class="row">

			<!-- 일 주문 금액 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-primary shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">일 주문금액</div>
								<div id="purcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 매장 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-success shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-success text-uppercase mb-1">매장 현황</div>
								<div id="storecount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-calendar fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 오늘 추가 상품 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-info shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-info text-uppercase mb-1">오늘 추가된 상품</div>
								<div class="row no-gutters align-items-center">
									<div class="col-auto">
										<div id="productcount" class="h5 mb-0 mr-3 font-weight-bold text-gray-800"></div>
									</div>
								</div>
							</div>
							<div class="col-auto">
								<i class="fab fa-product-hunt fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 문의 답변대기 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">문의 대기</div>
								<div id="qnacount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-comments fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!-- 회원 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-danger shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">회원수</div>
								<div id="memcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="far fa-user fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 게시판 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-dark shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">게시판 수</div>
								<div id="boardcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-indigo shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">새로운 글 수</div>
								<div id="postcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Content Row -->

	</div>
	<!-- container -->

	<%@ include file="../common/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
