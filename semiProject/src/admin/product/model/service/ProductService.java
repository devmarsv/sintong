package admin.product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import admin.product.model.dao.ProductDao;
import admin.product.model.vo.Product;

public class ProductService {

	private ProductDao pdao = new ProductDao();
	
	public int selectProductCount() {
		
		Connection conn = getConnection();
		int result = pdao.selectProductCount(conn);
		close(conn);
		
		return result;
	}

	public ArrayList<Product> selectAllProduct() {
		
		Connection conn = getConnection();
		ArrayList<Product> list = pdao.selectAllProduct(conn);
		close(conn);
		
		return list;
	}

	public ArrayList<Product> selectProducts(String soption, String keyword, String price) {
		
		Connection conn = getConnection();
		ArrayList<Product> list = pdao.selectProducts(conn, soption, keyword, price);
		close(conn);
		
		return list;
	}

	public Product selectProduct(String pNo) {
		
		Connection conn = getConnection();
		Product p = pdao.selectProduct(conn, pNo);
		close(conn);
		
		return p;
	}

	public int updateProduct(String pNo, String category, String name, String price, String option1, String option2,
			String stock, String origin, String desc, String detail, String img, String reviewNum, String qnaNum,
			String sNo) {
		Connection conn = getConnection();
		int result = pdao.updateProduct(conn, pNo, category, name, price, option1, option2, stock, origin, desc, detail, img, reviewNum, qnaNum, sNo);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public int deleteProduct(String pNo) {
		
		Connection conn = getConnection();
		int result = pdao.deleteProduct(conn, pNo);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
		
	}

}
