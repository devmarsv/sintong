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
 * Servlet implementation class MyInfoServlet
 */
@WebServlet("/myinfo")
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �� ���� ���� ó���� ��Ʈ�ѷ�
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String memUserId = request.getParameter("mem_userid");
		
		Member member = new MemberService().selectMember(memUserId);
		
		RequestDispatcher view = null;
		if(member != null) {
			view = request.getRequestDispatcher("views/mypage/mypageMain.jsp");
			request.setAttribute("member", member);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", memUserId + "�� �ش��ϴ� ȸ�� ���� ��ȸ ����!");
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
