package admin.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import admin.board.model.dao.BoardDao;
import static common.JDBCTemplate.*;

public class BoardService {

	private BoardDao bdao = new BoardDao();

	public ArrayList selectAll() {
		
		Connection conn = getConnection();
		ArrayList list = bdao.selectAll(conn);
		close(conn);
		
		return list;
	}
	
}
