package admin.qna.model.vo;

import java.sql.Date;

public class Qna implements java.io.Serializable {

	private static final long serialVersionUID = 4L;
	
	private String qNo;
	private String qTitle;
	private Date qDate;
	private String qContent;
	private String qAnsYN;
	private String aContent;
	private String qId;
	private String aId;
	private int qReadCount;
	
	public Qna() {}
	
	public Qna(String qNo, String qTitle, Date qDate, String qContent, String qAnsYN, String aContent, String qId,
			String aId, int qReadCount) {
		super();
		this.qNo = qNo;
		this.qTitle = qTitle;
		this.qDate = qDate;
		this.qContent = qContent;
		this.qAnsYN = qAnsYN;
		this.aContent = aContent;
		this.qId = qId;
		this.aId = aId;
		this.qReadCount = qReadCount;
	}

	public String getqNo() {
		return qNo;
	}

	public String getqTitle() {
		return qTitle;
	}

	public Date getqDate() {
		return qDate;
	}

	public String getqContent() {
		return qContent;
	}

	public String getqAnsYN() {
		return qAnsYN;
	}

	public String getaContent() {
		return aContent;
	}

	public String getqId() {
		return qId;
	}

	public String getaId() {
		return aId;
	}

	public int getqReadCount() {
		return qReadCount;
	}

	public void setqNo(String qNo) {
		this.qNo = qNo;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public void setqDate(Date qDate) {
		this.qDate = qDate;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public void setqAnsYN(String qAnsYN) {
		this.qAnsYN = qAnsYN;
	}

	public void setaContent(String aContent) {
		this.aContent = aContent;
	}

	public void setqId(String qId) {
		this.qId = qId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public void setqReadCount(int qReadCount) {
		this.qReadCount = qReadCount;
	}

	@Override
	public String toString() {
		return "Qna [qNo=" + qNo + ", qTitle=" + qTitle + ", qDate=" + qDate + ", qContent=" + qContent + ", qAnsYN="
				+ qAnsYN + ", aContent=" + aContent + ", qId=" + qId + ", aId=" + aId + ", qReadCount=" + qReadCount
				+ "]";
	}
	
}
