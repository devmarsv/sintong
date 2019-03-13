<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="coupon.model.vo.Coupon, java.util.*, java.sql.Date, java.text.SimpleDateFormat"%>
<%
	ArrayList<Coupon> list = (ArrayList<Coupon>)request.getAttribute("couponList");

%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
	<div class="container myContainer">
		<div id="list_name">쿠폰</div>
		
		<h3><%= loginMember.getMemUserid() %> 님의 쿠폰은 <%= list.size() %>장 입니다</h3>

		<div class="couponList">
			<% if(list.size() == 0) { %>
				<div class="noList">쿠폰 내역이 없습니다.</div>
			<% } else { %>
			<% for(Coupon c : list) { %>
				<div class="couponBox ">
					<div class="box">
						<div class="title">
							<span class="tag red">
								<%= c.getCouponValue() %>%
							</span>
						</div>
						<% if(c.getCouponUsed().equals("Y")) { %>
							<div class="used"><span>사용완료</span></div>
						<% } %>
						
						<div class="account">
							<ul>
								<li class="name"><%= c.getCouponName() %></li>
								<li class="date"><%= c.getCouponPublish() %>~<%= c.getCouponExpire() %> 까지</li>
								<li class="condition">
									<em class="crRed">
										<%= c.getCoupontContent() %>
									</em>
								</li>
							</ul>
						</div>
					</div>
				</div>
			<% } %>
			<% } %>
		</div>
	</div>
	</div>
	<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>