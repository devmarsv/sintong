package admin.notice.model.vo;

import java.sql.Date;

public class Notice implements java.io.Serializable {
	
	private static final long serialVersionUID = 3L;
	
	private String nNo;
	private String nTitle;
	private Date nDate;
	private String nContent;
	private String nImg;
	private int nReadcount;
	private String memUserId;
	
	public Notice() {}

	public Notice(String nNo, String nTitle, Date nDate, String nContent, String nImg, int nReadcount,
			String memUserId) {
		super();
		this.nNo = nNo;
		this.nTitle = nTitle;
		this.nDate = nDate;
		this.nContent = nContent;
		this.nImg = nImg;
		this.nReadcount = nReadcount;
		this.memUserId = memUserId;
	}

	public String getnNo() {
		return nNo;
	}

	public String getnTitle() {
		return nTitle;
	}

	public Date getnDate() {
		return nDate;
	}

	public String getnContent() {
		return nContent;
	}

	public String getnImg() {
		return nImg;
	}

	public int getnReadcount() {
		return nReadcount;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public void setnNo(String nNo) {
		this.nNo = nNo;
	}

	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}

	public void setnDate(Date nDate) {
		this.nDate = nDate;
	}

	public void setnContent(String nContent) {
		this.nContent = nContent;
	}

	public void setnImg(String nImg) {
		this.nImg = nImg;
	}

	public void setnReadcount(int nReadcount) {
		this.nReadcount = nReadcount;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	@Override
	public String toString() {
		return "Notice [nNo=" + nNo + ", nTitle=" + nTitle + ", nDate=" + nDate + ", nContent=" + nContent + ", nImg="
				+ nImg + ", nReadcount=" + nReadcount + ", memUserId=" + memUserId + "]";
	}
	
}
