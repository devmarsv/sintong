package qna.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.MyQnaService;
import qna.model.vo.MyQna;

/**
 * Servlet implementation class MyQnaInsertServlet
 */
@WebServlet("/mqinsert")
public class MyQnaInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyQnaInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// QnA 등록하기
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		MyQna mqview = new MyQna();
		mqview.setmQnaTitle(request.getParameter("mqtitle"));
		mqview.setQnaQContent(request.getParameter("mqcontent"));
		mqview.setQnaQid(request.getParameter("mqwriter"));
				
		int result = new MyQnaService().insertQna(mqview);
		if(result > 0) {
			response.sendRedirect("/semi/myqna?mem_userid=" + mqview.getQnaQid());
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", "게시글 등록 실패!");
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
