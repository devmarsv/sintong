<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
		<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
		<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
		<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
		<script>
			// 비밀번호 확인
			function checkValidate(){
			var pwd1 = document.getElementById("userpwd");
			var pwd2 = document.getElementById("userpwd2");
			
			if(pwd1.value != pwd2.value){
				alert("암호와 암호확인이 일치하지 않습니다.\n"
					+ "다시 확인하고 입력하십시요.");
				pwd2.select();
				return false;  //submit 취소
			}
			
			return true;  //submit 실행
		}
			
			// 달력 불러오기
			$(function(){
				$("#memBirthPick").datepicker({
					dateFormat : 'yy-mm-dd'	
				});
				//$("#memBirthPick").datepicker("option", "showAnim", "slide");
			});
			
			// 주소찾기 api
		    function sample6_execDaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                var addr = ''; // 주소 변수
		
		                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                    addr = data.roadAddress;
		                } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                    addr = data.jibunAddress;
		                }
		
		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById("sample6_address").value = addr;
		                // 커서를 주소 필드로 이동한다.
		                document.getElementById("sample6_address").focus();
		            }
		        }).open();
		    }
		</script>
	</head>
	<body>
		<div class="container myContainer">
			<div id="list_name">개인정보수정</div>
			<form action="/semi/myupdate" method="post" onsubmit="return checkValidate();">
				<table class="table table-hover">
					<tr>
						<th><span class="red">*</span>아이디</th>
						<td><input type="text" name="userid" value="<%= loginMember.getMemUserid() %>" readonly /></td>
					</tr>
					<tr>
						<th><span class="red">*</span>비밀번호</th>
						<td>
							<input type="password" name="userpwd" id="userpwd" value="<%= loginMember.getMemPasswd() %>" required/>
						</td>
					</tr>
					<tr>
						<th><span class="red">*</span>비밀번호 확인</th>
						<td>
							<input type="password" name="userpwd2" id="userpwd2" value="<%= loginMember.getMemPasswd() %>" required/>
						</td>
					</tr>
					<tr>
						<th>이름</th>
						<td>
							<input type="text" name="username" value="<%= loginMember.getMemName() %>" readonly />
						</td>
					</tr>
					<tr>
						<th>생일</th>
						<td>
							<input type="text" name="userbirth" id="memBirthPick" value="<%= loginMember.getMemBirth() %>" />
						</td>
					</tr>
					<tr>
						<th>성별</th>
						<td>
							<% if(loginMember.getMemGender().equals("M")) { %>
							<span>
								<input type="radio" name="gender" id="g_male" value="M" checked />
								<label for="g_male">남자</label>
							</span>
							<span>
								<input type="radio" name="gender" id="g_female" value="F" />
								<label for="g_female">여자</label>
							</span>
							<% } else { %>
								<span>
									<input type="radio" name="gender" id="g_male" value="M" />
									<label for="g_male">남자</label>
								</span>
								<span>
									<input type="radio" name="gender" id="g_female" value="F" checked />
									<label for="g_female">여자</label>
								</span>
							<% } %>
						</td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td>
							<input type="text" name="tel" value="<%= loginMember.getMemTel() %>" />
						</td>
					</tr>
					<tr>
						<th>이메일</th>
						<td>
							<input type="text" name="email" value="<%= loginMember.getMemEmail() %>" />
						</td>
					</tr>
					<tr>
						<th>주소</th>
						<td>
							<input type="text" name="address" id="sample6_address" value="<%= loginMember.getMemAddr1() %>" />
							<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
						</td>
					</tr>
					<tr>
						<th>가입날짜</th>
						<td>
							<input type="text" name="enrolldate" value="<%= loginMember.getMemEnrolldate() %>" readonly />
						</td>
					</tr>
				</table>
				<div>
					<input type="submit" value="수정하기">
				</div>
			</form>
		</div>
		</div>
		<%@ include file="../common/footer.jsp" %>
	</body>
</html>