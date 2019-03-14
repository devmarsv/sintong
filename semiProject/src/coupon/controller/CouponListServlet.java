package coupon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coupon.model.service.CouponService;
import coupon.model.vo.Coupon;

/**
 * Servlet implementation class CouponListServlet
 */
@WebServlet("/couponlist")
public class CouponListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CouponListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠폰 리스트 불러오기
		CouponService cservice = new CouponService();
		
		List<Coupon> couponList = cservice.selectList();
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(couponList != null) {
			view = request.getRequestDispatcher("views/mypage/mypageCoupon.jsp");
			request.setAttribute("couponList", couponList);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
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
