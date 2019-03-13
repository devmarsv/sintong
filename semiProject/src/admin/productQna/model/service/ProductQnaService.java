package admin.productQna.model.service;

import java.sql.Connection;

import admin.productQna.model.dao.ProductQnaDao;
import static common.JDBCTemplate.*;

public class ProductQnaService {
	
	private ProductQnaDao pqdao = new ProductQnaDao();

	public int selectProductQnaCount() {
		
		Connection conn = getConnection();
		int pqCount = pqdao.selectProductQnaCount(conn);
		close(conn);
		
		return pqCount;
		
	}
}
