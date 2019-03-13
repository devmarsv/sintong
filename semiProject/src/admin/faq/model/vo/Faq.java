package admin.faq.model.vo;

import java.sql.Date;

public class Faq implements java.io.Serializable {
	
	private static final long serialVersionUID = 5L;
	
	private String fNo;
	private String fTitle;
	private Date fDate;
	private String fContent;
	private String fRepContent;
	private int fReadCount;
	private String memUserId;
	
	public Faq() {}

	public Faq(String fNo, String fTitle, Date fDate, String fContent, String fRepContent, int fReadCount,
			String memUserId) {
		super();
		this.fNo = fNo;
		this.fTitle = fTitle;
		this.fDate = fDate;
		this.fContent = fContent;
		this.fRepContent = fRepContent;
		this.fReadCount = fReadCount;
		this.memUserId = memUserId;
	}

	public String getfNo() {
		return fNo;
	}

	public String getfTitle() {
		return fTitle;
	}

	public Date getfDate() {
		return fDate;
	}

	public String getfContent() {
		return fContent;
	}

	public String getfRepContent() {
		return fRepContent;
	}

	public int getfReadCount() {
		return fReadCount;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public void setfNo(String fNo) {
		this.fNo = fNo;
	}

	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}

	public void setfContent(String fContent) {
		this.fContent = fContent;
	}

	public void setfRepContent(String fRepContent) {
		this.fRepContent = fRepContent;
	}

	public void setfReadCount(int fReadCount) {
		this.fReadCount = fReadCount;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	@Override
	public String toString() {
		return "Faq [fNo=" + fNo + ", fTitle=" + fTitle + ", fDate=" + fDate + ", fContent=" + fContent
				+ ", fRepContent=" + fRepContent + ", fReadCount=" + fReadCount + ", memUserId=" + memUserId + "]";
	}
	
}
