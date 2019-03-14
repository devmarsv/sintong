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
		<%-- //css --%>
		
		<%-- script --%>
		<script type="text/javascript" src="/semi/resources/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="/semi/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		<%-- //script --%>
	</head>
	<body>
		<!-- Navigation -->
		<header>
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
					<li><span class="user"><%= loginMember.getMemName() %></span>�� �ȳ��ϼ���!</li>
					<li><a href="/semi/logout">�α׾ƿ�</a></li>
					<li><a href="#;">��ٱ���</a></li>
					<li><a href="/semi/myinfo?mem_userid=<%= loginMember.getMemUserid() %>">����������</a></li>
					<!-- �α��� �� -->
					<% } %>
				</ul>
			</div>

			<h1 class="logo"><a href="/semi"><img src="/semi/resources/images/logo.png" alt="�������" /></a></h1>

			<nav class="navbar navbar-expand-xs navbar-dark bg-dark">
				<div class="container">
					<div class="collapse navbar-collapse show" id="navbarResponsive">
						<ul class="nav">
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							  ��ü ī�װ�
							</a>
							<div class="dropdown-menu dropdown-menu-left" aria-labelledby="navbarDropdownPortfolio">
								<ul class="gnb-menu">
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">ä��</a>
										<ul class="sub-menu">
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">�⺻ä��</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">�ӡ������塤����ä��</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">����ݸ���Ư��ä��</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">�ᳪ����������</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">���ġ����á���������</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">�ñ�ġ�����ߡ�����</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">������ī���Ǹ�������</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">���ϡ��߰�����</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">�������</a></li>
											<li><a href="#;" class="sub dropdown-item">���԰���</a></li>
											<li><a href="#;" class="sub dropdown-item">�õ����ǰ���</a></li>
											<li><a href="#;" class="sub dropdown-item">�߰���</a></li>
											<li><a href="#;" class="sub dropdown-item">�ҡ����</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">���ꡤ�ػꡤ�Ǿ</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">������</a></li>
											<li><a href="#;" class="sub dropdown-item">���졤�ԡ�������</a></li>
											<li><a href="#;" class="sub dropdown-item">��¡�����������</a></li>
											<li><a href="#;" class="sub dropdown-item">�ػ깰��������</a></li>
											<li><a href="#;" class="sub dropdown-item">���갡��ǰ</a></li>
											<li><a href="#;" class="sub dropdown-item">�衤�̿���������</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">���������</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">�Ұ��</a></li>
											<li><a href="#;" class="sub dropdown-item">�������</a></li>
											<li><a href="#;" class="sub dropdown-item">�����</a></li>
											<li><a href="#;" class="sub dropdown-item">�ߡ��������</a></li>
											<li><a href="#;" class="sub dropdown-item">����������</a></li>
										</ul>
									</li>
								</ul>
							</div>
						  </li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/product/timeProductList.jsp">��¦����</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/product/bestProductList.jsp">����Ʈ</a></li>
						  <li class="nav-item"><a class="nav-link" href="#;">���� ��Ȳ</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/board/boardMain.jsp">�� ����</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</body>
</html>