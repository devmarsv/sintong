package notice.model.vo;

import java.sql.Date;

public class Notice implements java.io.Serializable{
	private static final long serialVersionUID = 111L;
	
	private String noticeNo;
	private String noticeTitle;
	private Date noticeDate;
	private String noticeContent;
	private String noticeImg;
	private int noticeReadCount;
	private String memUserid;
	
	public Notice() {}

	

	public Notice(String noticeNo, String noticeTitle, Date noticeDate, String noticeContent, String noticeImg,
			int noticeReadCount, String memUserid) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.noticeDate = noticeDate;
		this.noticeContent = noticeContent;
		this.noticeImg = noticeImg;
		this.noticeReadCount = noticeReadCount;
		this.memUserid = memUserid;
	}



	public String getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeImg() {
		return noticeImg;
	}

	public void setNoticeImg(String noticeImg) {
		this.noticeImg = noticeImg;
	}
	

	public int getNoticeReadCount() {
		return noticeReadCount;
	}

	public void setNoticeReadCount(int readCount) {
		this.noticeReadCount = readCount;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.noticeNo + ", " + this.noticeTitle + ", " + this.noticeDate + ", " + this.noticeContent
				+ ", " + this.noticeImg + ", " + this.noticeReadCount + ", " + this.memUserid;
	}
	
}
