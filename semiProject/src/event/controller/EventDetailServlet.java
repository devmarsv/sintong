package event.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import event.model.service.EventService;
import event.model.vo.Event;

/**
 * Servlet implementation class EventDetailServlet
 */
@WebServlet("/edetail")
public class EventDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eventNo = Integer.parseInt(request.getParameter("eno"));
		int currentPage = 1;
		
		EventService eservice = new EventService();
		
		if(request.getParameter("page") == null) {
			
		}
		
		int result = eservice.addReadCount(eventNo);
		
		Event event = eservice.selectEvent(eventNo);
		
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher view = null;
		if(event != null) {
			view = request.getRequestDispatcher("views/board/boardEventContent.jsp");
			request.setAttribute("event", event);
			request.setAttribute("currentPage", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/board/boardError.jsp");
			request.setAttribute("message", "이벤트 상세조회를 실패하였습니다.");
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
