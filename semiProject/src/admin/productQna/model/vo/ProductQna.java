package admin.productQna.model.vo;

import java.sql.Date;

public class ProductQna implements java.io.Serializable {
	
	private static final long serialVersionUID = 7L;
	
	private String pqNo;
	private String pNo;
	private String pqTitle;
	private Date pqDate;
	private String pqQContent;
	private String pqAnsYN;
	private String pqAContent;
	private String pqSecret;
	private String pqQId;
	private String pqAId;
	
	public ProductQna() {}
	
	public ProductQna(String pqNo, String pNo, String pqTitle, Date pqDate, String pqQContent, String pqAnsYN, String pqAContent,
			String pqSecret, String pqQId, String pqAId) {
		super();
		this.pqNo = pqNo;
		this.pNo = pNo;
		this.pqTitle = pqTitle;
		this.pqDate = pqDate;
		this.pqQContent = pqQContent;
		this.pqAnsYN = pqAnsYN;
		this.pqAContent = pqAContent;
		this.pqSecret = pqSecret;
		this.pqQId = pqQId;
		this.pqAId = pqAId;
	}

	public String getPqNo() {
		return pqNo;
	}

	public String getpNo() {
		return pNo;
	}

	public String getPqTitle() {
		return pqTitle;
	}
	
	public Date getPqDate() {
		return pqDate;
	}

	public String getPqQContent() {
		return pqQContent;
	}

	public String getPqAnsYN() {
		return pqAnsYN;
	}

	public String getPqAContent() {
		return pqAContent;
	}

	public String getPqSecret() {
		return pqSecret;
	}

	public String getPqQId() {
		return pqQId;
	}

	public String getPqAId() {
		return pqAId;
	}

	public void setPqNo(String pqNo) {
		this.pqNo = pqNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public void setPqTitle(String pqTitle) {
		this.pqTitle = pqTitle;
	}
	
	public void setPqDate(Date pqDate) {
		this.pqDate = pqDate;
	}

	public void setPqQContent(String pqQContent) {
		this.pqQContent = pqQContent;
	}

	public void setPqAnsYN(String pqAnsYN) {
		this.pqAnsYN = pqAnsYN;
	}

	public void setPqAContent(String pqAContent) {
		this.pqAContent = pqAContent;
	}

	public void setPqSecret(String pqSecret) {
		this.pqSecret = pqSecret;
	}

	public void setPqQId(String pqQId) {
		this.pqQId = pqQId;
	}

	public void setPqAId(String pqAId) {
		this.pqAId = pqAId;
	}

	@Override
	public String toString() {
		return "ProductQna [pqNo=" + pqNo + ", pNo=" + pNo + ", pqTitle=" + pqTitle + ", pqDate=" + pqDate + ", pqQContent=" + pqQContent
				+ ", pqAnsYN=" + pqAnsYN + ", pqAContent=" + pqAContent + ", pqSecret=" + pqSecret + ", pqQId=" + pqQId
				+ ", pqAId=" + pqAId + "]";
	}
	
	
}
