package coupon.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import coupon.model.vo.Coupon;

import static common.JDBCTemplate.*;

public class CouponDao {

	public ArrayList<Coupon> selectList(Connection conn) {
		ArrayList<Coupon> list = new ArrayList<Coupon>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from coupon order by coupon_no desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
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
			close(stmt);
		}
		
		return list;
	}

}
