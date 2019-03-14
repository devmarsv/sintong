package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String mem_userid;
	private String mem_passwd;
	private String mem_name; 
	private Date mem_birth;
	private String mem_gender;
	private String mem_tel;
	private String mem_email;
	private String mem_addr1;
	private String mem_addr2;
	private Date mem_enrollDate;
	private int mem_pointnum;
	private int mem_couponnum;
	private String grade;
	
	public Member() {}

	public Member(String mem_userid, String mem_passwd, String mem_name, Date mem_birth, String mem_gender,
			String mem_tel, String mem_email, String mem_addr1, String mem_addr2, Date mem_enrollDate, int mem_pointnum,
			int mem_couponnum, String grade) {
		super();
		this.mem_userid = mem_userid;
		this.mem_passwd = mem_passwd;
		this.mem_name = mem_name;
		this.mem_birth = mem_birth;
		this.mem_gender = mem_gender;
		this.mem_tel = mem_tel;
		this.mem_email = mem_email;
		this.mem_addr1 = mem_addr1;
		this.mem_addr2 = mem_addr2;
		this.mem_enrollDate = mem_enrollDate;
		this.mem_pointnum = mem_pointnum;
		this.mem_couponnum = mem_couponnum;
		this.grade = grade;
	}

	public String getMem_userid() {
		return mem_userid;
	}

	public void setMem_userid(String mem_userid) {
		this.mem_userid = mem_userid;
	}

	public String getMem_passwd() {
		return mem_passwd;
	}

	public void setMem_passwd(String mem_passwd) {
		this.mem_passwd = mem_passwd;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public Date getMem_birth() {
		return mem_birth;
	}

	public void setMem_birth(Date mem_birth) {
		this.mem_birth = mem_birth;
	}

	public String getMem_gender() {
		return mem_gender;
	}

	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}

	public String getMem_tel() {
		return mem_tel;
	}

	public void setMem_tel(String mem_tel) {
		this.mem_tel = mem_tel;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_addr1() {
		return mem_addr1;
	}

	public void setMem_addr1(String mem_addr1) {
		this.mem_addr1 = mem_addr1;
	}

	public String getMem_addr2() {
		return mem_addr2;
	}

	public void setMem_addr2(String mem_addr2) {
		this.mem_addr2 = mem_addr2;
	}

	public Date getMem_enrollDate() {
		return mem_enrollDate;
	}

	public void setMem_enrollDate(Date mem_enrollDate) {
		this.mem_enrollDate = mem_enrollDate;
	}

	public int getMem_pointnum() {
		return mem_pointnum;
	}

	public void setMem_pointnum(int mem_pointnum) {
		this.mem_pointnum = mem_pointnum;
	}

	public int getMem_couponnum() {
		return mem_couponnum;
	}

	public void setMem_couponnum(int mem_couponnum) {
		this.mem_couponnum = mem_couponnum;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return this.mem_userid + ", " + this.mem_passwd + ", " + 
				this.mem_name + ", " + this.mem_birth + ", " + 
				this.mem_gender + ", " + this.mem_tel + ", " + 
				this.mem_email + ", " + this.mem_addr1 + ", " + 
				this.mem_addr2+ ", " +this.mem_enrollDate + ", " + 
				this.mem_pointnum + ", " + this.mem_couponnum + ", " + 
				this.grade;
	}
	
}







