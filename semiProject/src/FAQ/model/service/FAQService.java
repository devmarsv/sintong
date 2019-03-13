package FAQ.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import FAQ.model.dao.FAQDao;
import FAQ.model.vo.FAQ;

public class FAQService {
	public FAQService() {}
	
	public int getListCount() {
		Connection con = getConnection();
		int listCount = new FAQDao().getListCount(con);
		close(con);
		return listCount;
	}

	public ArrayList<FAQ> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<FAQ> list = new FAQDao().selectList(con, currentPage, limit);
		close(con);
		return list;
	}

	public int addReadCount(int faqNo) {
		Connection con = getConnection();
		int result = new FAQDao().addReadCount(con, faqNo);
		if(result > 0)
			commit(con);
		else
			rollback(con);
		close(con);
		return result;
		
	}

	public FAQ selectFaq(int faqNo) {
		Connection con = getConnection();
		FAQ f = new FAQDao().selectFaq(con, faqNo);
		close(con);
		return f;
	}

	public int getSearchListCount(String search) {
		Connection con = getConnection();
		int listCount = new FAQDao().getSearchListCount(con, search);
		close(con);
		return listCount;
	}

	public ArrayList<FAQ> selectSearchTitle(String search, int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<FAQ> list = new FAQDao().selectSearchTitle(con, search, currentPage, limit);
		close(con);
		return list;
	}
	
}
