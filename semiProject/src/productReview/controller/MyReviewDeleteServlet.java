package productReview.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productReview.model.service.PReviewService;

/**
 * Servlet implementation class MyReviewDeleteServlet
 */
@WebServlet("/mrdel")
public class MyReviewDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReviewDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 내가 쓴 후기 삭제하기
		String reviewNum = request.getParameter("no");
		String memUserId = request.getParameter("userid");
		int result = new PReviewService().deleteReview(reviewNum);
		
		System.out.println("리뷰 번호 : " + reviewNum);
		
		if(result > 0) {
			response.sendRedirect("/semi/mypreview?mem_userid=" + memUserId + "&page=1");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", reviewNum + "번 리뷰 삭제 실패!");
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
