package notice.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import notice.model.vo.Notice;

public class NoticeDao {
	public NoticeDao() {}

	public int getListCount(Connection con) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from notice";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

	public ArrayList<Notice> selectList(Connection con, int currentPage, int limit) {
	
		
		ArrayList<Notice> list = new ArrayList<Notice>();
		PreparedStatement pstmt = null;

		ResultSet rset = null;
		
		String query = "select *" +
				"from (select rownum rnum, notice_no, notice_title, notice_date, notice_content, notice_img, notice_readcount, mem_userid" + 
				"      from (select * from notice order by to_number(notice_no) desc))" + 
				"where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage -1) * limit + 1;
		int endRow = startRow + limit - 1;
	
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Notice n = new Notice();
				n.setNoticeNo(rset.getString("notice_no"));
				n.setNoticeTitle(rset.getString("notice_title"));
				n.setNoticeDate(rset.getDate("notice_date"));
				n.setNoticeContent(rset.getString("notice_content"));
				n.setNoticeImg(rset.getString("notice_img"));
				n.setNoticeReadCount(rset.getInt("notice_readcount"));
				n.setMemUserid(rset.getString("mem_userid"));
				
				list.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int addReadCount(Connection con, int noticeNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update notice set notice_readcount = notice_readcount + 1 where notice_no = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public Notice selectNotice(Connection con, int noticeNo) {
		Notice notice = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where notice_no = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				notice = new Notice();
				
				notice.setNoticeNo(Integer.toString(noticeNo));
				notice.setNoticeTitle(rset.getString("notice_title"));
				notice.setNoticeDate(rset.getDate("notice_date"));
				notice.setNoticeContent(rset.getString("notice_content"));
				notice.setNoticeImg(rset.getString("notice_img"));
				notice.setNoticeReadCount(rset.getInt("notice_readcount"));
				notice.setMemUserid(rset.getString("mem_userid")); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return notice;
	}

	public ArrayList<Notice> selectSearchTitle(Connection con, String search, int currentPage, int limit) {
		
		
		ArrayList<Notice> list = new ArrayList<Notice>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, notice_no, notice_title, notice_date, notice_content, notice_img, notice_readcount, mem_userid" + 
				"        from (select * from notice where notice_title like ? order by to_number(notice_no) desc))" + 
				"									where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage -1) * limit + 1;
		int endRow = startRow + limit - 1;
	
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + search + "%");
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Notice n = new Notice();
				n.setNoticeNo(rset.getString("notice_no"));
				n.setNoticeTitle(rset.getString("notice_title"));
				n.setNoticeDate(rset.getDate("notice_date"));
				n.setNoticeContent(rset.getString("notice_content"));
				n.setNoticeImg(rset.getString("notice_img"));
				n.setNoticeReadCount(rset.getInt("notice_readcount"));
				n.setMemUserid(rset.getString("mem_userid"));
				
				list.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int getSearchListCount(Connection con, String search) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from notice where notice_title like '%" + search + "%'" ;
		
		System.out.println("query : " + query);
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

	public ArrayList<Notice> selectSearchTitle(Connection con, String search) {
		
		ArrayList<Notice> list = new ArrayList<Notice>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where notice_title like ? order by to_number(notice_no) desc";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%"+search+"%");
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Notice n = new Notice();
				
				n.setNoticeNo(rset.getString("notice_no"));
				n.setNoticeTitle(rset.getString("notice_title"));
				n.setNoticeDate(rset.getDate("notice_date"));
				n.setNoticeContent(rset.getString("notice_content"));
				n.setNoticeImg(rset.getString("notice_img"));
				n.setNoticeReadCount(rset.getInt("notice_readcount"));
				n.setMemUserid(rset.getString("mem_userid"));
				
				list.add(n);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}


	
}
