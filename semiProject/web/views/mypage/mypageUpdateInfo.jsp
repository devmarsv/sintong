<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/views/mypage/mypageHead.jsp"%>
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
			
			// 탈퇴처리
			$(function(){
				$(".btMemDel").click(function(){
					var message = confirm("정말로 탈퇴하시겠습니까?");
					if(message){
						location.replace('/semi/mdel?userid=' + $(this).attr('value'));
						alert("탈퇴 처리가 완료되었습니다.\n이용해 주셔서 감사합니다.");
					} else{
						
					}
				});
			});
			
			// 달력 불러오기
			$(function(){
				var maxDate = new Date();
				$.datepicker.setDefaults({
			        dateFormat: 'yy-mm-dd',
			        prevText: '이전 달',
			        nextText: '다음 달',
			        monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			        monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			        dayNames: ['일', '월', '화', '수', '목', '금', '토'],
			        dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
			        dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
			        showMonthAfterYear: true,
			        yearSuffix: '년',
			        changeMonth:true,
			        changeYear:true,
			        maxDate : 0
			    });
				
				$("#memBirthPick").datepicker({
					dateFormat : 'yy-mm-dd'
				});
				
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
			<h2 class="conTit">개인정보 수정</h2>
			<form action="/semi/myupdate" method="post" onsubmit="return checkValidate();">
				<table class="table table-hover">
					<tr>
						<th width="30%" style="vertical-align:middle;"><span class="--red">*</span> 아이디</th>
						<td width="70%"><input type="text" name="userid" value="<%= loginMember.getMemUserid() %>" class="form-control" readonly /></td>
					</tr>
					<tr>
						<th style="vertical-align:middle;"><span class="--red">*</span> 비밀번호</th>
						<td>
							<input type="password" name="userpwd" id="userpwd" value="<%= loginMember.getMemPasswd() %>" class="form-control" required/>
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;"><span class="--red">*</span> 비밀번호 확인</th>
						<td>
							<input type="password" name="userpwd2" id="userpwd2" value="<%= loginMember.getMemPasswd() %>" class="form-control" required/>
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">이름</th>
						<td>
							<input type="text" name="username" value="<%= loginMember.getMemName() %>" class="form-control" readonly />
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">생일</th>
						<td>
							<input type="text" name="userbirth" id="memBirthPick" value="<%= loginMember.getMemBirth() %>" pattern="\d{4,1}-\d{2,6}-\d{9}" class="form-control" />
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">성별</th>
						<td>
							<% if(loginMember.getMemGender().equals("M")) { %>
							<span style="display:inline-block;margin-right:5px;">
								<input type="radio" name="gender" id="g_male" value="M" checked />
								<label for="g_male">남자</label>
							</span>
							<span style="display:inline-block;">
								<input type="radio" name="gender" id="g_female" value="F" />
								<label for="g_female">여자</label>
							</span>
							<% } else { %>
								<span style="display:inline-block;margin-right:5px;">
									<input type="radio" name="gender" id="g_male" value="M" />
									<label for="g_male">남자</label>
								</span>
								<span style="display:inline-block;">
									<input type="radio" name="gender" id="g_female" value="F" checked />
									<label for="g_female">여자</label>
								</span>
							<% } %>
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">전화번호</th>
						<td>
							<input type="text" name="tel" value="<%= loginMember.getMemTel() %>" class="form-control" />
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">이메일</th>
						<td>
							<input type="text" name="email" value="<%= loginMember.getMemEmail() %>" class="form-control" />
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">주소</th>
						<td>
							<input type="text" name="address" id="sample6_address" value="<%= loginMember.getMemAddr1() %>" class="form-control" style="display:inline-block;width:73%;vertical-align:top;" />
							<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기" class="btn btn-secondary" style="display:inline-block;vertical-align:top;" ><br>
						</td>
					</tr>
					<tr>
						<th style="vertical-align:middle;">가입날짜</th>
						<td>
							<input type="text" name="enrolldate" value="<%= loginMember.getMemEnrolldate() %>" class="form-control" readonly />
						</td>
					</tr>
				</table>
				<div style="text-align:center;padding-top:30px;">
					<input type="submit" value="수정하기" class="btn btn-info" />
				</div>
			</form>
			<div style="text-align:right;margin-top:10px;">
				<button value="<%= loginMember.getMemUserid() %>" class="btMemDel btn btn-secondary btn-sm" >탈퇴하기</button>
			</div>
		</div>
		</div>
		<%@ include file="../common/footer.jsp" %>
	</body>
</html>