<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/member.css" />
	</head>
	<body>
		<div id="logreg-forms" class="container">
		    <form class="form-signin"> <!--로그인 폼-->
		        <h1 class="h3 mb-3 font-weight-bold " style="text-align: center"> 로그인</h1>
		        <div class="social-login">
		            <button class="btn naver-btn social-btn" type="button"><span><img id="naverLogo" src="resources/images/naversymbol.png"/>&nbsp; 네이버 아이디로 로그인</span> </button>
		            <button class="btn cacao-btn social-btn" type="button"><span><img id="cacaoLogo" src="resources/images/cacaosymbol.png"/>&nbsp; 카카오 아이디로 로그인</span> </button>
		        </div>
		        <p style="text-align:center"> OR  </p>
		        <input type="email" id="inputEmail" class="form-control" placeholder="이메일 입력" required="" autofocus="">
		        <input type="password" id="inputPassword" class="form-control" placeholder="비밀번호 입력" required="">
		        
		        <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> 로그인</button>
		        <a href="#" id="forgot_userName">아이디를 잊으셨나요?</a>
		        <a href="#" id="forgot_pswd">비밀번호를 잊으셨나요?</a>
		        <hr>
		        <!-- <p>Don't have an account!</p>  -->
		        <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> 회원가입</button>
		        </form>
		</div>
		<%@ include file="/views/common/footer.jsp" %>
	</body>
</html>