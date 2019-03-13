package event.model.vo;

import java.sql.Date;

public class Event implements java.io.Serializable{
	private static final long serialVersionUID = 113L;
	
	private String eventNo;
	private String eventTitle;
	private Date eventDate;
	private String eventContent;
	private String eventImg;
	private int eventReadCount;
	private String memUserid;
	
	public Event() {}

	public Event(String eventNo, String eventTitle, Date eventDate, String eventContent, String eventImg,
			int eventReadCount, String memUserid) {
		super();
		this.eventNo = eventNo;
		this.eventTitle = eventTitle;
		this.eventDate = eventDate;
		this.eventContent = eventContent;
		this.eventImg = eventImg;
		this.eventReadCount = eventReadCount;
		this.memUserid = memUserid;
	}

	public String getEventNo() {
		return eventNo;
	}

	public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getEventImg() {
		return eventImg;
	}

	public void setEventImg(String eventImg) {
		this.eventImg = eventImg;
	}

	public int getEventReadCount() {
		return eventReadCount;
	}

	public void setEventReadCount(int eventReadCount) {
		this.eventReadCount = eventReadCount;
	}

	public String getMemUserid() {
		return memUserid;
	}

	public void setMemUserid(String memUserid) {
		this.memUserid = memUserid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.eventNo + ", " + this.eventTitle + ", " + this.eventDate + ", " + this.eventContent
				 + ", " + this.eventImg + ", " + this.eventReadCount + ", " + this.memUserid;
	}
}
