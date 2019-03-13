package qna.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.MyQnaService;

/**
 * Servlet implementation class MyQnaDeleteServlet
 */
@WebServlet("/qnadel")
public class MyQnaDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyQnaDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 내가 쓴 qna 삭제하기
		String qnaNum = request.getParameter("no");
		String memUserId = request.getParameter("userid");
		int result = new MyQnaService().deleteQna(qnaNum);
		
		System.out.println("qna 번호 : " + qnaNum);
		
		if(result > 0) {
			response.sendRedirect("/semi/myqna?mem_userid=" + memUserId + "&page=1");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", qnaNum + "번 qna 삭제 실패!");
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
