<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="admin.member.model.vo.Member" %>
<%
	Member member = (Member) request.getAttribute("member");
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
			<h1 class="h3 mb-0 text-gray-800" id="head">회원상세정보</h1>
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
								<td><%=member.getMemName() %></td>
							</tr>
							<tr>
								<th width="20%">아이디</th>
								<td><%=member.getMemUserId() %></td>
							</tr>
							<tr>
								<th width="20%">생년월일</th>
								<td><%=member.getMemBirth() %></td>
							</tr>
							<tr>
								<th width="20%">전화번호</th>
								<td><%=member.getMemTel() %></td>
							</tr>
							<tr>
								<th width="20%">이메일</th>
								<td><%=member.getMemEmail() %></td>
							</tr>
							<tr>
								<th width="20%">회원등급</th>
								<td><%=member.getMemGrade() %></td>
							</tr>
							<tr>
								<th width="20%">성별</th>
								<td><%=member.getMemGender() %></td>
							</tr>
							<tr>
								<th width="20%">주소1</th>
								<td><%=member.getMemAddr1() %></td>
							</tr>
							<tr>
								<th width="20%">주소2</th>
								<td><%=member.getMemAddr2() %></td>
							</tr>
							<tr>
								<th width="20%">회원가입일</th>
								<td><%=member.getMemEnrollDate() %></td>
							</tr>
							<tr>
								<th width="20%">총 적립금</th>
								<td><%=member.getMemPointNum() %> 원</td>
							</tr>
							<tr>
								<th width="20%">총 쿠폰수</th>
								<td><%=member.getMemCouponNum() %> 장</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="/semi/mmodify?userid=<%=member.getMemUserId() %>" class="btn btn-success btn-icon-split">
										<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
										<span class="text">수정</span>
									</a> &nbsp; &nbsp;
									<a href="#"	class="btn btn-danger btn-icon-split">
										<span class="icon text-white-50"> <i class="fas fa-trash"></i></span>
										<span class="text">회원 삭제</span>
									</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>

			</div>
			
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">구매 정보</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"	cellspacing="0">
						<thead>
							<tr>
								<th>주문번호</th>
								<th>주문일시</th>
								<th>주문상품</th>
								<th>결제금액</th>
								<th>결제상태</th>
								<th>배달상태</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>2019-03-04</td>
								<td>사과, 배 외 2 개</td>
								<td>30000 원</td>
								<td>결제완료</td>
								<td>배달완료</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">문의 및 후기 내역</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"	cellspacing="0">
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>문의내용</th>
								<th>답변내용</th>
								<th>작성일시</th>
								<th>글 종류</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>배달관련 문의</td>
								<td>강남구 배달 되나요?</td>
								<td>넹 되요</td>
								<td>2019-03-04</td>
								<td>상품 문의</td>
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
