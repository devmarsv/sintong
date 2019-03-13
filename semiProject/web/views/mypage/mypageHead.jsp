<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR" import="member.model.vo.Member"%>
<%
	Member loginMember = (Member)session.getAttribute("loginMember");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>�������</title>
		<%-- favicon --%>
		<link href="/semi/resources/images/favicon.png" rel="icon">
		<%-- //favicon --%>
		
		<%-- css --%>
		<link rel="stylesheet" href="/semi/vendor/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
		<link rel="stylesheet" href="/semi/resources/css/common.css" />
		<link rel="stylesheet" href="/semi/resources/css/mypage.css" />
		<%-- //css --%>
		
		<%-- script --%>
		<script type="text/javascript" src="/semi/resources/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="/semi/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		<%-- //script --%>
	</head>
	<body>
		<!-- Navigation -->
		<header class="myHeader">
			<div class="t_nav">
				<ul>
					<!-- �α��� �� -->
					<% if(loginMember == null) { %>
					<li><a href="/semi/views/member/login.jsp">�α���</a></li>
					<li><a href="/semi/views/member/register.jsp">ȸ������</a></li>
					<li><a href="#;">��ٱ���</a></li>
					<li><a href="/semi/views/member/login.jsp">����������</a></li>
					<!-- �α��� �� -->
					<% } else { %>
					<!-- �α��� �� -->
					<li><a href="/semi">Ȩ</a></li>
					<li><span class="user"><%= loginMember.getMemName() %></span>�� �ȳ��ϼ���!</li>
					<li><a href="/semi/logout">�α׾ƿ�</a></li>
					<li><a href="#;">��ٱ���</a></li>
					<li><a href="/semi/myinfo?mem_userid=<%= loginMember.getMemUserid() %>">����������</a></li>
					<!-- �α��� �� -->
					<% } %>
				</ul>
			</div>
			
			<div class="mypageTop">
				<div class="topCon">
					<h2>����������</h2>
				</div>
			</div>
		</header>
		<div class="myContent">
			<nav class="navbar navbar-expand-lg navbar-light bg-light" id="mypage_nav">
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link" href="/semi/myinfo?mem_userid=<%= loginMember.getMemUserid() %>" id="nav_list">������</a></li>
						<li class="nav-item"><a class="nav-link" href="/semi/views/mypage/mypageUpdateInfo.jsp" id="nav_list">������������</a></li>
						<li class="nav-item"><a class="nav-link" href="/semi/pointlist?mem_userid=<%= loginMember.getMemUserid() %>" id="nav_list">������</a></li>
						<li class="nav-item"><a class="nav-link" href="/semi/couponlist?mem_userid=<%= loginMember.getMemUserid() %>" id="nav_list">����</a></li>
						<%-- <li class="nav-item"><a class="nav-link" href="/semi/orderlist?mem_userid=<%= loginMember.getMemUserid() %>" id="nav_list">�ֹ�/�����ȸ</a></li> --%>
						<li class="nav-item"><a class="nav-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=1" id="nav_list">���� �� QnA</a></li>
						<li class="nav-item"><a class="nav-link" href="/semi/mypreview?mem_userid=<%= loginMember.getMemUserid() %>&page=1" id="nav_list">���� �� �ı�</a></li>
					</ul>
				</div>
			</nav>
	</body>
</html>






