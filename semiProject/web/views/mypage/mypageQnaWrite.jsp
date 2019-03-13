<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="qna.model.vo.MyQna" %>
<%
	//MyQna mqview = (MyQna)request.getAttribute("mqview");
	int currentPage = ((Integer)request.getAttribute("page")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script type="text/javascript">
			function modifyDone(){
				var myqNumVal = document.getElementById("myQnum").getAttribute('value');
				var myqPageVal = document.getElementById("myQpage").getAttribute('value');
				var mDone = confirm("입력하신 내용으로 등록하시겠습니까?");
				if(mDone == true){
				  alert("글이 정상적으로 등록되었습니다!");
				  document.location.href = "/semi/myqna?mem_userid=" + myqNumVal + "&page=" + myqPageVal;
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
			<div id="list_name">QnA 작성하기</div>
			<form action="/semi/qnamodify" method="post" onsubmit="return modifyDone();">
				<input type="hidden" name="page" id="myQpage" value="<%= currentPage %>">
				<%-- <input type="hidden" name="pqnum" id="myQnum" value="<%= mqview.getmQnaNo() %>">
				<input type="hidden" name="mqayn" value="<%= mqview.getQnaAnsYn() %>">
				<input type="hidden" name="mqacontent" value="<%= mqview.getQnaAContent() %>">
				<input type="hidden" name="mqaid" value="<%= mqview.getQnaAid() %>"> --%>
				<table id="title_form">
					<thead>
						<tr>
							<th id="form_title">제목</th>
							<td colspan="3" id="form_content">
								<input type="text" id="myQtitle" name="mqtitle" value="" maxlength="20" required />
							</td>
						</tr>
						<tr>
							<th id="form_title">작성자</th>
							<td colspan="3" id="form_content">
								<input type="text" id="popRwriter" name="mqwriter" value="<%= mqview.getQnaQid() %>"  readonly />
							</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td colspan="4" id="board_content-1">
								<p id="text-count">(0 / 300)</p>
								<textarea name="mqcontent" id="popRcontent"></textarea>
							</td>
						</tr>
					</tbody>
				</table>
			
				<div id="list_button">
					<input type="submit" value="등록하기" />
					<a onclick="history.go(-1); return false;" id="button_title" >목록</a>
				</div>
			</form>
		</div>
		</div>
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>