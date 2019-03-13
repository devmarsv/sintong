package qna.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.MyQnaService;
import qna.model.vo.MyQna;

/**
 * Servlet implementation class MyQnaServlet
 */
@WebServlet("/myqna")
public class MyQnaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyQnaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 마이페이지 내가 쓴 qna 불러오기
		int currentPage = 1;
		if(request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		
		int limit = 5;
		
		MyQnaService qnaservice = new MyQnaService();
		String userId = request.getParameter("mem_userid");
		int listCount = qnaservice.getListCount(userId);
		
		ArrayList<MyQna> myqnaList = qnaservice.myQnaSelect(currentPage, limit, userId);
		
		int maxPage = (int)((double)listCount / limit + 0.8);
		int startPage = (((int)((double)currentPage / limit + 0.8)) - 1) * limit + 1;
		int endPage = startPage + limit - 1;
		
		if(maxPage < endPage)
			endPage = maxPage;
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(myqnaList.size() > 0) {
			view = request.getRequestDispatcher("views/mypage/mypageQnA.jsp");
			request.setAttribute("myqnaList", myqnaList);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("startPage", startPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("listCount", listCount);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", currentPage + "에 해당하는 페이지 상품 Qna 불러오기 에러!");
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
