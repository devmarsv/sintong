package FAQ.model.vo;

import java.sql.Date;

public class FAQ implements java.io.Serializable{
	private static final long SerialVersionUID = 112L;
	
	private String faqNo;
	private String faqTitle;
	private Date faqDate;
	private String faqContent;
	private String faqReplyContent;
	private int faqReadCount;
	private String memUserid;
	
	public FAQ() {}

	public FAQ(String faqNo, String faqTitle, Date faqDate, String faqContent, String faqReplyContent, int faqReadCount,
			String memUserid) {
		super();
		this.faqNo = faqNo;
		this.faqTitle = faqTitle;
		this.faqDate = faqDate;
		this.faqContent = faqContent;
		this.faqReplyContent = faqReplyContent;
		this.faqReadCount = faqReadCount;
		this.memUserid = memUserid;
	}

	public String getFaqNo() {
		return faqNo;
	}

	public void setFaqNo(String faqNo) {
		this.faqNo = faqNo;
	}

	public String getFaqTitle() {
		return faqTitle;
	}

	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}

	public Date getFaqDate() {
		return faqDate;
	}

	public void setFaqDate(Date faqDate) {
		this.faqDate = faqDate;
	}

	public String getFaqContent() {
		return faqContent;
	}

	public void setFaqContent(String faqContent) {
		this.faqContent = faqContent;
	}

	public String getFaqReplyContent() {
		return faqReplyContent;
	}

	public void setFaqReplyContent(String faqReplyContent) {
		this.faqReplyContent = faqReplyContent;
	}

	public int getFaqReadCount() {
		return faqReadCount;
	}

	public void setFaqReadCount(int faqReadCount) {
		this.faqReadCount = faqReadCount;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.faqNo + ", " + this.faqTitle + ", " + this.faqDate + ", " + this.faqContent
				 + ", " + this.faqReplyContent + ", " + this.faqReadCount + ", " + this.memUserid;
	}
}
