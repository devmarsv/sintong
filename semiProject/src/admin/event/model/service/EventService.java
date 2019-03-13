package admin.event.model.service;

import admin.event.model.dao.EventDao;

import static common.JDBCTemplate.*;

import java.sql.Connection;

public class EventService {

	private EventDao edao = new EventDao();

	public int selectEventCount() {
		
		Connection conn = getConnection();
		int eCount = edao.selectEventCount(conn);
		close(conn);
		
		return eCount;
	}
	
}
