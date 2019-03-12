package admin.product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.product.model.service.ProductService;


/**
 * Servlet implementation class ProductModifyAckServlet
 */
@WebServlet("/pmodack")
public class ProductModifyAckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductModifyAckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("pmodack in..");
		String pNo = request.getParameter("pno");
		String category = request.getParameter("category");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String stock = request.getParameter("stock");
		String origin = request.getParameter("origin");
		String desc = request.getParameter("desc");
		String detail = request.getParameter("detail");
		String img = request.getParameter("img");
		String reviewNum = request.getParameter("reviewnum");
		String qnaNum = request.getParameter("qnanum");
		String sNo = request.getParameter("sno");
		
		int result = new ProductService().updateProduct(pNo, category, name, price, option1, option2, stock, origin, desc, detail, img, reviewNum, qnaNum, sNo);
		RequestDispatcher view = null;
		if(result > 0) {
			view = request.getRequestDispatcher("views/admin/adminProductModifySuccess.jsp");
			request.setAttribute("message", "상품 정보 수정 완료!");
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/admin/adminError.jsp");
			request.setAttribute("message", "상품 정보 수정 실패");
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
