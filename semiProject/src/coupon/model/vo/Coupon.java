package coupon.model.vo;

import java.sql.Date;

public class Coupon {
	
	private String couponNo;
	private String couponName;
	private Date couponPublish;
	private Date couponExpire;
	private int couponValue;
	private String coupontContent;
	private String memUserid;
	private	String couponUsed;
	
	public Coupon() {}
	
	public Coupon(String couponNo, String couponName, Date couponPublish, Date couponExpire, int couponValue,
			String coupontContent, String memUserid, String couponUsed) {
		super();
		this.couponNo = couponNo;
		this.couponName = couponName;
		this.couponPublish = couponPublish;
		this.couponExpire = couponExpire;
		this.couponValue = couponValue;
		this.coupontContent = coupontContent;
		this.memUserid = memUserid;
		this.couponUsed = couponUsed;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Date getCouponPublish() {
		return couponPublish;
	}

	public void setCouponPublish(Date couponPublish) {
		this.couponPublish = couponPublish;
	}

	public Date getCouponExpire() {
		return couponExpire;
	}

	public void setCouponExpire(Date couponExpire) {
		this.couponExpire = couponExpire;
	}

	public int getCouponValue() {
		return couponValue;
	}

	public void setCouponValue(int couponValue) {
		this.couponValue = couponValue;
	}

	public String getCoupontContent() {
		return coupontContent;
	}

	public void setCoupontContent(String coupontContent) {
		this.coupontContent = coupontContent;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}
	
	public String getCouponUsed() {
		return couponUsed;
	}

	public void setCouponUsed(String couponUsed) {
		this.couponUsed = couponUsed;
	}
	
	@Override
	public String toString() {
		return this.couponNo + ", " + this.couponName + ", " + this.couponPublish
				+ this.couponExpire + ", " + this.couponValue + ", " + this.coupontContent
				+ this.memUserid + this.couponUsed;
	}
}
