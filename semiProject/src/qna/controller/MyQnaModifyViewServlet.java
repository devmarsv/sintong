package qna.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.MyQnaService;
import qna.model.vo.MyQna;

/**
 * Servlet implementation class MyQnaMViewServlet
 */
@WebServlet("/myqnaview")
public class MyQnaModifyViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyQnaModifyViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Qna 수정 페이지 보기
		String qnaNum = request.getParameter("pqnum");
		int currentPage = Integer.parseInt(request.getParameter("page"));
		
		MyQna mqview = new MyQnaService().selectQna(qnaNum);
				
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(mqview != null) {
			view = request.getRequestDispatcher("views/mypage/mypageQnaModify.jsp");
			request.setAttribute("mqview", mqview);
			request.setAttribute("page", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", qnaNum + "번 게시물 수정페이지 불러오기 실패!");
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
