<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/header.jsp"%>
<link rel="stylesheet" href="/semi/resources/css/member.css" />
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="/semi/resources/js/juso.js"></script>

</head>
<body>
	<div id="logreg-forms-register" class="container">
		<br>
		<!-- 회원가입 -->
		<form action="/semi/register" class="form-signup" method="post" style="display: block;">
			<!-- 회원가입 폼 -->

			<h1 class="h3 mb-3 font-weight-bold " style="text-align: center">
				회원가입</h1>
			<br>
			<div class="col-sm-12">
				<div class="row">
					<div class="col-sm-6">
						<input type="text" id="userID" name="mem_userid" class="form-control" placeholder="* 아이디는 6~12 글자" required="" autofocus="">
					</div>
					&nbsp;&nbsp;
					<div class="col-sm-2">
						<button class="btn checkId-dtn" id="checkId"
							onclick="return checkId();">
							<span>아이디 중복확인</span>
						</button>
					</div>
				</div>
				
				<input type="password" id="userPwd" name="mem_passwd" class="form-control" placeholder="* 비밀번호" required autofocus="">
				<input type="password" id="userPwd2" name="mem_passwd2" class="form-control" placeholder="* 비밀번호 확인" required autofocus="">
				<input type="text" id="userName" name="mem_name" class="form-control" placeholder="* 이 름" required="" autofocus="">
				<input type="date" id="userBirth" name="mem_birth" class="form-control" placeholder="* 생 일" required="" autofocus="">
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4 ">
							<label name="mem_gender" class="gender">* 성 별 :</label>
						</div>
						&nbsp; &nbsp;
						<div class="col-xs-4 male">
							<input type="radio" name="mem_gender" value="M" required>남</input>
						</div>
						&nbsp; &nbsp;
						<div class="col-xs-4 female">
							<input type="radio" name="mem_gender" value="F" required>여</input>
						</div>
					</div>
				</div>
				<input type="phone" id="phone" name="mem_tel" class="form-control" placeholder="* 핸드폰" required autofocus=""> 
				<input type="email" id="email" name="mem_email" class="form-control" placeholder="* 이메일 주소" required autofocus="">
				
				<input type="text" id="sample6_address" name="mem_addr1" class="form-control" placeholder="* 주 소" required autofocus="">
				<input type="button" onclick="sample5_execDaumPostcode()" value="주소 검색"><br>
				<div id="map" style="width:300px;height:300px;margin-top:10px;display:none"></div>
				<input type="text" id="address2" name="mem_addr1" class="form-control" placeholder="주 소2" autofocus="">
				
			</div>
			<button class="btn btn-primary btn-block" type="submit">
				<i class="fas fa-user-plus"></i> 등 록
			</button>
			<a href="/semi/index.jsp" id="cancel_signup"><i
				class="fas fa-angle-left"></i> 뒤로</a>
		</form>
	</div>
	<%@ include file="/views/common/footer.jsp"%>
</body>
</html>