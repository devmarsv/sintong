package admin.qna.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import admin.qna.model.dao.QnaDao;

public class QnaService {

	private QnaDao qdao = new QnaDao();

	public int selectQnaCount() {
		
		Connection conn = getConnection();
		int qnaCount = qdao.selectQnaCount(conn);
		close(conn);
		
		return qnaCount;
	}
}
