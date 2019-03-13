package point.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import point.model.vo.Point;

public class PointDao {
	public PointDao() {}
	
	// 총 포인트 조회
	public int getTotalPoint(Connection conn, String userId) {
		int totalPoint = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
				
		String query ="select sum(point_value)"
		+ "from point "
		+ "where mem_userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
					
			if(rset.next()) {
				totalPoint = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			close(rset);
			close(pstmt);
		}
		
		return totalPoint;
	}

	public ArrayList<Point> selectList(Connection conn, String userId) {
		ArrayList<Point> list = new ArrayList<Point>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from point where mem_userid= ? order by point_no desc;";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Point p = new Point();
				p.setPointNo(rset.getString("point_no"));
				p.setPointPublish(rset.getDate("point_publish"));
				p.setPointExpire(rset.getDate("point_expire"));
				p.setPointValue(rset.getInt("point_value"));
				p.setPointContent(rset.getString("point_content"));
				p.setMemUserid(rset.getString("mem_userid"));
				
				list.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
}












