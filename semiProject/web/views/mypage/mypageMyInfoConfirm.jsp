<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
	</head>
	<body>
		<div class="container myContainer myPwCon">
			<h2 class="conTit">개인정보 수정</h2>
			<div id="list_name">비밀번호 확인 <i class="fas fa-lock"></i></div>
			<form action="/semi/pwconfirm" method="post" onsubmit="return checkValidate();">
				<input type="hidden" name="userid" value="<%= loginMember.getMemUserid() %>" />
				<p style="text-align:center;padding:10px 0;">회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한 번 확인합니다.</p>
				<ul>
					<li><span>비밀번호</span></li>
					<li><input type="password" name="userpw" class="form-control" /></li>
					<li><input type="submit" value="확인" class="btn btn-info" /></li>
				</ul>
				<% if(request.getAttribute("message") != null){ %>
					<p class="red"><%= request.getAttribute("message") %></p>
				<% } %>
			</form>
			<div style="text-align:center;padding:20px 0 ;background:#ddd;border-top:1px solid #aaa;">
				<p style="font-size:13px;">회원님의 개인정보를 신중히 취급하며, 회원님의 동의 없이는</p>
				<p style="font-size:13px;">기재하신 회원정보를 공개 및 변경하지 않습니다.</p>
			</div>
		</div>
		</div>
		<%@ include file="../common/footer.jsp" %>
	</body>
</html>