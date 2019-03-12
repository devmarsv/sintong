package admin.product.model.vo;

public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 2L;
	
	private String pNo;
	private String pCategory;
	private String pName;
	private int pPrice;
	private String pOption1;
	private String pOption2;
	private int pStock;
	private String pOrigin;
	private String pDesc;
	private String pDetail;
	private String pImg;
	private int pReviewNum;
	private int pQnaNum;
	private String sNo;
	
	public Product() {}
	
	public Product(String pNo, String pCategory, String pName, int pPrice, String pOption1, String pOption2, int pStock,
			String pOrigin, String pDesc, String pDetail, String pImg, int pReviewNum, int pQnaNum, String sNo) {
		super();
		this.pNo = pNo;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pOption1 = pOption1;
		this.pOption2 = pOption2;
		this.pStock = pStock;
		this.pOrigin = pOrigin;
		this.pDesc = pDesc;
		this.pDetail = pDetail;
		this.pImg = pImg;
		this.pReviewNum = pReviewNum;
		this.pQnaNum = pQnaNum;
		this.sNo = sNo;
	}

	public String getpNo() {
		return pNo;
	}

	public String getpCategory() {
		return pCategory;
	}

	public String getpName() {
		return pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public String getpOption1() {
		return pOption1;
	}

	public String getpOption2() {
		return pOption2;
	}

	public int getpStock() {
		return pStock;
	}

	public String getpOrigin() {
		return pOrigin;
	}

	public String getpDesc() {
		return pDesc;
	}

	public String getpDetail() {
		return pDetail;
	}

	public String getpImg() {
		return pImg;
	}

	public int getpReviewNum() {
		return pReviewNum;
	}

	public int getpQnaNum() {
		return pQnaNum;
	}

	public String getsNo() {
		return sNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public void setpOption1(String pOption1) {
		this.pOption1 = pOption1;
	}

	public void setpOption2(String pOption2) {
		this.pOption2 = pOption2;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public void setpOrigin(String pOrigin) {
		this.pOrigin = pOrigin;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public void setpReviewNum(int pReviewNum) {
		this.pReviewNum = pReviewNum;
	}

	public void setpQnaNum(int pQnaNum) {
		this.pQnaNum = pQnaNum;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", pCategory=" + pCategory + ", pName=" + pName + ", pPrice=" + pPrice
				+ ", pOption1=" + pOption1 + ", pOption2=" + pOption2 + ", pStock=" + pStock + ", pOrigin=" + pOrigin
				+ ", pDesc=" + pDesc + ", pDetail=" + pDetail + ", pImg=" + pImg + ", pReviewNum=" + pReviewNum
				+ ", pQnaNum=" + pQnaNum + ", sNo=" + sNo + "]";
	}
	
	
	
	
	
}
