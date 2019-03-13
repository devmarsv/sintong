package admin.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.member.model.service.MemberService;
import admin.member.model.vo.Member;

/**
 * Servlet implementation class MemberSearchServlet
 */
@WebServlet("/msearch")
public class MemberSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String soption = request.getParameter("soption");
		String keyword = request.getParameter("keyword");
		String grade = request.getParameter("grade");
		String dateSearch = request.getParameter("jb-radio");
		Boolean ds = Boolean.parseBoolean(dateSearch);
		String startDate = request.getParameter("from");
		String endDate = request.getParameter("to");
		
		ArrayList<Member> list = new MemberService().selectMembers(soption, keyword, grade, ds, startDate, endDate);
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = request.getRequestDispatcher("views/admin/adminMemberSearch.jsp");
		request.setAttribute("list", list);
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
