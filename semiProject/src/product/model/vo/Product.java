package product.model.vo;

public class Product {
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
	private String storeNo;
	
	public Product() {}
	
	public Product(String pNo, String pCategory, String pName, int pPrice, String pOption1, String pOption2, int pStock,
			String pOrigin, String pDesc, String pDetail, String pImg, int pReviewNum, int pQnaNum, String storeNo) {
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
		this.storeNo = storeNo;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpOption1() {
		return pOption1;
	}

	public void setpOption1(String pOption1) {
		this.pOption1 = pOption1;
	}

	public String getpOption2() {
		return pOption2;
	}

	public void setpOption2(String pOption2) {
		this.pOption2 = pOption2;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public String getpOrigin() {
		return pOrigin;
	}

	public void setpOrigin(String pOrigin) {
		this.pOrigin = pOrigin;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public String getpDetail() {
		return pDetail;
	}

	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public int getpReviewNum() {
		return pReviewNum;
	}

	public void setpReviewNum(int pReviewNum) {
		this.pReviewNum = pReviewNum;
	}

	public int getpQnaNum() {
		return pQnaNum;
	}

	public void setpQnaNum(int pQnaNum) {
		this.pQnaNum = pQnaNum;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	@Override
	public String toString() {
		return pNo + ", " + pCategory + ", " + pName + ", " + pPrice
				+ ", " + pOption1 + ", " + pOption2 + ", " + pStock + ", " + pOrigin
				+ ", " + pDesc + ", " + pDetail + ", " + pImg + ", " + pReviewNum
				+ ", " + pQnaNum + ", " + storeNo;
	}
	
	
}
