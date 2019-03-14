package event.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import event.model.vo.Event;

public class EventDao {

	public int getListCount(Connection con) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from event";
		
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

	public ArrayList<Event> selectList(Connection con, int currentPage, int limit) {
		ArrayList<Event> list = new ArrayList<Event>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, substr(event_no,2), event_title, event_date, event_content, event_img, event_readcount, mem_userid " + 
				"      from (select * from event order by to_number(substr(event_no,2)) desc)) " + 
				"where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Event e = new Event();
				e.setEventNo(rset.getString("substr(event_no,2)"));
				e.setEventTitle(rset.getString("event_title"));
				e.setEventDate(rset.getDate("event_date"));
				e.setEventContent(rset.getString("event_content"));
				e.setEventImg(rset.getString("event_img"));
				e.setEventReadCount(rset.getInt("event_readcount"));
				e.setMemUserid(rset.getString("mem_userid"));
				
				list.add(e);
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int addReadCount(Connection con, int eventNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update event set event_readcount = event_readcount + 1 where substr(event_no,2) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, eventNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public Event selectEvent(Connection con, int eventNo) {
		Event event = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from event where substr(event_no,2) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, eventNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				event = new Event();
				
				event.setEventNo(Integer.toString(eventNo));
				event.setEventTitle(rset.getString("event_title"));
				event.setEventDate(rset.getDate("event_date"));
				event.setEventContent(rset.getString("event_content"));
				event.setEventImg(rset.getString("event_img"));
				event.setEventReadCount(rset.getInt("event_readcount"));
				event.setMemUserid(rset.getString("mem_userid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return event;
	}

	public int getSearchListCount(Connection con, String search) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from event where event_title like '%" + search + "%'";
		
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

	public ArrayList<Event> selectSearchTitle(Connection con, String search, int currentPage, int limit) {
		ArrayList<Event> list = new ArrayList<Event>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, substr(event_no,2), event_title, event_date, event_content, event_img, event_readcount, mem_userid " + 
				"      from (select * from event where event_title like ? order by to_number(substr(event_no,2)) desc)) " + 
				"where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + search + "%");
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Event e = new Event();
				e.setEventNo(rset.getString("substr(event_no,2)"));
				e.setEventTitle(rset.getString("event_title"));
				e.setEventDate(rset.getDate("event_date"));
				e.setEventContent(rset.getString("event_content"));
				e.setEventImg(rset.getString("event_img"));
				e.setEventReadCount(rset.getInt("event_readcount"));
				e.setMemUserid(rset.getString("mem_userid"));
				
				list.add(e);
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
