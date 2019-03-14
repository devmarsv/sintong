package qna.model.vo;

import java.sql.Date;

public class MyQna {
	
	private String mQnaNo;
	private String mQnaTitle;
	private Date mQnaDate;
	private String qnaQContent;
	private String qnaAnsYn;
	private String qnaAContent;
	private String qnaQid;
	private String qnaAid;
	
	public MyQna() {}
	
	public MyQna(String mQnaNo, String mQnaTitle, Date mQnaDate, String qnaQContent, String qnaAnsYn,
			String qnaAContent, String qnaQid, String qnaAid) {
		super();
		this.mQnaNo = mQnaNo;
		this.mQnaTitle = mQnaTitle;
		this.mQnaDate = mQnaDate;
		this.qnaQContent = qnaQContent;
		this.qnaAnsYn = qnaAnsYn;
		this.qnaAContent = qnaAContent;
		this.qnaQid = qnaQid;
		this.qnaAid = qnaAid;
	}

	public String getmQnaNo() {
		return mQnaNo;
	}

	public void setmQnaNo(String mQnaNo) {
		this.mQnaNo = mQnaNo;
	}

	public String getmQnaTitle() {
		return mQnaTitle;
	}

	public void setmQnaTitle(String mQnaTitle) {
		this.mQnaTitle = mQnaTitle;
	}

	public Date getmQnaDate() {
		return mQnaDate;
	}

	public void setmQnaDate(Date mQnaDate) {
		this.mQnaDate = mQnaDate;
	}

	public String getQnaQContent() {
		return qnaQContent;
	}

	public void setQnaQContent(String qnaQContent) {
		this.qnaQContent = qnaQContent;
	}

	public String getQnaAnsYn() {
		return qnaAnsYn;
	}

	public void setQnaAnsYn(String qnaAnsYn) {
		this.qnaAnsYn = qnaAnsYn;
	}

	public String getQnaAContent() {
		return qnaAContent;
	}

	public void setQnaAContent(String qnaAContent) {
		this.qnaAContent = qnaAContent;
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

	@Override
	public String toString() {
		return "MyQna [mQnaNo=" + mQnaNo + ", mQnaTitle=" + mQnaTitle + ", mQnaDate=" + mQnaDate + ", qnaQContent="
				+ qnaQContent + ", qnaAnsYn=" + qnaAnsYn + ", qnaAContent=" + qnaAContent + ", qnaQid=" + qnaQid
				+ ", qnaAid=" + qnaAid + "]";
	}

}
