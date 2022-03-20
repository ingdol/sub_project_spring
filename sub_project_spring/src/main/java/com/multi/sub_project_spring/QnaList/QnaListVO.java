package com.multi.sub_project_spring.QnaList;

import java.util.Date;

public class QnaListVO {
		
	private int hostqnaNo;
	private String memNick;
	private String hostqnaTitle;
	private String hostqnaInfo;
	private Date hostqnaDate;
	private int hostqnaFaq;
	private String hostqnaCom;
	
	
	public int getHostqnaNo() {
		return hostqnaNo;
	}
	public void setHostqnaNo(int hostqnaNo) {
		this.hostqnaNo = hostqnaNo;
	}
	public String getMemNick() {
		return memNick;
	}
	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}
	public String getHostqnaTitle() {
		return hostqnaTitle;
	}
	public void setHostqnaTitle(String hostqnaTitle) {
		this.hostqnaTitle = hostqnaTitle;
	}
	public String getHostqnaInfo() {
		return hostqnaInfo;
	}
	public void setHostqnaInfo(String hostqnaInfo) {
		this.hostqnaInfo = hostqnaInfo;
	}
	public Date getHostqnaDate() {
		return hostqnaDate;
	}
	public void setHostqnaDate(Date hostqnaDate) {
		this.hostqnaDate = hostqnaDate;
	}
	public int getHostqnaFaq() {
		return hostqnaFaq;
	}
	public void setHostqnaFaq(int hostqnaFaq) {
		this.hostqnaFaq = hostqnaFaq;
	}
	public String getHostqnaCom() {
		return hostqnaCom;
	}
	public void setHostqnaCom(String hostqnaCom) {
		this.hostqnaCom = hostqnaCom;
	}
	
	

}
