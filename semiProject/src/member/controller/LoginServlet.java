package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리용 컨트롤러
		//1. 전송값에 한글이 있다면, 인코딩처리함
		request.setCharacterEncoding("utf-8");
		//결과 뷰파일 내보낼 때를 위해 미리 셋팅해 둠
		response.setContentType("text/html; charset=utf-8");
		
		//2. 전송온 값 꺼내서 변수 또는 객체에 저장 처리
		String mem_userid = request.getParameter("mem_userid");
		String mem_passwd = request.getParameter("mem_passwd");
		
		
		//3. 모델쪽으로 전송온 값 전달하면서, 처리된 결과받음
		//controller --> service --> dao
		Member loginMember = new MemberService().loginCheck(mem_userid, mem_passwd);
		
		
		//4. 받은 결과를 가지고 뷰를 선택해서 내보냄
		if(loginMember != null) {
			//로그인 성공시
			HttpSession session = request.getSession();
			//System.out.println("sessionID : " + session.getId());
			session.setAttribute("loginMember", loginMember);
			//session.setMaxInactiveInterval(10*60);
			response.sendRedirect("/semi/index.jsp");
			
			/*if(mem_userid.equals("admin")) {
				response.sendRedirect("/first/adminIndex.jsp");
			}else {
				response.sendRedirect("/first/index.jsp");
			}*/
		}else {
			//로그인 실패시
			//상대경로만 사용할 수 있는 메소드임.
			RequestDispatcher view = request.getRequestDispatcher(
					"views/member/memberError.jsp");
			request.setAttribute("message", 
				"아이디 또는 비밀번호를 다시 확인하세요.<br>"   
				+ "신통시장에 등록되지 않은 아이디이거나, <br> 아이디 또는 비밀번호를 잘못 입력하셨습니다.");
			view.forward(request, response);
		}
		
	}

}









