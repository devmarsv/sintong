package admin.member.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String memUserId;
	private String memPasswd;
	private String memName;
	private Date memBirth;
	private String memGender;
	private String memTel;
	private String memEmail;
	private String memAddr1;
	private String memAddr2;
	private Date memEnrollDate;
	private int memPointNum;
	private int memCouponNum;
	private String memGrade;

	public Member() {}

	public Member(String memUserId, String memPasswd, String memName, Date memBirth, String memGender,
			String memTel, String memEmail, String memAddr1, String memAddr2, Date memEnrollDate, int memPointNum,
			int memCouponNum, String memGrade) {
		super();
		this.memUserId = memUserId;
		this.memPasswd = memPasswd;
		this.memName = memName;
		this.memBirth = memBirth;
		this.memGender = memGender;
		this.memTel = memTel;
		this.memEmail = memEmail;
		this.memAddr1 = memAddr1;
		this.memAddr2 = memAddr2;
		this.memEnrollDate = memEnrollDate;
		this.memPointNum = memPointNum;
		this.memCouponNum = memCouponNum;
		this.memGrade = memGrade;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public String getMemPasswd() {
		return memPasswd;
	}

	public String getMemName() {
		return memName;
	}

	public Date getMemBirth() {
		return memBirth;
	}

	public String getMemGender() {
		return memGender;
	}

	public String getMemTel() {
		return memTel;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public String getMemAddr1() {
		return memAddr1;
	}

	public String getMemAddr2() {
		return memAddr2;
	}

	public Date getMemEnrollDate() {
		return memEnrollDate;
	}

	public int getMemPointNum() {
		return memPointNum;
	}

	public int getMemCouponNum() {
		return memCouponNum;
	}

	public String getMemGrade() {
		return memGrade;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	public void setMemPasswd(String memPasswd) {
		this.memPasswd = memPasswd;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setMemBirth(Date memBirth) {
		this.memBirth = memBirth;
	}

	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}

	public void setMemTel(String memTel) {
		this.memTel = memTel;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public void setMemAddr1(String memAddr1) {
		this.memAddr1 = memAddr1;
	}

	public void setMemAddr2(String memAddr2) {
		this.memAddr2 = memAddr2;
	}

	public void setMemEnrollDate(Date memEnrollDate) {
		this.memEnrollDate = memEnrollDate;
	}

	public void setMemPointNum(int memPointNum) {
		this.memPointNum = memPointNum;
	}

	public void setMemCouponNum(int memCouponNum) {
		this.memCouponNum = memCouponNum;
	}

	public void setMemGrade(String memGrade) {
		this.memGrade = memGrade;
	}

	@Override
	public String toString() {
		return "Member [memUserId=" + memUserId + ", memPasswd=" + memPasswd + ", memName="
				+ memName + ", memBirth=" + memBirth + ", memGender=" + memGender + ", memTel=" + memTel
				+ ", memEmail=" + memEmail + ", memAddr1=" + memAddr1 + ", memAddr2=" + memAddr2 + ", memEnrollDate="
				+ memEnrollDate + ", memPointNum=" + memPointNum + ", memCouponNum=" + memCouponNum + ", memGradeCode="
				+ memGrade + "]";
	}
}
