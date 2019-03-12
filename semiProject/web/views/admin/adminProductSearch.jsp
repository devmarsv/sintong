<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, admin.product.model.vo.Product" %>
<%
	ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url: "/semi/pcount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.proCount;
				
				console.log("value : " + value);
				
				$("#procount").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //pcount
		
	});
</script>
</head>
<body>
<form action="/semi/psearch" id="frm" name="frm">
	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800" id="head">대쉬보드</h1>
		</div>

		<!-- Content Row -->
		<div class="row">
			<!-- 매장 현황 -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-info shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-info text-uppercase mb-1">전체 상품 수
								</div>
								<div class="row no-gutters align-items-center">
									<div class="col-auto">
										<div id="procount" class="h5 mb-0 mr-3 font-weight-bold text-gray-800"></div>
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


			<!-- 오늘의 신규 상품 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-success shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-success text-uppercase mb-1">뭘 넣을까?
									</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="fab fa-product-hunt fa-2x text-gray-300"></i>
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
										<select class="selectpicker" id="soption" name="soption">
											<option value="null">선택하세요.</option>
											<option value="pno">상품번호</option>
											<option value="pname">상품명</option>
											<option value="pstock">재고 수(이하)</option>
										</select>
									</td>
									<td width="60%"><input type="text" class="form-control"	aria-describedby="inputForm" id="keyword" name="keyword"></td>
								</tr>
								<tr>
									<th>가격</th>
									<td colspan="2">
										<select class="selectpicker" id="price" name="price">
											<option value="null">이하</option>
											<option value="5000">5000</option>
											<option value="10000">10000</option>
											<option value="30000">30000</option>
											<option value="50000">50000</option>
										</select>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="/semi/plist" class="btn btn-primary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-check"></i></span>
											<span class="text">전체 조회</span>
										</a> &nbsp; &nbsp;
										<a href="#" class="btn btn-success btn-icon-split" onclick="document.getElementById('frm').submit();">
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
                      <th>상품번호</th>
                      <th>상품명</th>
                      <th>판매 매장번호</th>
                      <th>원산지</th>
                      <th>재고</th>
                    </tr>
                  </thead>
                  <tbody>
                    <% if(list != null) { %>
                    <% for(Product p : list) { %>
                    <tr>
                     	<td><a href="/semi/mdetail?pno=<%=p.getpNo()%>"><%= p.getpNo() %></a></td>
                     	<td><%= p.getpName() %></td>
                     	<td><%= p.getsNo() %></td>
                     	<td><%= p.getpOrigin() %></td>
                     	<td><%= p.getpStock() %></td>
                    </tr>
                    <% } 
                    } %>
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
	</form>
</body>
</html>
