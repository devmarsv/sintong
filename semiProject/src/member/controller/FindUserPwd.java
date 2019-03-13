package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;

/**
 * Servlet implementation class FindUserPwd
 */
@WebServlet("/findUserPwd")
public class FindUserPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindUserPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아이디 찾기 컨트롤러
				// 1. 전송 온 값에 한글이 있다면, 인코딩처리함
				request.setCharacterEncoding("utf-8");
				// 내보낼 값에 한글이 있다면, 인코딩처리함
				response.setContentType("text/html; charset=utf-8");
				// 2. 전송 온 값 꺼내서 변수 또는 객체에 저장하기
				String userId = request.getParameter("userid");
				String userName = request.getParameter("username");
				String email = request.getParameter("email");
				
				// 3. 서비스 모델로 값 전달하고, 처리된 결과 받기
				// controller --> service --> dao
				String findPwd = new MemberService().findPwd(userId, userName, email);

				// 4. 받은 결과를 가지고 성공/실패에 따라 뷰 파일 내보내기
					
				if (findPwd != null) { // 조회가 성공했을 때
					HttpSession session = request.getSession();					
					session.setAttribute("findPwd", findPwd);
					response.sendRedirect("/semi/views/member/searchPwdResult.jsp");

				} else {
					// 찾기 실패시
					RequestDispatcher view = request.getRequestDispatcher("/views/member/memberError.jsp"); // 상대경로로 설정!
					request.setAttribute("message", "비밀번호 찾기에 실패하였습니다!" + "\n" + "아이디, 이름, 이메일을 확인하시고, 다시 시도하세요.");
					view.forward(request, response);
				}
	}

}
