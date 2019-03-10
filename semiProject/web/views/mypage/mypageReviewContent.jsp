<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/common/header.jsp"%>
		<link rel="stylesheet" href="/semi/resources/css/mypage.css" />
	</head>
	<body>
		<div class="container">
			<%@ include file="mypageHead.jsp" %>
			<div id="list_name">내가 쓴 리뷰</div>
		
			<table id="title_form">
			<tr><th id="form_title">제목</th><td colspan="3" id="form_content">예시</td></tr>
			<tr><th id="form_title">작성자</th><td colspan="3" id="form_content">예시</td></tr>
			<tr><th id="form_title">작성일</th><td id="form_content">예시</td><th id="form_title">조회수</th><td id="form_content">예시</td></tr>
			<tr><td colspan="4" id="board_content-1">질문 내용</td></tr>
			<tr><td colspan="4" id="board_content-2">답변 내용</td></tr>
			<tr><th id="form_title">첨부파일</th><td colspan="3" id="form_content"><a href="#;">예시</a></td></tr>
			<tr><th id="form_title">이전글</th><td colspan="3" id="form_content"><a href="#;">예시 제목</a></td></tr>
			<tr><th id="form_title">다음글</th><td colspan="3" id="form_content"><a href="#;">예시 제목</a></td></tr>
			</table>
		
			<div id="list_button">
				<button type="button" id="button_border"><a href="mypageReview.jsp" id="button_title">목록</a></button>
			</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>