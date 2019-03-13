package admin.productReview.model.vo;

import java.sql.Date;

public class ProductReview implements java.io.Serializable {
	
	private static final long serialVersionUID = 8L;
	
	private String prNo;
	private String pNo;
	private Date prDate;
	private String prTitle;
	private String prContent;
	private String memUserId;
	
	public ProductReview() {}

	public ProductReview(String prNo, String pNo, Date prDate, String prTitle, String prContent, String memUserId) {
		super();
		this.prNo = prNo;
		this.pNo = pNo;
		this.prDate = prDate;
		this.prTitle = prTitle;
		this.prContent = prContent;
		this.memUserId = memUserId;
	}

	public String getPrNo() {
		return prNo;
	}

	public String getpNo() {
		return pNo;
	}
	
	public Date getPrDate() {
		return prDate;
	}

	public String getPrTitle() {
		return prTitle;
	}

	public String getPrContent() {
		return prContent;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	
	public void setprDate(Date prDate) {
		this.prDate = prDate;
	}

	public void setPrTitle(String prTitle) {
		this.prTitle = prTitle;
	}

	public void setPrContent(String prContent) {
		this.prContent = prContent;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	@Override
	public String toString() {
		return "ProductReview [prNo=" + prNo + ", pNo=" + pNo + ", prTitle=" + prTitle + ", prContent=" + prContent
				+ ", memUserId=" + memUserId + "]";
	}
	
}
