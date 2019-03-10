<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/member.css" />
	</head>
	<body>
		<div class="container">
			<form action="/signup/" class="form-signup" style="display : block;"> <!-- 회원가입 폼 -->
	            <div class="social-login">
	                    <button class="btn naver-btn social-btn" type="button"><span><img id="naverLogo" src="resources/images/naversymbol.png"/>&nbsp; 네이버 아이디로 로그인</span> </button>
	            </div>
	            <div class="social-login">
	                    <button class="btn cacao-btn social-btn" type="button"><span><img id="cacaoLogo" src="resources/images/cacaosymbol.png"/>&nbsp; 카카오 아이디로 로그인</span> </button>
	            </div>
	            
	            <p style="text-align:center">OR</p>
	
	            <input type="text" id="user-name" class="form-control" placeholder="이 름" required="" autofocus="">
	            <input type="email" id="user-email" class="form-control" placeholder="이메일 주소" required autofocus="">
	            <input type="password" id="user-pass" class="form-control" placeholder="비밀번호" required autofocus="">
	            <input type="password" id="user-repeatpass" class="form-control" placeholder="비밀번호 확인" required autofocus="">
	
	            <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> 등 록</button>
	            <a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> 뒤로</a>
	        </form>
        </div>
		<%@ include file="/views/common/footer.jsp" %>
	</body>
</html>