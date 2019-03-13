package productReview.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import productReview.model.dao.PReviewDao;
import productReview.model.vo.ProductReview;
import productReview.model.vo.MyPdReview;

public class PReviewService {
	private PReviewDao prdao = new PReviewDao();

	public int getListCount(String userId) {
		Connection conn = getConnection();
		int listCount = prdao.getListCount(conn, userId);
		close(conn);
		return listCount;
	}

	public ArrayList<ProductReview> selectList(int currentPage, int limit, String userId) {
		Connection conn = getConnection();
		ArrayList<ProductReview> list = prdao.selectList(conn, currentPage, limit, userId);
		close(conn);
		return list;
	}

	public ArrayList<MyPdReview> myReviewSelect(int currentPage, int limit, String userId) {
		Connection conn = getConnection();
		ArrayList<MyPdReview> list = prdao.myReviewSelect(conn, currentPage, limit, userId);
		close(conn);
		return list;
	}

	public int modifyReview(ProductReview preview) {
		Connection conn = getConnection();
		int result = prdao.modifyReview(conn, preview);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public ProductReview selectReview(String reviewNum) {
		Connection conn = getConnection();
		ProductReview preview = prdao.selectReview(conn, reviewNum);
		close(conn);
		return preview;
	}

	public int deleteReview(String reviewNum) {
		Connection conn = getConnection();
		int result = prdao.deleteReview(conn, reviewNum);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

}








