package qna.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.MyQnaService;
import qna.model.vo.MyQna;

/**
 * Servlet implementation class MyQnaModifyServlet
 */
@WebServlet("/qnamodify")
public class MyQnaModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyQnaModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// QnA 수정하기
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		MyQna mqview = new MyQna();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		String pqnum = request.getParameter("pqnum");
		mqview.setmQnaNo(request.getParameter("pqnum"));
		mqview.setmQnaTitle(request.getParameter("mqtitle"));
		mqview.setQnaQContent(request.getParameter("mqcontent"));
		mqview.setQnaAnsYn(request.getParameter("mqayn"));
		mqview.setQnaAContent(request.getParameter("mqacontent"));
		mqview.setQnaQid(request.getParameter("mqwriter"));
		mqview.setQnaAid(request.getParameter("mqaid"));
		mqview.setmQnaDate(Date.valueOf(request.getParameter("mqdate")));
				
		int result = new MyQnaService().modifyQna(mqview);
		if(result > 0) {
			request.getSession(false).setAttribute("mqview", mqview);
			response.sendRedirect("/semi/myqna?mem_userid=" + mqview.getQnaQid() + "&page=" + currentPage);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/mypage/mypageError.jsp");
			request.setAttribute("message", mqview.getmQnaNo() + "번의 상품QnA 수정 실패!");
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
