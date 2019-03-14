<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./memberError.jsp" import="member.model.vo.Member" %>
<%
	Member member = (Member)request.getAttribute("member");
	//member = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 보기</title>
<script type="text/javascript">
	function moveUpdatePage(){
		location.href = "/semi/views/member/memberUpdatePage.jsp";
	}
	
	function memberDeleteCall(){
		location.href = "/semi/mdel?mem_userid=<%= member.getmem_mem_userid() %>";
	}
</script>
</head>
<body>
<h1 align="center">
<%= member.getMem_name() %> 님의 회원 정보
</h1>
<table align="center" width="600" border="1">
<tr height="20"><th width="150" bgcolor="orange">아이디</th>
<td><%= member.getmem_mem_userid() %></td></tr>
<tr height="20"><th bgcolor="orange">성 별</th>
<td><%= member.getMem_gender() %></td></tr>
<tr height="20"><th bgcolor="orange">나 이</th>
<td><%= member.getMem_birth() %></td></tr>
<tr height="20"><th bgcolor="orange">전화번호</th>
<td><%= member.getMem_tel() %></td></tr>
<tr height="20"><th bgcolor="orange">이메일</th>
<td><%= member.getMem_email() %></td></tr>
<tr height="20"><th bgcolor="orange">주  소</th>
<td><%= member.getMem_addr1() %></td></tr>
<tr height="20"><th bgcolor="orange">주 소2 </th>
<td><%= member.getMem_addr2() %></td></tr>
<tr height="20"><th bgcolor="orange">가입날짜</th>
<td><%= member.getMem_enrollDate() %></td></tr>
<tr height="20"><th bgcolor="orange">포인트</th>
<td><%= member.getMem_pointnum() %></td></tr>
<tr height="20"><th bgcolor="orange">쿠 폰</th>
<td><%= member.getMem_couponnum() %></td></tr>
<tr height="20"><th bgcolor="orange">등 급</th>
<td><%= member.getGrade() %></td></tr>
<tr height="20"><th colspan="2">

<button onclick="moveUpdatePage();">수정페이지로 이동</button>
&nbsp; &nbsp;
<button onclick="memberDeleteCall();">탈퇴하기</button>
</th></tr>
</table>

</body>
</html>







