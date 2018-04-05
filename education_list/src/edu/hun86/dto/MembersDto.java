package edu.hun86.dto;

import java.util.Date;

public class MembersDto {
	
	private int m_seq;
	
	private String m_name;
	
	private String m_rank;
	
	private String m_department;
	
	private Date m_regdate;
	
	private Date m_modidate;

	public int getM_seq() {
		return m_seq;
	}

	public void setM_seq(int m_seq) {
		this.m_seq = m_seq;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_rank() {
		return m_rank;
	}

	public void setM_rank(String m_rank) {
		this.m_rank = m_rank;
	}

	public String getM_department() {
		return m_department;
	}

	public void setM_department(String m_department) {
		this.m_department = m_department;
	}

	public Date getM_regdate() {
		return m_regdate;
	}

	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}

	public Date getM_modidate() {
		return m_modidate;
	}

	public void setM_modidate(Date m_modidate) {
		this.m_modidate = m_modidate;
	}

	public MembersDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MembersDto(int m_seq, String m_name, String m_rank, String m_department, Date m_regdate, Date m_modidate) {
		super();
		this.m_seq = m_seq;
		this.m_name = m_name;
		this.m_rank = m_rank;
		this.m_department = m_department;
		this.m_regdate = m_regdate;
		this.m_modidate = m_modidate;
	}

	@Override
	public String toString() {
		return "MembersDto [m_seq=" + m_seq + ", m_name=" + m_name + ", m_rank=" + m_rank + ", m_department="
				+ m_department + ", m_regdate=" + m_regdate + ", m_modidate=" + m_modidate + "]";
	}
	

}
