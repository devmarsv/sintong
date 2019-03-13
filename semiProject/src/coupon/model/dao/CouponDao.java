package coupon.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import coupon.model.vo.Coupon;

public class CouponDao {

	public ArrayList<Coupon> selectList(Connection conn, String userId) {
		ArrayList<Coupon> list = new ArrayList<Coupon>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from coupon where mem_userid = ? order by coupon_no desc";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Coupon p = new Coupon();
				p.setCouponNo(rset.getString("coupon_no"));
				p.setCouponName(rset.getString("coupon_name"));
				p.setCouponPublish(rset.getDate("coupon_publish"));
				p.setCouponExpire(rset.getDate("coupon_expire"));
				p.setCouponValue(rset.getInt("coupon_value"));
				p.setCoupontContent(rset.getString("coupon_content"));
				p.setMemUserid(rset.getString("mem_userid"));
				p.setCouponUsed(rset.getString("coupon_used"));
				
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
