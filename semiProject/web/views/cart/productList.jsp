<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="product.model.vo.*"%>
<%
	Product pro = (Product) request.getAttribute("pro");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세정보</title>
<script>
function cartlist(){
		if((JSON.parse(localStorage.getItem('session')))==null)
			var a=[];
		else
		var a =JSON.parse(localStorage.getItem('session'));
		var p = {name:'<%=pro.getpName()%>',
			     price:<%=pro.getpPrice()%>,
			     des: '<%=pro.getpDesc()%>',
			     toString : function(){
			    	 return "name : "+<%=pro.getpName()%> +", price : " +  <%=pro.getpPrice()%> + ", des : " + this.des;
			     }
			}; 
		   a.push(p);	
		   localStorage.setItem('session',JSON.stringify(a));
		   location.href='cartList.jsp'
	}
	function p(){
		/* var a =JSON.parse(localStorage.getItem('session'));
		for(var i=0; i<a.length; i++)
			{
			alert(a[i]);
			} */
			
		/* 	if((JSON.parse(localStorage.getItem('session')))==null)
				var a=[];
			else
			var a =JSON.parse(localStorage.getItem('session')); */
			a.push(p);	
		 localStorage.setItem('session',JSON.stringify(a));
	}
	
	<%-- function p2(){
		
		location.href="productList2.jsp?d=<%=pro.getpName()%>"
	} --%>
	
	
function s(){
		
		location.href="submit.jsp"
	}
</script>
</head>
<body>
	<h2>상품 상세정보</h2>
	<form action="CartListCon.do" method="post">
		<table border="1">
			<tr>
				<td><img src="#" width="340" height="300"></td>
				<td>
					<table border="1" style="height: 300px; width: 400px;">
						<tr align="center">
							<td>상품명</td>
							<td><%=pro.getpName()%></td>
						</tr>
						<tr align="center">
							<td>가격</td>
							<td><%=pro.getpPrice()%>원</td>
						</tr>
						<tr align="center">
							<td>상품소개</td>
							<td><%=pro.getpDesc()%></td>
						</tr>
						<tr align="center">
							<td colspan="2"><input type="button" onclick="cartlist();"
								value="장바구니 담기"> <!-- <input type="button" onclick="p();" value="구"> -->
								<input type="button" onclick="s();" value="상품선택페이지로"></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>