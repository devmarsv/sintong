package product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.service.ProductService;
import product.model.vo.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/prselect")
public class ProductReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductReviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 상품 불러오기
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String productNo = request.getParameter("product_no");
		
		Product prSelect = new ProductService().selectProduct(productNo);
		
		RequestDispatcher view = null;
		if(prSelect != null) {
			view = request.getRequestDispatcher("views/mypage/mypageReview.jsp");
			request.setAttribute("prSelect", prSelect);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", productNo + "에 해당하는 상품 정보가 없습니다!");
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
