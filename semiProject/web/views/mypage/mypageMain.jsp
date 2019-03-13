<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="./mypageError.jsp" import="member.model.vo.Member, point.model.vo.Point"%>
<%
	Member member = (Member)request.getAttribute("member");
%>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
		<div class="container myContainer">			
			<section id="myinfo">
				<div>
					<header id="name_hello"><%= member.getMemName() %>님, 안녕하세요!</header>
				</div>
	
				<table id="info_table">
					<tr>
						<td>
							<img src="/semi/resources/images/user.png">
							<h1>
								<%= member.getMemName() %>님의 등급은 <%= loginMember.getGrade() %>입니다.
							</h1>
						</td>
						<td>
							<a href="/semi/views/mypage/mypageCoupon.jsp">
								<h1 id="info_title">나의 쿠폰</h1>
								<span><%= member.getMemCoupon() %>장</span>
							</a>
						</td>
						<td>
							<a href="/semi/views/mypage/mypageCoupon.jsp">
								<h1 id="info_title">나의 적립금</h1>
								<span><%= member.getMemPoint() %>p</span>
							</a>
						</td>
					</tr>
				</table>
			</section>
	
			<section id="order_delivery">
				<h1 id="order_delivery_title">
					주문/배송조회 <a href="mypage_order_delivery.html" id="detail_link">▶자세히
						보기</a>
				</h1>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr align="center">
							<th width="10%">번호</th>
							<th width="50%">쿠폰 이름</th>
							<th width="20%">생성일</th>
							<th width="20%">소멸일</th>
						</tr>
					</thead>
					<tbody>
						<tr id="boardlist">
							<td>예시</td>
							<td>예시</td>
							<td>예시</td>
							<td>예시</td>
						</tr>
					</tbody>
				</table>
	
			</section>
	
			<section id="review">
				<h1 id="order_delivery_title">
					내가 쓴 후기 <a href="mypage_review.html" id="detail_link">▶자세히 보기</a>
				</h1>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr align="center">
							<th width="10%">번호</th>
							<th width="50%">쿠폰 이름</th>
							<th width="20%">생성일</th>
							<th width="20%">소멸일</th>
						</tr>
					</thead>
					<tbody>
						<tr id="boardlist">
							<td>예시</td>
							<td>예시</td>
							<td>예시</td>
							<td>예시</td>
						</tr>
					</tbody>
				</table>
	
			</section>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>