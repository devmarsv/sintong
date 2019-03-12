package admin.qna.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QnaDao {

	public int selectQnaCount(Connection conn) {
		
		int qnaCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from qna";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				qnaCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return qnaCount;
	}

}
