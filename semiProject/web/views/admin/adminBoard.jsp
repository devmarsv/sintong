<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
</head>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url: "/semi/ncount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.nCount;
				
				console.log("value : " + value);
				
				$("#noticecount").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //ncount
		
		$.ajax({
			url: "/semi/qcount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.qnaCount;
				
				console.log("value : " + value);
				
				$("#qnacount").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //qcount
		
		$.ajax({
			url: "/semi/fcount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.faqCount;
				
				console.log("value : " + value);
				
				$("#faqcount").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //qcount
	});
</script>

<body>
	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800" id="head">대쉬보드</h1>
		</div>

		<!-- Content Row -->
		<div class="row">
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">공지사항 전체 글 수</div>
								<div id="noticecount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
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
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">문의 수</div>
								<div id="qnacount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
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
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">FAQ 수</div>
								<div id="faqcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
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
									<th>게시판코드</th>
									<td colspan="2"><input type="text" class="form-control" aria-describedby="inputForm"></td>
								</tr>
								<tr>
									<th>게시판명</th>
									<td colspan="2"><input type="text" class="form-control" aria-describedby="inputForm"></td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="#" class="btn btn-primary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-check"></i> </span>
											<span class="text">전체 검색</span></a> &nbsp; &nbsp;
										<a href="#"	class="btn btn-success btn-icon-split">
											<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
											<span class="text">검색</span></a>
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
					<table class="table table-bordered" id="dataTable" width="100%"	cellspacing="0">
						<thead>
							<tr>
								<th>게시판코드</th>
								<th>게시판명</th>
								<th>카테고리코드</th>
								<th>카테고리명</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>b111</td>
								<td>상품 문의</td>
								<td>3232</td>
								<td>질문</td>
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
