package point.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import point.model.service.PointService;
import point.model.vo.Point;

/**
 * Servlet implementation class PointListServlet
 */
@WebServlet("/pointlist")
public class PointListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PointListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 포인트 리스트 불러오기
		PointService pservice = new PointService();
		String userId = request.getParameter("mem_userid");
		
		List<Point> pointList =  pservice.selectList();
		int totalPoint = pservice.getTotalPoint(userId);
		
		response.setContentType("text/html; charset=UTF-8");
		RequestDispatcher view = null;
		if(pointList != null) {
			view = request.getRequestDispatcher("views/mypage/mypagePoint.jsp");
			request.setAttribute("pointList", pointList);
			request.setAttribute("totalPoint", totalPoint);
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
