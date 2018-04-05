package edu.hun86.dto;

import java.util.Date;

public class EduDto {
	
	private int seq;
	
	private String name;
	
	private String title;
	
	private String content;
	
	private Date regdate;
	
	private Date modidate;
	
	private String manager;
	
	private String chkable;
	
	private int eNum;
	
	private int sNum;
	

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModidate() {
		return modidate;
	}

	public void setModidate(Date modidate) {
		this.modidate = modidate;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getChkable() {
		return chkable;
	}

	public void setChkable(String chkable) {
		this.chkable = chkable;
	}

	public EduDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EduDto(int seq, String name, String title, String content, Date regdate, Date modidate, String manager,
			String chkable) {
		super();
		this.seq = seq;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.modidate = modidate;
		this.manager = manager;
		this.chkable = chkable;
	}

	@Override
	public String toString() {
		return "EduDto [seq=" + seq + ", name=" + name + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", modidate=" + modidate + ", manager=" + manager + ", chkable=" + chkable + "]";
	}

	
	
}
