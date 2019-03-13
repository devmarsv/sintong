package admin.member.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import admin.member.model.vo.Member;

public class MemberDao {

	public ArrayList<Member> selectAllList(Connection conn) {
		
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Member member = new Member();
				
				member.setMemUserId(rset.getString("mem_userid"));
				member.setMemPasswd(rset.getString("mem_passwd"));
				member.setMemName(rset.getString("mem_name"));
				member.setMemBirth(rset.getDate("mem_birth"));
				member.setMemGender(rset.getString("mem_gender"));
				member.setMemTel(rset.getString("mem_tel"));
				member.setMemEmail(rset.getString("mem_email"));
				member.setMemAddr1(rset.getString("mem_addr1"));
				member.setMemAddr2(rset.getString("mem_addr2"));
				member.setMemEnrollDate(rset.getDate("mem_enrolldate"));
				member.setMemPointNum(rset.getInt("mem_pointnum"));
				member.setMemCouponNum(rset.getInt("mem_couponnum"));
				member.setMemGrade(rset.getString("grade"));
				
				
				list.add(member);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public Member selectMember(Connection conn, String userId) {

		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setMemUserId(userId);
				member.setMemPasswd(rset.getString("mem_passwd"));
				member.setMemName(rset.getString("mem_name"));
				member.setMemBirth(rset.getDate("mem_birth"));
				member.setMemGender(rset.getString("mem_gender"));
				member.setMemTel(rset.getString("mem_tel"));
				member.setMemEmail(rset.getString("mem_email"));
				member.setMemAddr1(rset.getString("mem_addr1"));
				member.setMemAddr2(rset.getString("mem_addr2"));
				member.setMemEnrollDate(rset.getDate("mem_enrolldate"));
				member.setMemPointNum(rset.getInt("mem_pointnum"));
				member.setMemCouponNum(rset.getInt("mem_couponnum"));
				member.setMemGrade(rset.getString("grade"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
		return member;
	}

	public int selectMemberCount(Connection conn) {
		int result = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from member";
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return result;
	}

	public ArrayList<Member> selectMembers(Connection conn, String soption, String keyword, String grade, Boolean ds,
			String startDate, String endDate) {
		
		int index = 0;
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rset = null;
		
		
		Date sd = Date.valueOf(startDate);
		Date ed = Date.valueOf(endDate);
		System.out.println("sd : " + sd);
		String query = "select * from member where ";
		
		switch(soption) {
		case "id" :	query += "mem_userid like '%" + keyword + "%'"; break;
		case "name" : query += "mem_name like '%" + keyword + "%'"; break;
		case "email" : query += "mem_email like '%" + keyword + "%'"; break;
		case "tel" : query += "mem_tel like '%" + keyword + "%'"; break;
		case "null" : break;
		default : break;
		}
		
		if(soption.equals("null") && !grade.equals("null")) {
			query += "grade = " + grade;
			if(ds)
				query += "and mem_enrolldate between '" + sd + "' and '" + ed + "'";
		} else if(!soption.equals("null") && !grade.equals("null")){
			query += "and grade = " + grade;
			if(ds)
				query += "and mem_enrolldate between '" + sd + "' and '" + ed + "'";
			
		} else if(soption.equals("null") && grade.equals("null")) {
			if(ds)
				query += "mem_enrolldate between '" + sd + "' and '" + ed + "'";
		}
		
		System.out.println("query : " + query);
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Member member = new Member();
				
				member.setMemUserId(rset.getString("mem_userid"));
				member.setMemPasswd(rset.getString("mem_passwd"));
				member.setMemName(rset.getString("mem_name"));
				member.setMemBirth(rset.getDate("mem_birth"));
				member.setMemGender(rset.getString("mem_gender"));
				member.setMemTel(rset.getString("mem_tel"));
				member.setMemEmail(rset.getString("mem_email"));
				member.setMemAddr1(rset.getString("mem_addr1"));
				member.setMemAddr2(rset.getString("mem_addr2"));
				member.setMemEnrollDate(rset.getDate("mem_enrolldate"));
				member.setMemPointNum(rset.getInt("mem_pointnum"));
				member.setMemCouponNum(rset.getInt("mem_couponnum"));
				member.setMemGrade(rset.getString("grade"));
				
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public int selectNewMemberCount(Connection conn) {
		
		int result = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from member where to_char(mem_enrolldate, 'yyyymmdd') = to_char(sysdate, 'yyyymmdd')";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return result;
	}

	public int updateMember(Connection conn, String userId, String grade) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String query = "update member set grade = ? where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, grade);
			pstmt.setString(2, userId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteMember(Connection conn, Member deleteMember) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query1 = "insert into drop_member values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query1);
			pstmt.setString(1, deleteMember.getMemUserId());
			pstmt.setString(2, deleteMember.getMemPasswd());
			pstmt.setString(3, deleteMember.getMemName());
			pstmt.setDate(4, deleteMember.getMemBirth());
			pstmt.setString(5, deleteMember.getMemGender());
			pstmt.setString(6, deleteMember.getMemTel());
			pstmt.setString(7, deleteMember.getMemEmail());
			pstmt.setString(8, deleteMember.getMemAddr1());
			pstmt.setString(9, deleteMember.getMemAddr2());
			pstmt.setDate(10, deleteMember.getMemEnrollDate());
			pstmt.setInt(11, deleteMember.getMemPointNum());
			pstmt.setInt(12, deleteMember.getMemCouponNum());
			pstmt.setString(13, deleteMember.getMemGrade());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		System.out.println("insert drop result : " + result);
		
		PreparedStatement pstmt1 = null;
		
		String query2 = "delete from member where mem_userid = ?";
		
		try {
			pstmt1 = conn.prepareStatement(query2);
			pstmt1.setString(1, deleteMember.getMemUserId());
			
			result = pstmt1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt1);
		}
		
		return result;
	}

}
