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
	
	// �α��� üũ
	public Member loginCheck(String memUserid, String memPasswd) {
		Connection conn = getConnection();
		Member loginMember = mdao.selectLogin(conn, memUserid, memPasswd);
		close(conn);
		return loginMember;
	} 
	
	// ȸ�� �ҷ�����
	public Member selectMember(String memUserId) {
		Connection conn = getConnection();
		Member member = mdao.selectMember(conn, memUserId);
		close(conn);
		return member;
	}

	// ȸ�� ���� �����ϱ�
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


}







