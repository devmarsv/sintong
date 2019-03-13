package productReview.model.vo;

import java.sql.Date;

public class ProductReview {
	private String pReviewNo;
	private String productNo;
	private String pReviewTitle;
	private String pReviewContent;
	private String memUserid;
	private Date pReviewDate;
	
	public ProductReview() {}
	
	public ProductReview(String pReviewNo, String productNo, String pReviewTitle, String pReviewContent,
			String memUserid, Date pReviewDate) {
		super();
		this.pReviewNo = pReviewNo;
		this.productNo = productNo;
		this.pReviewTitle = pReviewTitle;
		this.pReviewContent = pReviewContent;
		this.memUserid = memUserid;
		this.pReviewDate = pReviewDate;
	}

	public String getpReviewNo() {
		return pReviewNo;
	}

	public void setpReviewNo(String pReviewNo) {
		this.pReviewNo = pReviewNo;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getpReviewTitle() {
		return pReviewTitle;
	}

	public void setpReviewTitle(String pReviewTitle) {
		this.pReviewTitle = pReviewTitle;
	}

	public String getpReviewContent() {
		return pReviewContent;
	}

	public void setpReviewContent(String pReviewContent) {
		this.pReviewContent = pReviewContent;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}
	
	public Date getpReviewDate() {
		return pReviewDate;
	}

	public void setpReviewDate(Date pReviewDate) {
		this.pReviewDate = pReviewDate;
	}
	
	@Override
	public String toString() {
		return this.pReviewNo + ", " + this.productNo + ", " + this.pReviewTitle
				+ ", " + this.pReviewContent + ", " + this.pReviewDate + ", " + this.memUserid;
	}
}
