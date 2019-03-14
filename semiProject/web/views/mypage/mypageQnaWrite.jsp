<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="qna.model.vo.MyQna" %>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script type="text/javascript">
			function insertDone(){
				var userId = document.getElementById('myQwriter').getAttribute('value');
				var iDone = confirm("입력하신 내용으로 등록하시겠습니까?");
				if(iDone == true){
				  alert("글이 정상적으로 등록되었습니다!");
				  document.location.href = "/semi/myqna?mem_userid=" + userId + "&page=1";
				  return true;
				} else if (iDone == false){
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
			<form action="/semi/mqinsert" method="post" onsubmit="return insertDone();">
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
								<input type="text" id="myQwriter" name="mqwriter" value="<%= loginMember.getMemUserid() %>"  readonly />
							</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td colspan="4" id="board_content-1">
								<p id="text-count">(0 / 300)</p>
								<textarea name="mqcontent" id="popRcontent" required></textarea>
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