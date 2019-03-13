package admin.event.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static common.JDBCTemplate.*;

public class EventDao {

	public int selectEventCount(Connection conn) {
		
		int eCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from event";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				eCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return eCount;
	}

}
