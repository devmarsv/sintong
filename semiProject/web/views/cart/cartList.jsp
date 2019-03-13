<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="product.model.vo.*"%>
<%@ page import="javax.servlet.http.HttpSession"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세정보</title>
<script type="text/javascript">
function allclear1(){
	localStorage.clear();
}
function clear1(){
	localStorage.removeItem('name');
	localStorage.removeItem('price');
}
</script>
</head>
<body>
	<hr>
	<table border="1">

		<tbody id="my-tbody">
		</tbody>
		<tfoot id="to"></tfoot>
	</table>
	<script type="text/javascript">
		var name = "<tr><th>상품명</th><th>가격</th><th></th></tr>";
		var sum = 0;
		var a = JSON.parse(localStorage.getItem('session'));
		for (var i = 0; i < a.length; i++) {
			sum += a[i].price;
			name += '<tr>' + '<td>' + a[i].name + '</td>' + '<td>' + a[i].price
					+ '</td>' + '<td>' + '<input type="button" value="삭제" onclick="clear1();">'
					+ '</td>' + '</tr>';
			document.getElementById('my-tbody').innerHTML = name;
		}
		document.getElementById('to').innerHTML = '<tr colspan="3"><td>총 :'+ sum +'</td><td><input type="button" value="전체삭제" onclick="allclear();"></tr>';
	</script>
	<a href='#' onclick='history.back(); return false;'>상품리스트페이지로</a>
</body>
</html>