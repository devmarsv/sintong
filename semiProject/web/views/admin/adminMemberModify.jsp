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
								<td><%=member.getMemUserId() %></td>
							</tr>
							<tr>
								<th width="20%">이름</th>
								<td><%=member.getMemName() %></td>
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
								<td>
									<div class="dropdown">
									    <button class="btn btn-default dropdown-toggle" id="mystatus" type="button" data-toggle="dropdown" aria-expanded="true">
									    등급
									    <span class="caret"></span>
									    </button>
									    <ul id="mytype" class="dropdown-menu" role="menu" aria-labelledby="searchType">
									        <li role="presentation">
									            <a class="dropdown-item" role="menuitem" tabindex="-1" href="#" value="1">1</a>
									        </li>
									        <li role="presentation">
									            <a class="dropdown-item" role="menuitem" tabindex="-1" href="#" value="2">2</a>
									        </li>
									        <li role="presentation">
									            <a class="dropdown-item" role="menuitem" tabindex="-1" href="#" value="3">3</a>
									        </li>
									        <li role="presentation">
									            <a class="dropdown-item" role="menuitem" tabindex="-1" href="#" value="4">4</a>
									        </li>
									        <li role="presentation">
									            <a class="dropdown-item" role="menuitem" tabindex="-1" href="#" value="9">5</a>
									        </li>
									        
									    </ul>
									</div>
								</td>
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
									<a href="/semi/mmodack?grade=" class="btn btn-primary btn-icon-split">
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
	<script type="text/javascript">

		$('#mytype li > a').on('click', function() {
		    // 버튼에 선택된 항목 텍스트 넣기 
		    $('#mystatus').text($(this).text());
		    alert($('#mystatus').text())
		});
	
	</script>
</body>
</html>
