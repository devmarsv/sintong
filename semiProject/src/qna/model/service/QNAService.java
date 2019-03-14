package qna.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import QNA.model.dao.QNADao;
import QNA.model.vo.QNA;
import static common.JDBCTemplate.*;

public class QNAService {

	public int getListCount() {
		Connection con = getConnection();
		int listCount = new QNADao().getListCount(con);
		close(con);
		return listCount;
	}

	public ArrayList<QNA> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<QNA> list = new QNADao().selectList(con, currentPage, limit);
		close(con);
		return list;
	}

	public int addReadCount(int qnaNo) {
		Connection con = getConnection();
		int result  = new QNADao().addReadCount(con, qnaNo);
		if(result > 0)
			commit(con);
		else
			rollback(con);
		close(con);
		return result;
	}

	public QNA selectQNA(int qnaNo) {
		Connection con = getConnection();
		QNA q = new QNADao().selectQNA(con, qnaNo);
		close(con);
		return q;
	}

	public int getSearchListCount(String search) {
		Connection con = getConnection();
		int listCount = new QNADao().getSearchListCount(con, search);
		close(con);
		return listCount;
	}

	public ArrayList<QNA> selectSearchTitle(String search, int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<QNA> list = new QNADao().selectSearchTitle(con, search, currentPage, limit);
		close(con);
		return list;
	}

}
