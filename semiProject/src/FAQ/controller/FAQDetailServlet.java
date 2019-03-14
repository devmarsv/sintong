package FAQ.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FAQ.model.service.FAQService;
import FAQ.model.vo.FAQ;

/**
 * Servlet implementation class FAQDetailServlet
 */
@WebServlet("/fdetail")
public class FAQDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FAQDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int faqNo = Integer.parseInt(request.getParameter("fno"));
		int currentPage = 1;
		
		FAQService fservice = new FAQService();
		
		if(request.getParameter("page") == null) {
			
		}
		
		int result = fservice.addReadCount(faqNo);
		
		FAQ faq = fservice.selectFaq(faqNo);
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(faq != null) {
			view = request.getRequestDispatcher("views/board/boardFAQContent.jsp");
			request.setAttribute("faq", faq);
			request.setAttribute("currentPage", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/board/boardError.jsp");
			request.setAttribute("message", "FAQ 상세조회를 실패하였습니다.");
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
