<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="./mypageError.jsp" import="member.model.vo.Member, point.model.vo.Point"%>
<%
	Member member = (Member)request.getAttribute("member");
	int totalP = (Integer)request.getAttribute("totalpoint");
	int totalC = (Integer)request.getAttribute("totalcoupon");
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
	
				<table class="table table-bordered">
					<tr>
						<th width="35%" style="text-align:center;vertical-align:middle;">
							<img src="/semi/resources/images/user.png" width="100">
							<p style="margin-top:10px;"><b style="font-weight:bold;"><%= member.getMemName() %></b> 님</p>
						</th>
						<td width="65%" style="vertical-align:middle;">
							<table class="table" style="margin-bottom:0;">
								<tr>
									<th width="30%" style="text-align:center;background:#edf1f5;">아이디</th>
									<td width="70%"><%= member.getMemUserid() %></td>
								</tr>
								<tr>
									<th style="text-align:center;background:#edf1f5;">생일</th>
									<td><%= member.getMemBirth() %></td>
								</tr>
								<tr>
									<th style="text-align:center;background:#edf1f5;">성별</th>
									<td>
										<% if(member.getMemGender().equals("F")){ %>
											여자
										<% } else { %>
											남자
										<% } %>
									</td>
								</tr>
								<tr>
									<th style="text-align:center;background:#edf1f5;">가입일</th>
									<td><%= member.getMemEnrolldate() %></td>
								</tr>
								<tr>
									<th style="text-align:center;background:#edf1f5;">등급</th>
									<td><%= member.getGrade() %></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table class="table">
					<tr style="background:#c9d3dd;">
						<td align="center" width="50%"><i class="fas fa-coins"></i> 포인트 <b style="font-weight:bold;"><%= totalP %></b> P</td>
						<td align="center" width="50%"><i class="fas fa-money-check-alt"></i> 쿠폰 <b style="font-weight:bold;"><%= totalC %></b> 장</td>
					</tr>
				</table>
				
				<table class="table table-bordered">
					<tr>
						<th>전화번호</th>
						<td><%= member.getMemTel() %></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><%= member.getMemEmail() %></td>
					</tr>
					<tr>
						<th>주소</th>
						<td><%= member.getMemAddr1() %></td>
					</tr>
					<% if(member.getMemAddr2() != null) { %>
					<tr>
						<th>추가 주소</th>
						<td><%= member.getMemAddr2() %></td>
					</tr>
					<% } %>
				</table>
			</section>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>