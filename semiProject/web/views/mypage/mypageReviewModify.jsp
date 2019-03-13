<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="productReview.model.vo.ProductReview" %>
<%
	ProductReview myReview = (ProductReview)request.getAttribute("preview");
	int currentPage = ((Integer)request.getAttribute("page")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script type="text/javascript">
			function modifyDone(){
				var rnumVal = document.getElementById("popRnum").getAttribute('value');
				var cpageVal = document.getElementById("popCpage").getAttribute('value');
				var mDone = confirm("입력하신 내용으로 수정하시겠습니까?");
				if(mDone == true){
				  alert("글이 정상적으로 수정되었습니다!");
				  document.location.href = "/semi/mypreview?mem_userid=" + rnumVal + "&page=" + cpageVal;
				  return true;
				} else if (mDone == false){
				  return false;
				}
			}	
		
			//글자수 제한 체크 
			$(function(){
				$('#popRcontent').on('keyup', function(){
					if($(this).val().length > 300){
						$(this).val($(this).val().substring(0, 300));
					}
					var letter = $(this).val();
					$('#text-count').html("("+letter.length+" / 300)");
				});
			});
		</script>
	</head>
	<body>
		<div class="container myContainer">
			<div id="list_name">내가 쓴 후기 수정하기</div>
			<form action="/semi/rmodify" method="post" onsubmit="return modifyDone();">
				<input type="hidden" name="prnum" id="popRnum" value="<%= myReview.getpReviewNo() %>">
				<input type="hidden" name="pnum" id="popPnum" value="<%= myReview.getProductNo() %>">
				<input type="hidden" name="page" id="popCpage" value="<%= currentPage %>">
				<table id="title_form">
					<thead>
						<tr>
							<th id="form_title">제목</th>
							<td colspan="3" id="form_content">
								<input type="text" id="popRtitle" name="prtitle" value="<%= myReview.getpReviewTitle() %>" maxlength="20" required />
							</td>
						</tr>
						<tr>
							<th id="form_title">작성자</th>
							<td colspan="3" id="form_content">
								<input type="text" id="popRwriter" name="prwriter" value="<%= myReview.getMemUserid() %>"  readonly />
							</td>
						</tr>
						<tr>
							<th id="form_title">작성일</th>
							<td colspan="3" id="form_content">
								<input type="text" id="popRdate" name="prdate" value="<%= myReview.getpReviewDate() %>" readonly />
							</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td colspan="4" id="board_content-1">
								<p id="text-count">(0 / 300)</p>
								<textarea name="prcontent" id="popRcontent"><%= myReview.getpReviewContent() %></textarea>
							</td>
						</tr>
					</tbody>
				</table>
			
				<div id="list_button">
					<input type="submit" value="수정하기" />
					<a onclick="history.go(-1); return false;" id="button_title" >목록</a>
				</div>
			</form>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>