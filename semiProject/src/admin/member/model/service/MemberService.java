package admin.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import admin.member.model.dao.MemberDao;
import admin.member.model.vo.Member;
import static common.JDBCTemplate.*;

public class MemberService {

	private MemberDao mdao = new MemberDao();
	
	public ArrayList<Member> selectAllList() {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectAllList(conn);
		close(conn);

		return list;
	}

	public Member selectMember(String userId) {
		
		Connection conn = getConnection();
		Member member = mdao.selectMember(conn, userId);
		close(conn);
		
		return member;
	}

	public int selectMemberCount() {
		
		Connection conn = getConnection();
		int result = mdao.selectMemberCount(conn);
		close(conn);
		
		return result;
	}

	public ArrayList<Member> selectMembers(String soption, String keyword, String grade, Boolean ds, String startDate,
			String endDate) {
		
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectMembers(conn, soption, keyword, grade, ds, startDate, endDate);
		close(conn);
		
		return list;
	}

	public int selectNewMemberCount() {
		
		Connection conn = getConnection();
		int result = mdao.selectNewMemberCount(conn);
		close(conn);
		
		return result;
	}
	
}
