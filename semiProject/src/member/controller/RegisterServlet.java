package member.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//2.
		Member member = new Member();
		member.setMemUserid(request.getParameter("mem_userid"));
		member.setMemName(request.getParameter("mem_name"));
		member.setMemPasswd(request.getParameter("mem_passwd"));
		member.setMemBirth(Date.valueOf(request.getParameter("mem_birth")));
		member.setMemGender(request.getParameter("mem_gender"));
		member.setMemTel(request.getParameter("mem_tel"));
		member.setMemEmail(request.getParameter("mem_email"));
		member.setMemAddr1(request.getParameter("mem_addr1"));
		member.setMemAddr2(request.getParameter("mem_addr2"));
		
		//3.
		int result = new MemberService().insertMember(member);
		
		//4.
		if(result > 0) {
			
			response.sendRedirect("/semi/views/member/registerResult.jsp");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("/views/member/memberError.jsp");
			request.setAttribute("message", "에러.");
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
