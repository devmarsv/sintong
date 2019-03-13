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
			String userId, String userPwd) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//System.out.println("dao : " + userId + ", " + userPwd);
		String query = "select * from member "
				+ "where userid = ? and userpwd = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setUserId(userId);
				member.setUserPwd(userPwd);
				member.setUserName(rset.getString("username"));
				member.setGender(rset.getString("gender"));
				member.setAge(rset.getInt("age"));
				member.setPhone(rset.getString("phone"));
				member.setEmail(rset.getString("email"));
				member.setHobby(rset.getString("hobby"));
				member.setEtc(rset.getString("etc"));
				member.setEnrollDate(rset.getDate("enroll_date"));
				member.setLastModified(rset.getDate("lastmodified"));
				
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
	
	public Member selectMember(
			Connection conn, String userId) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
				
		String query = "select * from member "
				+ "where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setUserId(userId);
				member.setUserPwd(rset.getString("userpwd"));
				member.setUserName(rset.getString("username"));
				member.setGender(rset.getString("gender"));
				member.setAge(rset.getInt("age"));
				member.setPhone(rset.getString("phone"));
				member.setEmail(rset.getString("email"));
				member.setHobby(rset.getString("hobby"));
				member.setEtc(rset.getString("etc"));
				member.setEnrollDate(rset.getDate("enroll_date"));
				member.setLastModified(rset.getDate("lastmodified"));
				
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
			Connection conn, String userId) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from member where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
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
				+ "set username = ?, userpwd = ?, "
				+ "age = ?, phone = ?, email = ?, "
				+ "hobby = ?, etc = ?, "
				+ "lastmodified = sysdate "
				+ "where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserName());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getHobby());
			pstmt.setString(7, member.getEtc());
			pstmt.setString(8, member.getUserId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int selectCheckId(
			Connection conn, String userId) {
		int idCount = -1;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(userid) from member "
				+ "where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
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
		
		String query = "insert into member "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "sysdate, default)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getHobby());
			pstmt.setString(9, member.getEtc());
						
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
				
				member.setUserId(rset.getString("userid"));
				member.setUserPwd(rset.getString("userpwd"));
				member.setUserName(rset.getString("username"));
				member.setGender(rset.getString("gender"));
				member.setAge(rset.getInt("age"));
				member.setPhone(rset.getString("phone"));
				member.setEmail(rset.getString("email"));
				member.setHobby(rset.getString("hobby"));
				member.setEtc(rset.getString("etc"));
				member.setEnrollDate(rset.getDate("enroll_date"));
				member.setLastModified(rset.getDate("lastmodified"));
					
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

	public String findId(Connection conn, String userName, String email) {
		String findId = null;
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      System.out.println(userName);
	      System.out.println(email);
	      
	      String query = "select userid from member where username = ? and email = ?";
	      
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, userName);
	         pstmt.setString(2, email);
	         
	         rset = pstmt.executeQuery();
	         
	         if(rset.next()) {;
	            findId = rset.getString("userId");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         close(rset);
	         close(pstmt);
	      }
	      return findId;
	}

	public String findPwd(Connection conn, String userId, String userName, String email) {
		String findPwd = null;
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      System.out.println(userName);
	      System.out.println(email);
	      
	      String query = "select userpwd from member where userId = ? and username = ? and email = ?";
	      
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, userId);
	         pstmt.setString(2, userName);
	         pstmt.setString(3, email);
	         
	         rset = pstmt.executeQuery();
	         
	         if(rset.next()) {;
	            findPwd = rset.getString("userpwd");
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








