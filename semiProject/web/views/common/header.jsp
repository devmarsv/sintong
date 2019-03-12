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
					<!-- 로그인 전 -->
					<li><a href="/semi/views/member/login.jsp">로그인</a></li>
					<li><a href="/semi/views/member/register.jsp">회원가입</a></li>
					<li><a href="#;">장바구니</a></li>
					<li><a href="#;">마이페이지</a></li>
					<!-- 로그인 전 -->

					<!-- 로그인 후 -->
					<!-- <li><span class="user">USER1</span>님 안녕하세요!</li>
					<li><a href="#;">로그아웃</a></li>
					<li><a href="#;">장바구니</a></li>
					<li><a href="#;">마이페이지</a></li> -->
					<!-- 로그인 후 -->
				</ul>
			</div>

			<h1 class="logo"><a href="/semi"><img src="/semi/resources/images/logo.png" alt="신통시장" /></a></h1>

			<nav class="navbar navbar-expand-xs navbar-dark bg-dark">
				<div class="container">
					<div class="collapse navbar-collapse show" id="navbarResponsive">
						<ul class="nav">
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							  전체 카테고리
							</a>
							<div class="dropdown-menu dropdown-menu-left" aria-labelledby="navbarDropdownPortfolio">
								<ul class="gnb-menu">
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">채소</a>
										<ul class="sub-menu">
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">기본채소</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">쌈·샐러드·간편채소</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">브로콜리·특수채소</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">콩나물·버섯류</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">양파·마늘·생강·파</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">시금치·부추·나물</a></li>
											<li><a href="/semi/views/product/productList.jsp" class="sub dropdown-item">파프리카·피망·고추</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">과일·견과·쌀</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">국산과일</a></li>
											<li><a href="#;" class="sub dropdown-item">수입과일</a></li>
											<li><a href="#;" class="sub dropdown-item">냉동·건과일</a></li>
											<li><a href="#;" class="sub dropdown-item">견과류</a></li>
											<li><a href="#;" class="sub dropdown-item">쌀·잡곡</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">수산·해산·건어물</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">생선류</a></li>
											<li><a href="#;" class="sub dropdown-item">새우·게·랍스터</a></li>
											<li><a href="#;" class="sub dropdown-item">오징어·낙지·문어</a></li>
											<li><a href="#;" class="sub dropdown-item">해산물·조개류</a></li>
											<li><a href="#;" class="sub dropdown-item">수산가공품</a></li>
											<li><a href="#;" class="sub dropdown-item">김·미역·해조류</a></li>
										</ul>
									</li>
									<li>
										<a href="/semi/views/product/productList.jsp" class="menu">정육·계란</a>
										<ul class="sub-menu">
											<li><a href="#;" class="sub dropdown-item">소고기</a></li>
											<li><a href="#;" class="sub dropdown-item">돼지고기</a></li>
											<li><a href="#;" class="sub dropdown-item">계란류</a></li>
											<li><a href="#;" class="sub dropdown-item">닭·오리고기</a></li>
											<li><a href="#;" class="sub dropdown-item">양념육·돈까스</a></li>
										</ul>
									</li>
								</ul>
							</div>
						  </li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/product/timeProductList.jsp">반짝떨이</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/views/product/bestProductList.jsp">베스트</a></li>
						  <li class="nav-item"><a class="nav-link" href="#;">주차 현황</a></li>
						  <li class="nav-item"><a class="nav-link" href="/semi/blist">고객 센터</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</body>
</html>