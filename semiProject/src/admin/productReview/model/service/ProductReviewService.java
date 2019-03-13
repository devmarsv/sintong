package admin.productReview.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;

import admin.productReview.model.dao.ProductReviewDao;

public class ProductReviewService {
	
	private ProductReviewDao prdao = new ProductReviewDao();

	public int selectProductReviewCount() {
		
		Connection conn = getConnection();
		int result = prdao.selectProductReviewCount(conn);
		close(conn);
		
		return result;
		
	}
	
}
