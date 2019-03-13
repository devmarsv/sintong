package productReview.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import productReview.model.vo.ProductReview;
import productReview.model.vo.MyPdReview;

import static common.JDBCTemplate.*;

public class PReviewDao {

	public int getListCount(Connection conn, String userId) {
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from product_review where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
		return listCount;
	}

	public ArrayList<ProductReview> selectList(Connection conn, int currentPage, int limit, String userId) {
		ArrayList<ProductReview> list = new ArrayList<ProductReview>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from (select rownum rnum, "
				+ "product_review_no, product_no, "
				+ "product_review_title, "
				+ "product_review_content, "
				+ "mem_userid, product_review_date "
				+ "from (select * from product_review "
				+ "order by product_review_no desc)) "
				+ "where rnum >= ? and rnum <= ? and mem_userid = ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				ProductReview pr = new ProductReview();
				pr.setpReviewNo(rset.getString("product_review_no"));
				pr.setProductNo(rset.getString("product_no"));
				pr.setpReviewTitle(rset.getString("product_review_title"));
				pr.setpReviewContent(rset.getString("product_review_content"));
				pr.setMemUserid(rset.getString("mem_userid"));
				pr.setpReviewDate(rset.getDate("product_review_date"));
				
				list.add(pr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<MyPdReview> myReviewSelect(Connection conn, int currentPage, int limit, String userId) {
		ArrayList<MyPdReview> list = new ArrayList<MyPdReview>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from (select rownum rnum, "
				+ "product_review_no, product_no, "
				+ "product_review_title, "
				+ "product_review_content, "
				+ "mem_userid, product_review_date, product_img, product_name "
				+ "from (select * from product_review "
				+ "order by (substr(product_review_no, 7) * 1) desc) "
				+ "left join product using(product_no) where mem_userid = ?) "
				+ "where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				MyPdReview mypr = new MyPdReview();
				mypr.setpReviewNo(rset.getString("product_review_no"));
				mypr.setProductNo(rset.getString("product_no"));
				mypr.setpReviewTitle(rset.getString("product_review_title"));
				mypr.setpReviewContent(rset.getString("product_review_content"));
				mypr.setMemUserid(rset.getString("mem_userid"));
				mypr.setpReviewDate(rset.getDate("product_review_date"));
				mypr.setpImg(rset.getString("product_img"));
				mypr.setpName(rset.getString("product_name"));
				
				list.add(mypr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int modifyReview(Connection conn, ProductReview preview) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update product_review set "
				+ "product_no = ?, "
				+ "product_review_title = ?, "
				+ "product_review_content = ?, "
				+ "product_review_date = ?,"
				+ "mem_userid = ? "
				+ "where product_review_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, preview.getProductNo());
			pstmt.setString(2, preview.getpReviewTitle());
			pstmt.setString(3, preview.getpReviewContent());
			pstmt.setDate(4, preview.getpReviewDate());
			pstmt.setString(5, preview.getMemUserid());
			pstmt.setString(6, preview.getpReviewNo());
			
			result = pstmt.executeUpdate();
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public ProductReview selectReview(Connection conn, String reviewNum) {
		ProductReview pr = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from product_review where product_review_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reviewNum);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				pr = new ProductReview();
				
				pr.setProductNo(rset.getString("product_no"));
				pr.setpReviewNo(rset.getString("product_review_no"));
				pr.setpReviewTitle(rset.getString("product_review_title"));
				pr.setpReviewContent(rset.getString("product_review_content"));
				pr.setMemUserid(rset.getString("mem_userid"));
				pr.setpReviewDate(rset.getDate("product_review_date"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return pr;
	}

	public int deleteReview(Connection conn, String reviewNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from product_review where product_review_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reviewNum);
		
			result = pstmt.executeUpdate();
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}









