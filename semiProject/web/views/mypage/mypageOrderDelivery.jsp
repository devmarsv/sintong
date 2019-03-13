<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
	</head>
	<body>
		<div class="container myContainer">
				<div id="list_name">주문/배달조회</div>
     
			    <div>
			      <table class="table table-striped table-bordered table-hover">
			        <thead>
			          <tr align="center">
			            <th width="20%">주문번호</th>
			            <th width="40%">주문 상품</th>
			            <th width="20%">주문 일시</th>
			            <th width="20%">처리 상황</th>
			          </tr>
			        </thead>
			        <tbody>
			            <tr id="boardlist">
			              <td>예시</td>
			              <td>예시</td>
			              <td>예시</td>
			              <td>예시</td>
			            </tr>
			        </tbody>
			      </table>
			      
			 <!-- Paging 처리 -->
			
				<div id="paging">
					<ul class="pagination justify-content-center">
					    <li class="page-item">
					      <a class="page-link" href="#" aria-label="Previous" id="page_num">
					        <span aria-hidden="true">&laquo;</span>
					        <span class="sr-only">Previous</span>
					      </a>
					    </li>
					    <li class="page-item"><a class="page-link" href="#" id="page_num">1</a></li>
					    <li class="page-item"><a class="page-link" href="#" id="page_num">2</a></li>
					    <li class="page-item"><a class="page-link" href="#" id="page_num">3</a></li>
					    <li class="page-item">
					      <a class="page-link" href="#" aria-label="Next" id="page_num">
					        <span aria-hidden="true">&raquo;</span>
					        <span class="sr-only">Next</span>
					      </a>
					    </li>
					</ul>
				</div>
			
			</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>