package member.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;

import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {
	private MemberDao mdao = new MemberDao();
	
	public MemberService() {}
	
	//회원가입
	public int insertMember(Member member) {
		Connection conn = getConnection();
		int result = mdao.insertMember(conn, member);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	// 로그인 체크
	public Member loginCheck(String memUserid, String memPasswd) {
		Connection conn = getConnection();
		Member loginMember = mdao.selectLogin(conn, memUserid, memPasswd);
		close(conn);
		return loginMember;
	} 
	
	// 회원 불러오기
	public Member selectMember(String memUserId) {
		Connection conn = getConnection();
		Member member = mdao.selectMember(conn, memUserId);
		close(conn);
		return member;
	}

	// 회원 정보 수정하기
	public int updateMember(Member member) {
		Connection conn = getConnection();
		int result = mdao.updateMember(conn, member);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	// 비밀번호 확인
	public int passwdCheck(String userId, String userPw) {
		Connection conn = getConnection();
		int result = mdao.passwdCheck(conn, userId, userPw);
		close(conn);
		return result;
	}

	// 회원 총 포인트 조회
	public int getTotalPoint(String memUserId) {
		Connection conn = getConnection();
		int result = mdao.getTotalPoint(conn, memUserId);
		close(conn);
		return result;
	}

	// 회원 총 쿠폰 갯수 조회
	public int getTotalCoupon(String memUserId) {
		Connection conn = getConnection();
		int result = mdao.getTotalCoupon(conn, memUserId);
		close(conn);
		return result;
	}

	// 회원 탈퇴 처리
	public int deleteMember(String userId) {
		Connection conn = getConnection();
		int result = mdao.deleteMember(conn, userId);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}


}







