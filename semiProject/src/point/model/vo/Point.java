package point.model.vo;

import java.sql.Date;

public class Point {
	
	private String pointNo;
	private Date pointPublish;
	private Date pointExpire;
	private int pointValue;
	private String pointContent;
	private String memUserid;
	
	public Point() {}
	
	public Point(String pointNo, Date pointPublish, Date pointExpire, int pointValue, String pointContent, String memUserid) {
		super();
		this.pointNo = pointNo;
		this.pointPublish = pointPublish;
		this.pointExpire = pointExpire;
		this.pointValue = pointValue;
		this.pointContent = pointContent;
		this.memUserid = memUserid;
	}

	public String getPointNo() {
		return pointNo;
	}

	public void setPointNo(String pointNo) {
		this.pointNo = pointNo;
	}

	public Date getPointPublish() {
		return pointPublish;
	}

	public void setPointPublish(Date pointPublish) {
		this.pointPublish = pointPublish;
	}

	public Date getPointExpire() {
		return pointExpire;
	}

	public void setPointExpire(Date pointExpire) {
		this.pointExpire = pointExpire;
	}

	public long getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	public String getPointContent() {
		return pointContent;
	}

	public void setPointContent(String pointContent) {
		this.pointContent = pointContent;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}
	
	@Override
	public String toString() {
		return this.pointNo + ", " + this.pointPublish + ", " + this.pointExpire + ", " + this.pointValue + ", " + this.pointContent + ", " + this.memUserid;
	}
	
}
