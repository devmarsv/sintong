<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="../common/header.jsp" %>
		<link rel="stylesheet" href="/semi/resources/css/product.css" />
	</head>
	<body>
		<div class="container pvContainer">
			<div class="row viewTop">
				<div class="col-md-6 prodImg">
				  <img class="img-fluid" src="http://img-cf.kurly.com/shop/data/goods/1530175239341l0.jpg" alt="">
				</div>
				
				<div class="col-md-6">
				  <h3 class="my-3 title">호박고구마 800g/봉</h3>
				  <p class="comment">더욱 촉촉하고 달콤한 호박고구마 (1봉/800g)</p>
				  
				  <table class="table prodTable">
					  <tbody>
					    <tr class="priceRow">
					      <th>판매가</th>
					      <td>￦ 11,000</td>
					    </tr>
					    <tr>
					      <th>원산지</th>
					      <td>전남 해안군</td>
					    </tr>
					  </tbody>
				  </table>
				  
				  <table class="table prodTable optTable">
					  <tbody>
					    <tr class="optRow">
					      <th>옵션</th>
					      <td>
					      	<select class="form-control">
					      		<option>옵션 선택</option>
					      		<option>800g/(봉)</option>
					      		<option>2.4kg/(박스)</option>
					      		<option>5.0kg/(박스)</option>
					      	</select>
					      </td>
					    </tr>
					    <tr class="optRow">
					      <th>추가 옵션</th>
					      <td>
					      	<select class="form-control">
					      		<option>옵션 선택</option>
					      		<option>선물 포장</option>
					      		<option>포장 안함</option>
					      	</select>
					      </td>
					    </tr>
					  </tbody>
				  </table>
				  
				  <div class="row optBox">
				  	<div class="col-md-8">
				  		<p>옵션 : 800g/(봉)</p>
				  		<p>추가 옵션 : 포장 안함</p>
				  	</div>
				  	<div class="col-md-4">
				  		<div class="input-group">
					      <span class="input-group-addon btnQty">
					        <a href="#;" class="btnMinus">-</a>
					      </span>
					      <input type="text" class="form-control qtyInput" value="1" />
					      <span class="input-group-addon btnQty">
					        <a href="#;" class="btnPlus">+</a>
					      </span>
					    </div>
				  	</div>
				  </div>
				  
				  <div class="row btnGroup">
				  	<div class="col">
				  		<a href="#" class="btn btn-secondary btn-lg btnCart" role="button" aria-pressed="true">장바구니</a>
				  	</div>
				  	<div class="col">
				  		<a href="#" class="btn btn-primary btn-lg btnBuy" role="button" aria-pressed="true">구매하기</a>
					</div>
				  </div>
				</div>
			</div>
		</div>
		<%@ include file="../common/footer.jsp" %>
	</body>
</html>