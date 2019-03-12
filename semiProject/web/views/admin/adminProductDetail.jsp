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
								<td><%=p.getpNo() %></td>
							</tr>
							<tr>
								<th width="20%">카테고리</th>
								<td><%=p.getpCategory() %></td>
							</tr>
							<tr>
								<th width="20%">상품명</th>
								<td><%=p.getpName() %></td>
							</tr>
							<tr>
								<th width="20%">가격명</th>
								<td><%=p.getpPrice() %> 원</td>
							</tr>
							<tr>
								<th width="20%">옵션1</th>
								<td><%=p.getpOption1() %></td>
							</tr>
							<tr>
								<th width="20%">옵션2</th>
								<td><%=p.getpOption2() %></td>
							</tr>
							<tr>
								<th width="20%">재고수량</th>
								<td><%=p.getpStock() %></td>
							</tr>
							<tr>
								<th width="20%">원산지</th>
								<td><%=p.getpOrigin() %></td>
							</tr>
							<tr>
								<th width="20%">상품설명</th>
								<td><%=p.getpDesc() %></td>
							</tr>
							<tr>
								<th width="20%">상품상세설명</th>
								<td><%=p.getpDetail() %></td>
							</tr>
							<tr>
								<th width="20%">상품이미지</th>
								<td><%=p.getpImg() %></td>
							</tr>
							<tr>
								<th width="20%">상품리뷰 개수</th>
								<td><%=p.getpReviewNum() %></td>
							</tr>
							<tr>
								<th width="20%">상품문의 개수</th>
								<td><%=p.getpQnaNum() %></td>
							</tr>
							<tr>
								<th width="20%">판매매장코드</th>
								<td><%=p.getsNo() %></td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="/semi/pmodify?pno=<%=p.getpNo() %>" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">수정</span>
									</a> &nbsp; &nbsp;
									<a href="/semi/pdelete?pno=<%=p.getpNo() %>" class="btn btn-danger btn-icon-split">
										<span class="icon text-white-50"> <i class="fas fa-trash"></i></span>
										<span class="text">상품 삭제</span>
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
