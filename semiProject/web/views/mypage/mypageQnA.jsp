<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="qna.model.vo.MyQna, java.util.*" %>
<%
	ArrayList<MyQna> myqnaList = (ArrayList<MyQna>)request.getAttribute("myqnaList");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();			
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script type="text/javascript">
			$(function(){
				// answer box 슬라이드
				$('.aBox').hide();
				
				$('.qBox').click(function(){
					$('.aBox').slideUp(300);
					if(!$(this).siblings('.aBox').is(':visible')){
						$(this).siblings('.aBox').slideDown(300);
					}
				});
				
				//삭제 alert
				$(".btDelete").click(function(){
					var message = confirm("정말로 삭제하시겠습니까?\n삭제한 글은 되돌릴 수 없습니다.");
					if(message){
						alert("글이 정상적으로 삭제되었습니다!");
						location.replace('/semi/qnadel?no=' + $(this).attr('value') + '&userid=' + $(this).attr('data-value'));
					} else{
						
					}
				});
			});
		</script>
	</head>
	<body>
		<div class="container myContainer">
			<div id="list_name">내가 쓴 QnA(<%= listCount %>)</div>
			<div><a href="">QnA 글 작성하기</a></div>
			<div>
				<table class="table table-hover">
					<thead>
						<th>답변상태</th>
						<th>QnA 내용</th>
						<th>관리</th>
					</thead>
					<tbody>
						<% for(MyQna myqna : myqnaList){ %>
						<tr>
							<input type="hidden" value="<%= myqna.getmQnaNo() %>" />
							 <td width="20%">
							 	<% if(myqna.getQnaAnsYn().equals("Y")){ %>
							 	<p class="aDone">답변완료</p>
							 	<% } else { %>
							 	<p class="aYet">답변대기</p>
							 	<% } %>
							 </td>
							 <td width="70%">
							 	<div class="qBox">
							 		<div class="mark">Q</div>
							 		<div class="content">
							 			<div class="head">
							 				<span><%= myqna.getmQnaTitle() %></span>
							 				<span><%= myqna.getQnaQid() %></span>
							 				<span><%= myqna.getmQnaDate() %></span>
							 			</div>
							 			<div class="con">
							 				<%= myqna.getQnaQContent() %>
							 			</div>
							 		</div>
							 	</div>
							 	<% if(myqna.getQnaAnsYn().equals("Y")){ %>
							 	<!-- <div class="contentBox"> -->
							 	<div class="aBox">
							 		<div class="mark">A</div>
							 		<div class="content">
							 			<div class="con">
							 				<%= myqna.getQnaAContent() %>
							 			</div>
							 		</div>
							 	</div>
							 	<!-- </div> -->
							 	<% } %>
							 </td>
							 <td width="10%">
							 	<% if(myqna.getQnaAnsYn().equals("N")) { %>
							 	<p><a href="/semi/myqnaview?pqnum=<%= myqna.getmQnaNo() %>&page=<%= currentPage %>" class="btModify">수정</a></p>
							 	<% } %>
							 	<p><button name="delno" data-value="<%= myqna.getQnaQid() %>" value="<%= myqna.getmQnaNo() %>" class="btDelete">삭제</button></p>
							 </td>
						</tr>
						<% } %>
					</tbody>
				</table>
				
				<!-- Paging 처리 -->
				<nav aria-label="Page navigation example">
				  <ul class="pagination">
				  	<!-- 이전 -->
				    <li class="page-item">
				   	<% if((currentPage - 5) < startPage && (currentPage - 5) > 1){ %>
				      <a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= startPage - 5 %>" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				        <span class="sr-only">Previous</span>
				      </a>
				    <% } else { %>
				      <a class="page-link" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				        <span class="sr-only">Previous</span>
				      </a>
				   	<% } %>
				    </li>
				    <!-- //이전 -->
				    
				   <!-- 페이지 -->
				    <% for(int p = startPage; p <= endPage; p++){ 
				    	if(p == currentPage){
				    %>
				    <li class="page-item active">
				    	<a class="page-link" ><%= p %></a>
				    </li>
					<% } else { %>
					<li class="page-item">
						<a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= p %>"><%= p %></a>
					</li>
					<% }} %>
					<!--// 페이지 -->
					
					<!-- 다음 -->
				    <li class="page-item">
				   <% if((currentPage + 5) > endPage && (currentPage + 5) < maxPage){ %>
				      <a class="page-link" href="/semi/myqna?mem_userid=<%= loginMember.getMemUserid() %>&page=<%= endPage + 5 %>" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				        <span class="sr-only">Next</span>
				      </a>
				    <% } else { %>
				      <a class="page-link" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				        <span class="sr-only">Next</span>
				      </a>
				    <% } %>
				    </li>
				    <!-- //다음 -->
				  </ul>
				</nav>
			</div>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>