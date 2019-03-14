package qna.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QNA.model.service.QNAService;
import QNA.model.vo.QNA;

/**
 * Servlet implementation class QNADetailServlet
 */
@WebServlet("/qdetail")
public class QNADetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QNADetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int qnaNo = Integer.parseInt(request.getParameter("qno"));
		int currentPage = 1;
		
		QNAService qservice = new QNAService();
		
		if(request.getParameter("page") == null) {
			
		}
		
		int result = qservice.addReadCount(qnaNo);
		
		QNA qna = qservice.selectQNA(qnaNo);
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(qna != null) {
			view = request.getRequestDispatcher("views/board/boardQnAContent.jsp");
			request.setAttribute("qna", qna);
			request.setAttribute("currentPage", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/board/boardError.jsp");
			request.setAttribute("message", "QNA 議고쉶瑜� �떎�뙣�븯���뒿�땲�떎.");
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
