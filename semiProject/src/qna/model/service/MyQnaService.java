package qna.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import qna.model.dao.MyQnaDao;
import qna.model.vo.MyQna;

import static common.JDBCTemplate.*;

public class MyQnaService {
	private MyQnaDao qdao = new MyQnaDao();

	public int getListCount(String userId) {
		Connection conn = getConnection();
		int result = qdao.getListCount(conn, userId);
		close(conn);
		return result;
	}

	public ArrayList<MyQna> myQnaSelect(int currentPage, int limit, String userId) {
		Connection conn = getConnection();
		ArrayList<MyQna> qnalist = qdao.myQnaSelect(conn, currentPage, limit, userId);
		close(conn);
		return qnalist;
	}

	public MyQna selectQna(String qnaNum) {
		Connection conn = getConnection();
		MyQna mqview = qdao.myQnaSelect(conn, qnaNum);
		close(conn);
		return mqview;
	}

	public int modifyQna(MyQna mqview) {
		Connection conn = getConnection();
		int result = qdao.modifyQna(conn, mqview);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public int deleteQna(String qnaNum) {
		Connection conn = getConnection();
		int result = qdao.deleteQna(conn, qnaNum);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public int insertQna(MyQna mqview) {
		Connection conn = getConnection();
		int result = qdao.insertQna(conn, mqview);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
	
	
}
