package admin.productQna.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static common.JDBCTemplate.*;

public class ProductQnaDao {

	public int selectProductQnaCount(Connection conn) {

		int pqCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from product_qna";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				pqCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return pqCount;

	}

}
