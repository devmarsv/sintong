package member.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MyInfoUpdateServlet
 */
@WebServlet("/myupdate")
public class MyInfoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfoUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/// 회원정보 수정
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		Member member = new Member();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		member.setMemUserid(request.getParameter("userid"));
		member.setMemPasswd(request.getParameter("userpwd"));
		member.setMemName(request.getParameter("username"));
		member.setMemBirth(Date.valueOf(request.getParameter("userbirth")));
		member.setMemGender(request.getParameter("gender"));
		member.setMemTel(request.getParameter("tel"));
		member.setMemEmail(request.getParameter("email"));
		member.setMemAddr1(request.getParameter("address"));
		member.setMemEnrolldate(Date.valueOf(request.getParameter("enrolldate")));
		
		
		int result = new MemberService().updateMember(member);
		
		if(result > 0) {
			request.getSession(false).setAttribute("loginMember", member);
			response.sendRedirect("/semi/myinfo?mem_userid=" + member.getMemUserid());
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", member.getMemUserid() + "의 회원정보 불러오기 실패!");
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
