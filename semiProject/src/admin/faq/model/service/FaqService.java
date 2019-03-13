package admin.faq.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import admin.faq.model.dao.FaqDao;

public class FaqService {
	
	private FaqDao fdao = new FaqDao();

	public int selectFaqCount() {
		
		Connection conn = getConnection();
		int result = fdao.selectFaqCount(conn);
		close(conn);
		
		return result;
		
	}
	
}
