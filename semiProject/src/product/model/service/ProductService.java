package product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import product.model.dao.ProductDao;
import product.model.vo.Product;

public class ProductService {
	
	private ProductDao pdao = new ProductDao();

	public Product selectProduct(String productNo) {
		Connection conn = getConnection();
		Product product = pdao.selectProduct(conn, productNo);
		close(conn);
		return product;
	}
}
