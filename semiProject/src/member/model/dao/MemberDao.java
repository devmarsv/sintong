package member.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.model.vo.Member;

public class MemberDao {
	public MemberDao() {}
	
	public Member selectLogin(Connection conn, String memUserid, String memPasswd) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member "
						+ "where mem_userid = ? and mem_passwd = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memUserid);
			pstmt.setString(2, memPasswd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setMemUserid(memUserid);
				member.setMemPasswd(memPasswd);
				member.setMemName(rset.getString("mem_name"));
				member.setMemBirth(rset.getDate("mem_birth"));
				member.setMemGender(rset.getString("mem_gender"));
				member.setMemTel(rset.getString("mem_tel"));
				member.setMemEmail(rset.getString("mem_email"));
				member.setMemAddr1(rset.getString("mem_addr1"));
				member.setMemAddr2(rset.getString("mem_addr2"));
				member.setMemEnrolldate(rset.getDate("mem_enrolldate"));
				member.setMemPoint(rset.getInt("mem_pointnum"));
				member.setMemCoupon(rset.getInt("mem_couponnum"));
				member.setGrade(rset.getString("grade"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}
	
	public Member selectMember(Connection conn, String memUserId) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memUserId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setMemUserid(memUserId);
				member.setMemPasswd(rset.getString("mem_passwd"));
				member.setMemName(rset.getString("mem_name"));
				member.setMemBirth(rset.getDate("mem_birth"));
				member.setMemGender(rset.getString("mem_gender"));
				member.setMemTel(rset.getString("mem_tel"));
				member.setMemEmail(rset.getString("mem_email"));
				member.setMemAddr1(rset.getString("mem_addr1"));
				member.setMemAddr2(rset.getString("mem_addr2"));
				member.setMemEnrolldate(rset.getDate("mem_enrolldate"));
				member.setMemPoint(rset.getInt("mem_pointnum"));
				member.setMemCoupon(rset.getInt("mem_couponnum"));
				member.setGrade(rset.getString("grade"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return member;
	}

	public int updateMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update member "
		+ "set mem_passwd = ?, "
		+ "mem_name = ?, "
		+ "mem_birth = ?, "
		+ "mem_gender = ?, mem_tel = ?, "
		+ "mem_email = ?, "
		+ "mem_addr1 = ? "
		+ "where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemPasswd());
			pstmt.setString(2, member.getMemName());
			pstmt.setDate(3, member.getMemBirth());
			pstmt.setString(4, member.getMemGender());
			pstmt.setString(5, member.getMemTel());
			pstmt.setString(6, member.getMemEmail());
			pstmt.setString(7, member.getMemAddr1());
			pstmt.setString(8, member.getMemUserid());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	
}
