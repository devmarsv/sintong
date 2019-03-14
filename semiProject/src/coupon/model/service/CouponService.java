package coupon.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import coupon.model.dao.CouponDao;
import coupon.model.vo.Coupon;

public class CouponService {
	private CouponDao cdao = new CouponDao();

	public List<Coupon> selectList(String userId) {
		Connection conn = getConnection();
		ArrayList<Coupon> list = cdao.selectList(conn, userId);
		close(conn);
		return list;
	}
}
