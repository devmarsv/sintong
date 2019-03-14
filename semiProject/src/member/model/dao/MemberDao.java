package member.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import member.model.vo.Member;

public class MemberDao {
	public MemberDao() {}
	
	public Member selectLogin(Connection conn, 
			String mem_userid, String mem_passwd) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		String query = "select * from member where mem_userid = ? and mem_passwd = ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem_userid);
			pstmt.setString(2, mem_passwd);
			
			rset = pstmt.executeQuery();
			
			System.out.println(4);
			
			if(rset.next()) {
				member = new Member();
			
				member.setMem_userid(mem_userid);
				member.setMem_passwd(mem_passwd);
				member.setMem_name(rset.getString("mem_name"));
				member.setMem_birth(rset.getDate("mem_birth"));
				member.setMem_gender(rset.getString("mem_gender"));
				member.setMem_tel(rset.getString("mem_tel"));
				member.setMem_email(rset.getString("mem_email"));
				member.setMem_addr1(rset.getString("mem_addr1"));
				member.setMem_addr2(rset.getString("mem_addr2"));
				member.setMem_enrollDate(rset.getDate("mem_enrollDate"));
				member.setMem_pointnum(rset.getInt("mem_pointnum"));
				member.setMem_couponnum(rset.getInt("mem_couponnum"));
				member.setGrade(rset.getString("grade"));
					
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}
	
	public Member selectMember(
			Connection conn, String mem_userid) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
				
		String query = "select * from member "
				+ "where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem_userid);			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setMem_userid(mem_userid);
				member.setMem_passwd(rset.getString("mem_passwd"));
				member.setMem_name(rset.getString("mem_name"));
				member.setMem_birth(rset.getDate("mem_birth"));
				member.setMem_gender(rset.getString("mem_gender"));
				member.setMem_tel(rset.getString("mem_tel"));
				member.setMem_email(rset.getString("mem_email"));
				member.setMem_addr1(rset.getString("mem_addr1"));
				member.setMem_addr2(rset.getString("mem_addr2"));
				member.setMem_enrollDate(rset.getDate("mem_enrollDate"));
				member.setMem_pointnum(rset.getInt("mem_pointnum"));
				member.setMem_couponnum(rset.getInt("mem_couponnum"));
				member.setGrade(rset.getString("grade"));
				//System.out.println("member : " + member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}

	public int deleteMember(
			Connection conn, String mem_userid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from member where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem_userid);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update member "
				+ "set mem_name = ?, mem_passwd = ?, "
				+ "mem_birth = ?, mem_tel = ?, mem_email = ?, "
				+ "mem_addr1 = ?, mem_addr2 = ?, "
				+ "where mem_userid = ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMem_name());
			pstmt.setString(2, member.getMem_passwd());
			pstmt.setDate(3, member.getMem_birth());
			pstmt.setString(4, member.getMem_tel());
			pstmt.setString(5, member.getMem_email());
			pstmt.setString(6, member.getMem_addr1());
			pstmt.setString(7, member.getMem_addr2());
			pstmt.setString(8, member.getMem_userid());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int selectCheckId(
			Connection conn, String mem_userid) {
		int idCount = -1;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(mem_userid) from member "
				+ "where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem_userid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				idCount = rset.getInt(1);
				//System.out.println("idCount : " + idCount);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}		
		
		return idCount;
	}

	public int insertMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate, default, default, 1)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMem_userid());
			pstmt.setString(2, member.getMem_passwd());
			pstmt.setString(3, member.getMem_name());
			pstmt.setDate(4, member.getMem_birth());
			pstmt.setString(5, member.getMem_gender());
			pstmt.setString(6, member.getMem_tel());
			pstmt.setString(7, member.getMem_email());
			pstmt.setString(8, member.getMem_addr1());
			pstmt.setString(9, member.getMem_addr2());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<Member> selectList(Connection conn) {
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Member member = new Member();
				
				member.setMem_userid(rset.getString("mem_userid"));
				member.setMem_passwd(rset.getString("mem_passwd"));
				member.setMem_name(rset.getString("mem_name"));
				member.setMem_birth(rset.getDate("mem_birth"));
				member.setMem_gender(rset.getString("mem_gender"));
				member.setMem_tel(rset.getString("mem_tel"));
				member.setMem_email(rset.getString("mem_email"));
				member.setMem_addr1(rset.getString("mem_addr1"));
				member.setMem_addr2(rset.getString("mem_addr2"));
				member.setMem_enrollDate(rset.getDate("mem_enrollDate"));
				member.setMem_pointnum(rset.getInt("mem_pointnum"));
				member.setMem_couponnum(rset.getInt("mem_couponnum"));
					
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public String findId(Connection conn, String mem_name, String mem_email) {
		String findId = null;
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      System.out.println(mem_name);
	      System.out.println(mem_email);
	      
	      String query = "select mem_userid from member where mem_name = ? and mem_email = ?";
	      
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, mem_name);
	         pstmt.setString(2, mem_email);
	         
	         rset = pstmt.executeQuery();
	         
	         if(rset.next()) {;
	            findId = rset.getString("mem_userid");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         close(rset);
	         close(pstmt);
	      }
	      return findId;
	}

	public String findPwd(Connection conn, String mem_userid, String mem_name, String mem_email) {
		String findPwd = null;
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      
	      String query = "select mem_passwd from member where mem_userid = ? and mem_name = ? and mem_email = ?";
	      
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, mem_userid);
	         pstmt.setString(2, mem_name);
	         pstmt.setString(3, mem_email);
	         
	         rset = pstmt.executeQuery();
	         
	         if(rset.next()) {;
	            findPwd = rset.getString("mem_passwd");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         close(rset);
	         close(pstmt);
	      }
	      return findPwd;
	}
}








