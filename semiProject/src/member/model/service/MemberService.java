package member.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {
	//의존성 주입 : DI
		private MemberDao mdao = new MemberDao();
		
		public MemberService() {}
		
		//로그인 요청 처리용
		public Member loginCheck(
				String userId, String userPwd) {
			Connection conn = getConnection();
			Member loginMember = 
					mdao.selectLogin(conn, userId, userPwd);
			close(conn);
			return loginMember;
		}

		public Member selectMember(String userId) {
			Connection conn = getConnection();
			Member member = 
					mdao.selectMember(conn, userId);
			close(conn);
			return member;
		}

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

		public int selectCheckId(String userId) {
			Connection conn = getConnection();
			int result = mdao.selectCheckId(conn, userId);
			close(conn);
			return result;
		}

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

		public ArrayList<Member> selectList() {
			Connection conn = getConnection();
			ArrayList<Member> list = mdao.selectList(conn);
			close(conn);
			return list;
		}

		public String findId(String userName, String email) {
			 Connection conn = getConnection();
	         String findId = mdao.findId(conn, userName, email);
	         close(conn);
	         return findId;
		}

		public String findPwd(String userId, String userName, String email) {
			 Connection conn = getConnection();
	         String findPwd = mdao.findPwd(conn, userId, userName, email);
	         close(conn);
	         return findPwd;
		}
	}








