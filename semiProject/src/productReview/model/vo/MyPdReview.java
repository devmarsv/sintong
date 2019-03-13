package productReview.model.vo;

import java.sql.Date;

public class MyPdReview {
	private String pReviewNo;
	private String productNo;
	private String pReviewTitle;
	private String pReviewContent;
	private String memUserid;
	private Date pReviewDate;
	private String pName;
	private String pImg;
	
	public MyPdReview() {}
	
	public MyPdReview(String pReviewNo, String productNo, String pReviewTitle, String pReviewContent, String memUserid,
			Date pReviewDate, String pName, String pImg) {
		super();
		this.pReviewNo = pReviewNo;
		this.productNo = productNo;
		this.pReviewTitle = pReviewTitle;
		this.pReviewContent = pReviewContent;
		this.memUserid = memUserid;
		this.pReviewDate = pReviewDate;
		this.pName = pName;
		this.pImg = pImg;
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

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	@Override
	public String toString() {
		return "myPdReview [pReviewNo=" + pReviewNo + ", productNo=" + productNo + ", pReviewTitle=" + pReviewTitle
				+ ", pReviewContent=" + pReviewContent + ", memUserid=" + memUserid + ", pReviewDate=" + pReviewDate
				+ ", pName=" + pName + ", pImg=" + pImg + "]";
	}
	
}
