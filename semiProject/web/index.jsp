<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="views/common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/main.css" />
	</head>
	<body>
		<div class="container">
			<%-- mainSlider --%>
			<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<!-- Slide One -->
					<div class="carousel-item active" style="background-image: url('http://img-cf.kurly.com/shop/data/skin/designgj/img/banner/fe0102f056655eb1d377bbc1eaef1176.jpg')">
						<div class="carousel-caption d-none d-md-block">
							<h3>첫번째 슬라이드</h3>
							<p>첫번째 슬라이드 - 설명 글</p>
						</div>
					</div>
					<!-- Slide Two -->
					<div class="carousel-item" style="background-image: url('http://img-cf.kurly.com/shop/data/skin/designgj/img/banner/fe0102f056655eb1d377bbc1eaef1176.jpg')">
						<div class="carousel-caption d-none d-md-block">
							<h3>두번째 슬라이드</h3>
							<p>두번째 슬라이드 - 설명 글</p>
						</div>
					</div>
					<!-- Slide Three -->
					<div class="carousel-item" style="background-image: url('http://img-cf.kurly.com/shop/data/skin/designgj/img/banner/fe0102f056655eb1d377bbc1eaef1176.jpg')">
						<div class="carousel-caption d-none d-md-block">
							<h3>세번째 슬라이드</h3>
							<p>세번째 슬라이드 - 설명 글</p>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			<%-- //mainSlider --%>
			
			<%-- timeSaleList --%>
			<h1 class="main-con-tit my-4">반짝떨이 <a href="#;" class="btn-more">더보기 ></a></h1>
			<%@ include file="views/main/timeSaleList.jsp" %>
			<%-- //timeSaleList --%>
			
			<%-- bestProdList --%>
			<h1 class="main-con-tit my-4">베스트 <a href="#;" class="btn-more">더보기 ></a></h1>
			<%@ include file="views/main/bestProdList.jsp" %>
			<%-- bestProdList --%>
		</div>
		
		<%@ include file="views/common/footer.jsp" %>
	</body>
</html>