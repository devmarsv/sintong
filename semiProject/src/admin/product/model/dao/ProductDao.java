package admin.product.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import admin.product.model.vo.Product;

import static common.JDBCTemplate.*;

public class ProductDao {

	public int selectProductCount(Connection conn) {
		
		int result = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from product";
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return result;
	}

	public ArrayList<Product> selectAllProduct(Connection conn) {
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from product";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Product p = new Product();
				
				p.setpNo(rset.getString("product_no"));
				p.setpCategory(rset.getString("product_category"));
				p.setpName(rset.getString("product_name"));
				p.setpPrice(rset.getInt("product_price"));
				p.setpOption1(rset.getString("product_option1"));
				p.setpOption2(rset.getString("product_option2"));
				p.setpStock(rset.getInt("product_stock"));
				p.setpOrigin(rset.getString("product_origin"));
				p.setpDesc(rset.getString("product_desc"));
				p.setpDetail(rset.getString("product_detail"));
				p.setpImg(rset.getString("product_img"));
				p.setpReviewNum(rset.getInt("product_reviewnum"));
				p.setpQnaNum(rset.getInt("product_qnanum"));
				p.setsNo(rset.getString("store_no"));
				
				list.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public ArrayList<Product> selectProducts(Connection conn, String soption, String keyword, String price) {
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from product ";
		
		
		switch(soption) {
		case "null" : 
			if(!price.equals("null"))
				query += "where product_price <= " + Integer.parseInt(price);
			break;
		case "pno" : 
			if(!price.equals("null"))
				query += "where product_no like '%" + keyword + "%' and product_price <= " + Integer.parseInt(price);
			else
				query += "where product_no like '%" + keyword + "%'";
			break;
		case "pname" :
			if(!price.equals("null"))
				query += "where product_name like '%" + keyword + "%' and product_price <= " + Integer.parseInt(price);
			else
				query += "where product_name like '%" + keyword + "%'";
			break;
		case "pstock" :
			if(!price.equals("null"))
				query += "where product_stock <= " + Integer.parseInt(keyword) + " and product_price <= " + Integer.parseInt(price);
			else
				query += "where product_stock <= " + Integer.parseInt(keyword);
			break;
		}
		
		System.out.println("query : " + query);
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Product p = new Product();
				
				p.setpNo(rset.getString("product_no"));
				p.setpCategory(rset.getString("product_category"));
				p.setpName(rset.getString("product_name"));
				p.setpPrice(rset.getInt("product_price"));
				p.setpOption1(rset.getString("product_option1"));
				p.setpOption2(rset.getString("product_option2"));
				p.setpStock(rset.getInt("product_stock"));
				p.setpOrigin(rset.getString("product_origin"));
				p.setpDesc(rset.getString("product_desc"));
				p.setpDetail(rset.getString("product_detail"));
				p.setpImg(rset.getString("product_img"));
				p.setpReviewNum(rset.getInt("product_reviewnum"));
				p.setpQnaNum(rset.getInt("product_qnanum"));
				p.setsNo(rset.getString("store_no"));
				
				list.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public Product selectProduct(Connection conn, String pNo) {
		
		Product p = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from product where product_no like ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				p = new Product();
				
				p.setpNo(rset.getString("product_no"));
				p.setpCategory(rset.getString("product_category"));
				p.setpName(rset.getString("product_name"));
				p.setpPrice(rset.getInt("product_price"));
				p.setpOption1(rset.getString("product_option1"));
				p.setpOption2(rset.getString("product_option2"));
				p.setpStock(rset.getInt("product_stock"));
				p.setpOrigin(rset.getString("product_origin"));
				p.setpDesc(rset.getString("product_desc"));
				p.setpDetail(rset.getString("product_detail"));
				p.setpImg(rset.getString("product_img"));
				p.setpReviewNum(rset.getInt("product_reviewnum"));
				p.setpQnaNum(rset.getInt("product_qnanum"));
				p.setsNo(rset.getString("store_no"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return p;
	}

	public int updateProduct(Connection conn, String pNo, String category, String name, String price, String option1,
			String option2, String stock, String origin, String desc, String detail, String img, String reviewNum,
			String qnaNum, String sNo) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String query = "update product set product_category = ?, product_name = ?, product_price = ?, product_option1 = ?, product_option2 = ?, product_stock = ?, product_origin = ?, product_desc = ?,"
				+ " product_detail = ?, product_img = ?, product_reviewnum = ?, product_qnanum = ?, store_no = ? where product_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, category);
			pstmt.setString(2, name);
			pstmt.setInt(3, Integer.parseInt(price));
			pstmt.setString(4, option1);
			pstmt.setString(5, option2);
			pstmt.setInt(6, Integer.parseInt(stock));
			pstmt.setString(7, origin);
			pstmt.setString(8, desc);
			pstmt.setString(9, detail);
			pstmt.setString(10, img);
			pstmt.setInt(11, Integer.parseInt(reviewNum));
			pstmt.setInt(12, Integer.parseInt(qnaNum));
			pstmt.setString(13, sNo);
			pstmt.setString(14, pNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("updateProduct query : " + query);
		return result;
	}

	public int deleteProduct(Connection conn, String pNo) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String query = "delete from product where product_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pNo);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


}
