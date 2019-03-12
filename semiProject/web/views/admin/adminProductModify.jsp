<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="admin.product.model.vo.*" %>
<%
	Product p = (Product) request.getAttribute("product");
%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
</head>

<body>
	<form action="/semi/pmodack" id="frm" name="frm">
	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800" id="head">상품상세정보</h1>
		</div>

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">상품 정보</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" cellspacing="0">
						<tbody>
							<tr>
								<th width="20%">상품코드</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="pno" value="<%=p.getpNo() %>"></td>
							</tr>
							<tr>
								<th width="20%">카테고리</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="category" value="<%=p.getpCategory() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품명</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="name" value="<%=p.getpName() %>"></td>
							</tr>
							<tr>
								<th width="20%">가격명</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="price" value="<%=p.getpPrice() %>"></td>
							</tr>
							<tr>
								<th width="20%">옵션1</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="option1" value="<%=p.getpOption1() %>"></td>
							</tr>
							<tr>
								<th width="20%">옵션2</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="option2" value="<%=p.getpOption2() %>"></td>
							</tr>
							<tr>
								<th width="20%">재고수량</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="stock" value="<%=p.getpStock() %>"></td>
							</tr>
							<tr>
								<th width="20%">원산지</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="origin" value="<%=p.getpOrigin() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품설명</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="desc" value="<%=p.getpDesc() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품상세설명</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="detail" value="<%=p.getpDetail() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품이미지</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="img" value="<%=p.getpImg() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품리뷰 개수</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="reviewnum" value="<%=p.getpReviewNum() %>"></td>
							</tr>
							<tr>
								<th width="20%">상품문의 개수</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="qnanum" value="<%=p.getpQnaNum() %>"></td>
							</tr>
							<tr>
								<th width="20%">판매매장코드</th>
								<td><input type="text" class="form-control" aria-describedby="inputForm" name="sno" value="<%=p.getsNo() %>"></td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="#" class="btn btn-primary btn-icon-split" onclick="document.getElementById('frm').submit();">
										<span class="icon text-whisste-50"> <i class="fas fa-check"></i></span>
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
	</form>
</body>
</html>
