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
<form action="/semi/mmodack" id="frm" name="frm">
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
								<th width="20%">아이디</th>
								<td name="userid"><input type="text" class="form-control"	aria-describedby="inputForm" name="userid" value="<%=member.getMemUserId() %>"></td>
							</tr>
							<tr>
								<th width="20%">이름</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="name" value="<%=member.getMemName() %>"></td>
							</tr>
							<tr>
								<th width="20%">생년월일</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="birth" value="<%=member.getMemBirth() %>"></td>
							</tr>
							<tr>
								<th width="20%">전화번호</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="tel" value="<%=member.getMemTel() %>"></td>
							</tr>
							<tr>
								<th width="20%">이메일</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="email" value="<%=member.getMemEmail() %>"></td>
							</tr>
							<tr>
								<th width="20%">회원등급</th>
								<td>
									<select class="selectpicker" id="grade" name="grade">
										<option value="null">선택하세요.</option>
										<option value="1">점주</option>
										<option value="2">골드회원</option>
										<option value="3">실버회원</option>
										<option value="4">일반회원</option>
										<option value="9">블랙리스트</option>
									</select>
								</td>
							</tr>
							<tr>
								<th width="20%">성별</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="gender" value="<%=member.getMemGender() %>"></td>
							</tr>
							<tr>
								<th width="20%">주소1</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="addr1" value="<%=member.getMemAddr1() %>"></td>
							</tr>
							<tr>
								<th width="20%">주소2</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="addr2" value="<%=member.getMemAddr2() %>"></td>
							</tr>
							<tr>
								<th width="20%">회원가입일</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="enrolldate" value="<%=member.getMemEnrollDate() %>"></td>
							</tr>
							<tr>
								<th width="20%">총 적립금</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="pointnum" value="<%=member.getMemPointNum() %>"></td>
							</tr>
							<tr>
								<th width="20%">총 쿠폰수</th>
								<td><input type="text" class="form-control"	aria-describedby="inputForm" name="couponnum" value="<%=member.getMemCouponNum() %>"></td>
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
