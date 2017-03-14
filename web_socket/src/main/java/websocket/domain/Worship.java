package websocket.domain;

import java.util.Date;

public class Worship {
	private int 	worshipNo;
	private Date 	worshipDate;
	private String	worshipLeader;
	private int		worshipWeek;
	
	
	public int getWorshipNo() {
		return worshipNo;
	}
	public void setWorshipNo(int worshipNo) {
		this.worshipNo = worshipNo;
	}
	public Date getWorshipDate() {
		return worshipDate;
	}
	public void setWorshipDate(Date worshipDate) {
		this.worshipDate = worshipDate;
	}
	public String getWorshipLeader() {
		return worshipLeader;
	}
	public void setWorshipLeader(String worshipLeader) {
		this.worshipLeader = worshipLeader;
	}
	public int getWorshipWeek() {
		return worshipWeek;
	}
	public void setWorshipWeek(int worshipWeek) {
		this.worshipWeek = worshipWeek;
	}
}
