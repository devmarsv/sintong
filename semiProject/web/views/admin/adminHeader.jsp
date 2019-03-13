<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>신통시장</title>
		<%-- favicon --%>
		<link href="/semi/resources/images/favicon.png" rel="icon">
		<%-- //favicon --%>
		
		<%-- css --%>
		<link rel="stylesheet" href="/semi/vendor/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
		<link rel="stylesheet" href="/semi/resources/css/common.css" />
		<link rel="stylesheet" href="/semi/resources/css/admin.min.css">
		<link rel="stylesheet" href="/semi/vendor/fontawesome-free/css/all.min.css" type="text/css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
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
					<li><span class="user">admin</span>님 안녕하세요!</li>
					<li><a href="#;">로그아웃</a></li>
				</ul>
			</div>

			<h1 class="logo"><a href="/semi"><img src="/semi/resources/images/logo.png" alt="신통시장" /></a></h1>
			
			<nav class="navbar navbar-expand-xs navbar-dark bg-dark">
				<div class="container">
					<div class="collapse navbar-collapse show" id="navbarResponsive">
						<ul class="nav">
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminIndex.jsp">대쉬보드</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminMember.jsp">회원</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminPurchase.jsp">주문/배송</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminProduct.jsp">상품</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminBoard.jsp">게시판</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/admin/adminStore.jsp">매장</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</body>
</html>