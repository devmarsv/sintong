package QNA.model.vo;

import java.sql.Date;

public class QNA implements java.io.Serializable{
	private static final long SerialVersionUID = 114L;
	
	private String qnaNo;
	private String qnaTitle;
	private Date qnaDate;
	private String qnaQcontent;
	private String qnaAnsYN;
	private String qnaAcontent;
	private String qnaQid;
	private String qnaAid;
	private int qnaReadCount;
	
	public QNA() {}

	public QNA(String qnaNo, String qnaTitle, Date qnaDate, String qnaQcontent, String qnaAnsYN, String qnaAcontent,
			String qnaQid, String qnaAid, int qnaReadCount) {
		super();
		this.qnaNo = qnaNo;
		this.qnaTitle = qnaTitle;
		this.qnaDate = qnaDate;
		this.qnaQcontent = qnaQcontent;
		this.qnaAnsYN = qnaAnsYN;
		this.qnaAcontent = qnaAcontent;
		this.qnaQid = qnaQid;
		this.qnaAid = qnaAid;
		this.qnaReadCount = qnaReadCount;
	}

	public String getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(String qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public String getQnaQcontent() {
		return qnaQcontent;
	}

	public void setQnaQcontent(String qnaQcontent) {
		this.qnaQcontent = qnaQcontent;
	}

	public String getQnaAnsYN() {
		return qnaAnsYN;
	}

	public void setQnaAnsYN(String qnaAnsYN) {
		this.qnaAnsYN = qnaAnsYN;
	}

	public String getQnaAcontent() {
		return qnaAcontent;
	}

	public void setQnaAcontent(String qnaAcontent) {
		this.qnaAcontent = qnaAcontent;
	}

	public String getQnaQid() {
		return qnaQid;
	}

	public void setQnaQid(String qnaQid) {
		this.qnaQid = qnaQid;
	}

	public String getQnaAid() {
		return qnaAid;
	}

	public void setQnaAid(String qnaAid) {
		this.qnaAid = qnaAid;
	}

	public int getQnaReadCount() {
		return qnaReadCount;
	}

	public void setQnaReadCount(int qnaReadCount) {
		this.qnaReadCount = qnaReadCount;
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	@Override
	public String toString() {
		return "QNA [qnaNo=" + qnaNo + ", qnaTitle=" + qnaTitle + ", qnaDate=" + qnaDate + ", qnaQcontent="
				+ qnaQcontent + ", qnaAnsYN=" + qnaAnsYN + ", qnaAcontent=" + qnaAcontent + ", qnaQid=" + qnaQid
				+ ", qnaAid=" + qnaAid + ", qnaReadCount=" + qnaReadCount + "]";
	}
	
	
}
