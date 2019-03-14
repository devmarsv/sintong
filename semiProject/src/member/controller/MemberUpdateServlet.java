package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/mupdate")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원 정보 수정 처리용 컨트롤러
		//1.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//2.
		Member member = new Member();
		member.setmem_userid(request.getParameter("mem_userid"));
		member.setUserName(request.getParameter("username"));
		member.setmem_passwd(request.getParameter("mem_passwd"));
		member.setAge(Integer.parseInt(request.getParameter("age")));
		member.setEmail(request.getParameter("email"));
		member.setPhone(request.getParameter("phone"));
		member.setEtc(request.getParameter("etc"));
		
		/*String[] hobbies = request.getParameterValues("hobby");
		String hobby = String.join(",", hobbies);
		System.out.println("hobby : " + hobby);*/
		member.setHobby(String.join(",", request.getParameterValues("hobby")));
		
		//3.
		int result = new MemberService().updateMember(member);
		
		//4.
		if(result > 0) {		
			request.getSession(false).setAttribute("loginMember", member);
			response.sendRedirect("/first/myinfo?mem_userid=" + member.getmem_userid());
		}else {
			RequestDispatcher view = 
					request.getRequestDispatcher(
					"views/member/memberError.jsp");
			request.setAttribute("message", 
					member.getmem_userid() + 
					" 아이디에 대한 수정처리가 실패하였습니다.");
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
