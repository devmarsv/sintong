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
				String mem_userid, String mem_passwd) {
			Connection conn = getConnection();
			Member loginMember = 
					mdao.selectLogin(conn, mem_userid, mem_passwd);
			close(conn);
			return loginMember;
		}

		public Member selectMember(String mem_userid) {
			Connection conn = getConnection();
			Member member = 
					mdao.selectMember(conn, mem_userid);
			close(conn);
			return member;
		}

		public int deleteMember(String mem_userid) {
			Connection conn = getConnection();
			int result = mdao.deleteMember(conn, mem_userid);
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

		public int selectCheckId(String mem_userid) {
			Connection conn = getConnection();
			int result = mdao.selectCheckId(conn, mem_userid);
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

		public String findId(String mem_name, String mem_email) {
			 Connection conn = getConnection();
	         String findId = mdao.findId(conn, mem_name, mem_email);
	         close(conn);
	         return findId;
		}

		public String findPwd(String mem_userid, String mem_name, String mem_email) {
			 Connection conn = getConnection();
	         String findPwd = mdao.findPwd(conn, mem_userid, mem_name, mem_email);
	         close(conn);
	         return findPwd;
		}
	}








