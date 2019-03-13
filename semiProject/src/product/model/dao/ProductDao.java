package product.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import product.model.vo.Product;

public class ProductDao {

	public Product selectProduct(Connection conn, String productNo) {
		Product product = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from product "
				+ "left join product_review using ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, productNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				product =  new Product();
				
				product.setpNo(productNo);
				product.setpCategory(rset.getString("product_category"));
				product.setpName(rset.getString("product_name"));
				product.setpPrice(rset.getInt("product_price"));
				product.setpOption1(rset.getString("product_option1"));
				product.setpOption2(rset.getString("product_option2"));
				product.setpStock(rset.getInt("product_stock"));
				product.setpOrigin(rset.getString("product_origin"));
				product.setpDesc(rset.getString("product_desc"));
				product.setpDetail(rset.getString("product_detail"));
				product.setpImg(rset.getString("product_img"));
				product.setpReviewNum(rset.getInt("product_reviewnum"));
				product.setpQnaNum(rset.getInt("product_qnanum"));
				product.setStoreNo(rset.getString("store_no"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return product;
	}

}
