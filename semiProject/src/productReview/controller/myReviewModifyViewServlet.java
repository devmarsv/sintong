package productReview.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productReview.model.service.PReviewService;
import productReview.model.vo.ProductReview;

/**
 * Servlet implementation class myReviewModifyViewServlet
 */
@WebServlet("/myprview")
public class myReviewModifyViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myReviewModifyViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 후기 수정 페이지 보기
		String reviewNum = request.getParameter("prnum");
		int currentPage = Integer.parseInt(request.getParameter("page"));
		
		ProductReview preview = new PReviewService().selectReview(reviewNum);
				
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(preview != null) {
			view = request.getRequestDispatcher("views/mypage/mypageReviewModify.jsp");
			request.setAttribute("preview", preview);
			request.setAttribute("page", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", reviewNum + "번 게시물 수정페이지 불러오기 실패!");
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
