package admin.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.member.model.service.MemberService;

/**
 * Servlet implementation class MemberModifyAckServlet
 */
@WebServlet("/mmodack")
public class MemberModifyAckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberModifyAckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("mmodack in..");
		String grade = request.getParameter("grade");
		String userId = request.getParameter("userid");
		System.out.println("grade : " + grade);
		System.out.println("userId : " + userId);
		
		int result = new MemberService().updateMember(userId, grade);
		RequestDispatcher view = null;
		if(result > 0) {
			view = request.getRequestDispatcher("views/admin/adminMemberSuccess.jsp");
			request.setAttribute("message", "회원 정보 수정 완료!");
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/admin/adminError.jsp");
			request.setAttribute("message", "회원 정보 수정 실패");
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
