<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, admin.member.model.vo.Member" %>
<%	
	ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<title>신통시장</title>
<%@ include file="adminHeader.jsp"%>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script type="text/javascript">
	$(function(){
		$.ajax({
			url: "/semi/mcount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.memCount;
				
				console.log("value : " + value);
				
				$("#memcount").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //mcount
		
		$.ajax({
			url: "/semi/mncount",
			type: "get",
			dataType: "json",
			success: function(data) {
				console.log("success : " + data);
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				var value = json.mnCount;
				
				console.log("value : " + value);
				
				$("#newmem").html(value);
			},
			
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + ", " + 
						textStatus + ", " + errorThrown);
			}
		}); //mcount
		
		 $("#datepicker1").datepicker({
             dateFormat: 'yy-mm-dd' //Input Display Format 변경
             ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
             ,showMonthAfterYear:true //년도 먼저 나오고, 뒤에 월 표시
             ,changeYear: true //콤보박스에서 년 선택 가능
             ,changeMonth: true //콤보박스에서 월 선택 가능                
             ,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시  
             ,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" //버튼 이미지 경로
             ,buttonImageOnly: true //기본 버튼의 회색 부분을 없애고, 이미지만 보이게 함
             ,buttonText: "선택" //버튼에 마우스 갖다 댔을 때 표시되는 텍스트                
             ,yearSuffix: "년" //달력의 년도 부분 뒤에 붙는 텍스트
             ,monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'] //달력의 월 부분 텍스트
             ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip 텍스트
             ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 부분 텍스트
             ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 부분 Tooltip 텍스트
             ,minDate: "-1M" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
             ,maxDate: "+1M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)                
         });
		
		 $("#datepicker2").datepicker({
             dateFormat: 'yy-mm-dd' //Input Display Format 변경
             ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
             ,showMonthAfterYear:true //년도 먼저 나오고, 뒤에 월 표시
             ,changeYear: true //콤보박스에서 년 선택 가능
             ,changeMonth: true //콤보박스에서 월 선택 가능                
             ,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시  
             ,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" //버튼 이미지 경로
             ,buttonImageOnly: true //기본 버튼의 회색 부분을 없애고, 이미지만 보이게 함
             ,buttonText: "선택" //버튼에 마우스 갖다 댔을 때 표시되는 텍스트                
             ,yearSuffix: "년" //달력의 년도 부분 뒤에 붙는 텍스트
             ,monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'] //달력의 월 부분 텍스트
             ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip 텍스트
             ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 부분 텍스트
             ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 부분 Tooltip 텍스트
             ,minDate: "-1M" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
             ,maxDate: "+1M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)                
         });
         
         //초기값을 오늘 날짜로 설정
         $('#datepicker1').datepicker('setDate', 'today');
         $('#datepicker2').datepicker('setDate', 'today');
		
	}); //document ready
	
</script>
</head>

<body>
<form action="/semi/msearch" id="frm" name="frm">
	<div class="container">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800" id="head">대쉬보드</h1>
		</div>

		<!-- Content Row -->
		<div class="row">

			<!-- 회원 현황 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">회원수</div>
								<div id="memcount" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="far fa-user fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!-- 오늘의 신규 회원 Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-warning text-uppercase mb-1">신규 회원</div>
								<div id="newmem" class="h5 mb-0 font-weight-bold text-gray-800"></div>
							</div>
							<div class="col-auto">
								<i class="far fa-user fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- Content Row -->

		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">검색</h6>
			</div>
			<div class="card-body">
				<div class="text-left">
					<div class="table-responsive">
						<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
							<tbody>
								<tr>
									<th width="20%">검색어</th>
									<td width="20%">
										<select class="selectpicker" id="soption" name="soption">
											<option value="null">선택하세요.</option>
											<option value="id">id</option>
											<option value="name">이름</option>
											<option value="email">이메일</option>
											<option value="tel">전화번호</option>
										</select>
									</td>
									<td width="60%"><input type="text" class="form-control"	aria-describedby="inputForm" id="keyword" name="keyword"></td>
								</tr>
								<tr>
									<th width="20%">회원등급</th>
									<td width="20%" colspan="2">
										<select class="selectpicker" id="grade" name="grade">
											<option value="null">선택하세요.</option>
											<option value="1">점주</option>
											<option value="2">골드회원</option>
											<option value="3">실버회원</option>
											<option value="4">일반회원</option>
											<option value="9">블랙리스트</option>
										</select>
									</td>
								</tr>
								<tr>
									<th width="20%">회원가입일 포함검색</th>
									<td colspan="2">
										<div class="custom-control custom-radio">
											<input type="radio" name="jb-radio" id="jb-radio-1" class="custom-control-input" value="true" onclick="disableEnrollForm(true)">
											<label class="custom-control-label" for="jb-radio-1">사용</label>
										</div>
										<div class="custom-control custom-radio">
											<input type="radio" name="jb-radio" id="jb-radio-2" class="custom-control-input" value="false" onclick="disableEnrollForm(false)">
											<label class="custom-control-label" for="jb-radio-2">미사용</label>
										</div>
									</td>
								</tr>
								<tr id = "enroll">
									<th>회원가입일</th>
									<td colspan="2" width="60%">
										<input type="text" id="datepicker1" name="from">
										~
										<input type="text" id="datepicker2" name="to">
										<!-- <input type="text" class="form-control" aria-describedby="inputForm" id="entryDate1" name="from">
										~
										<input type="text" class="form-control"	aria-describedby="inputForm" id="entryDate2" name="to"> -->
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="/semi/mlist" class="btn btn-primary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-check"></i></span>
											<span class="text">전체 조회</span>
										</a>&nbsp; &nbsp;
										<a href="#" class="btn btn-success btn-icon-split" onclick="document.getElementById('frm').submit();">
											<span class="icon text-white-50" size="20px"> <i class="fas fa-check"></i></span>
											<span class="text">검색</span>
										</a>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

		<!-- 검색결과 area -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">조회 결과</h6>
			</div>
			<div class="card-body">
				<!-- DataTales Example -->
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>아이디</th>
                      <th>이름</th>
                      <th>생년월일</th>
                      <th>전화번호</th>
                      <th>회원등급</th>
                    </tr>
                  </thead>
                  <tbody>
                  	<% if(list != null) { %>
                    <% for(Member m : list) { %>
                    <tr>
                     	<td><a href="/semi/mdetail?userid=<%=m.getMemUserId()%>"><%= m.getMemUserId() %></a></td>
                     	<td><%= m.getMemName() %></td>
                     	<td><%= m.getMemBirth() %></td>
                     	<td><%= m.getMemTel() %></td>
                     	<td><%= m.getMemGrade() %></td>
                    </tr>
                    <% } 
                    } %>
                  </tbody>
                </table>
              </div>
          
			</div>
		</div>
		<!-- 검색결과 area -->
	</div>
	<!-- container -->

	<%@ include file="../common/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript">
		
		function disableEnrollForm(value) {
			if(!value) {
				enroll.style.display = 'none';
			}
			else {
				enroll.style.display = '';
			}
		}
		
	</script>
	
</form>
</body>
</html>
