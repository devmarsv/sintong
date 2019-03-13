package productReview.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productReview.model.service.PReviewService;
import productReview.model.vo.ProductReview;

/**
 * Servlet implementation class ReviewModifyServlet
 */
@WebServlet("/rmodify")
public class ReviewModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 후기 수정
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		ProductReview preview = new ProductReview();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		String prnum = request.getParameter("prnum");
		preview.setpReviewNo(request.getParameter("prnum"));
		preview.setProductNo(request.getParameter("pnum"));
		preview.setpReviewTitle(request.getParameter("prtitle"));
		preview.setpReviewContent(request.getParameter("prcontent"));
		preview.setMemUserid(request.getParameter("prwriter"));
		preview.setpReviewDate(Date.valueOf(request.getParameter("prdate")));
				
		int result = new PReviewService().modifyReview(preview);
		if(result > 0) {
			request.getSession(false).setAttribute("ProductReview", preview);
			response.sendRedirect("/semi/mypreview?mem_userid=" + preview.getMemUserid() + "&page=" + currentPage);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", preview.getpReviewNo() + "번의 상품후기 수정 실패!");
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








