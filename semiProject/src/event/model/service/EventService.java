package event.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import event.model.dao.EventDao;
import event.model.vo.Event;

public class EventService {
	public EventService() {}
	
	public int getListCount() {
		Connection con = getConnection();
		int listCount = new EventDao().getListCount(con);
		close(con);
		return listCount;
	}

	public ArrayList<Event> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<Event> list = new EventDao().selectList(con, currentPage, limit);
		close(con);
		return list;
	}

	public int addReadCount(int eventNo) {
		Connection con = getConnection();
		int result = new EventDao().addReadCount(con, eventNo);
		if(result > 0)
			commit(con);
		else
			rollback(con);
		close(con);
		return result;
	}

	public Event selectEvent(int eventNo) {
		Connection con = getConnection();
		Event e = new EventDao().selectEvent(con, eventNo);
		close(con);
		return e;
	}

	public int getSearchListCount(String search) {
		Connection con = getConnection();
		int listCount = new EventDao().getSearchListCount(con, search);
		close(con);
		return listCount;
	}

	public ArrayList<Event> selectSearchTitle(String search, int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<Event> list = new EventDao().selectSearchTitle(con, search, currentPage, limit);
		close(con);
		return list;
	}

}
