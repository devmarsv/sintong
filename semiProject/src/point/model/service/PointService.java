package point.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import point.model.dao.PointDao;
import point.model.vo.Point;

public class PointService {
	private PointDao pdao = new PointDao();
	
	public PointService() {}
	
	public int getTotalPoint(String userId) {
		Connection conn = getConnection();
		int totalPoint = pdao.getTotalPoint(conn, userId);
		close(conn);
		return totalPoint;
	}

	public ArrayList<Point> selectList(String userId) {
		Connection conn = getConnection();
		ArrayList<Point> list = pdao.selectList(conn, userId);
		close(conn);
		return list;
	}
	
}
