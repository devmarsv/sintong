package admin.event.model.vo;

import java.sql.Date;

public class Event implements java.io.Serializable {
	
	private static final long serialVersionUID = 6L;
	
	private String eNo;
	private String eTitle;
	private Date eDate;
	private String eContent;
	private String eImg;
	private String eReadCount;
	private String memUserId;
	
	public Event() {}
	
	public Event(String eNo, String eTitle, Date eDate, String eContent, String eImg, String eReadCount,
			String memUserId) {
		super();
		this.eNo = eNo;
		this.eTitle = eTitle;
		this.eDate = eDate;
		this.eContent = eContent;
		this.eImg = eImg;
		this.eReadCount = eReadCount;
		this.memUserId = memUserId;
	}

	public String geteNo() {
		return eNo;
	}

	public String geteTitle() {
		return eTitle;
	}

	public Date geteDate() {
		return eDate;
	}

	public String geteContent() {
		return eContent;
	}

	public String geteImg() {
		return eImg;
	}

	public String geteReadCount() {
		return eReadCount;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public void seteNo(String eNo) {
		this.eNo = eNo;
	}

	public void seteTitle(String eTitle) {
		this.eTitle = eTitle;
	}

	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}

	public void seteContent(String eContent) {
		this.eContent = eContent;
	}

	public void seteImg(String eImg) {
		this.eImg = eImg;
	}

	public void seteReadCount(String eReadCount) {
		this.eReadCount = eReadCount;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	@Override
	public String toString() {
		return "Event [eNo=" + eNo + ", eTitle=" + eTitle + ", eDate=" + eDate + ", eContent=" + eContent + ", eImg="
				+ eImg + ", eReadCount=" + eReadCount + ", memUserId=" + memUserId + "]";
	}
	
}
