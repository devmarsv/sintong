package admin.notice.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static common.JDBCTemplate.*;

public class NoticeDao {

	public int selectNoticeCount(Connection conn) {
		int nCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from notice";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				nCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return nCount;
	}

}
