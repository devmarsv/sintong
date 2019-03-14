<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.model.vo.Member, java.util.*"%>
<% Member loginMember = (Member) session.getAttribute("loginMember");%>
<% String findPwd = (String)session.getAttribute("findPwd"); %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>searchIdResult</title>
<%@ include file="/views/common/header.jsp"%>
<link rel="stylesheet" href="/semi/resources/css/member.css" />
<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
</head>

<body>
<% if(loginMember != null && loginMember.getMem_userid().equals("admin")){ %>
	<%@ include file="/views/admin/adminHeader.jsp" %> <!-- 절대경로 -->
<% } %>
	<section>
		<%-- 로그인하기 전일 때 보여지는 부분 --%>
		<% if (loginMember == null) { %>
	<div id="logreg-forms1" >
		<form class="form-findmem_userid" action="/semi/findUserPwd"> <!--비밀번호 찾기-->
            <h1 class="h3 mb-3 font-weight-bold " style=" text-align: center"> 비밀번호 찾기 완료</h1>
            <div>
            	<h3>비밀번호 찾기 결과 비밀번호 정보는 아래와 같습니다.</h3>
            	<div>
            	 <h2>비밀번호 : <%= findPwd %> 입니다</h2>
            	</div>
            </div>	
            		
            <a href="/semi/views/member/login.jsp" id="cancel_userName"><i class="fas fa-angle-left"></i> 뒤로</a>
        </form>
	</div>	

		<%
			} else {
		%>
		<%-- 로그인한 상태일 때 보여지는 부분 --%>
		<table width="200" cellpadding="0" cellspacing="5" border="0">
			<tr>
				<td><%=loginMember.getMem_name()%>님</td>
				<%-- 쿼리스트링(query string)
                서블릿매핑이름?이름=값&이름=값 --%>
				<td><a href="/semi/myinfo?mem_userid=<%=loginMember.getMem_userid()%>">내
						정보 보기</a></td>
			</tr>
			<tr>
				<td><a href="/semi/logout">로그아웃</a></td>
				<td><a href="#">쪽지</a></td>
			</tr>
		</table>
		<%
			}
		%>
	</section>

	<hr style="clear: left;">
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<%@ include file="/views/common/footer.jsp"%>
</body>
</html>