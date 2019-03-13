<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/header.jsp"%>
<link rel="stylesheet" href="/semi/resources/css/member.css" />
</head>
<body>
	<div id="logreg-forms-register" class="container">
		<br>
		<!-- 회원가입 -->
		<form action="/semi/register" class="form-signup"
			style="display: block;">
			<!-- 회원가입 폼 -->

			<h1 class="h3 mb-3 font-weight-bold " style="text-align: center">
				회원가입</h1>
			<br>
			<div class="col-sm-12">
				<div class="row">
					<div class="col-sm-6">
						<input type="text" id="userId" name="userid" class="form-control"
							placeholder="* 아이디는 6~12 글자" required="" autofocus="">
					</div>
					&nbsp;&nbsp;
					<div class="col-sm-2">
						<button class="btn checkId-dtn" id="checkId"
							onclick="return checkId();">
							<span>아이디 중복확인</span>
						</button>
					</div>
				</div>
				
				<input type="text" id="userName" name="username"
					class="form-control" placeholder="* 이 름" required="" autofocus="">
				<input type="password" id="userPwd" name="userpwd"
					class="form-control" placeholder="* 비밀번호" required autofocus="">
				<input type="password" id="userPwd2" name="userpwd2"
					class="form-control" placeholder="* 비밀번호 확인" required autofocus="">
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4 ">
							<label name="gender" class="gender">* 성 별 :</label>
						</div>
						&nbsp; &nbsp;
						<div class="col-xs-4 male">
							<input type="radio" name="gender" value="M" required>남</input>
						</div>
						&nbsp; &nbsp;
						<div class="col-xs-4 female">
							<input type="radio" name="gender" value="F" required>여</input>
						</div>
					</div>
				</div>
				<input type="number" id="age" name="age" class="form-control"
					placeholder="* 나이" min="19" max="" autofocus=""> <input
					type="phone" id="phone" name="phone" class="form-control"
					placeholder="* 핸드폰" required autofocus=""> <input
					type="email" id="email" name="email" class="form-control"
					placeholder="* 이메일 주소" required autofocus="">
				<tr height="20">
					<th bgcolor="orange">취 미</th>
					<td>
						<table>
							<tr>
								<td width="150"><input type="checkbox" name="hobby"
									value="game"> 게임</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="reading"> 책읽기</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="music"> 음악듣기</td>
							</tr>
							<tr>
								<td width="150"><input type="checkbox" name="hobby"
									value="climb"> 등산</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="sport"> 운동</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="movie"> 영화감상</td>
							</tr>
							<tr>
								<td width="150"><input type="checkbox" name="hobby"
									value="travel"> 여행하기</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="cook"> 요리하기</td>
								<td width="150"><input type="checkbox" name="hobby"
									value="etc"> 기타</td>
							</tr>
						</table>
					</td>
				</tr>
				<h4>기 타</h4>
				<textarea name="etc" row="5" cols="50" class="form-control"
					autofocus=""></textarea>
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