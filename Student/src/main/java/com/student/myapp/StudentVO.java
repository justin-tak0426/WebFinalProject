package com.student.myapp;

public class StudentVO {
	private int seq;
	private String stdid;
	private String stdname;
	private String grade;
	private String gender;
	private String phonenum;
	private String major;
	private String rc;
	private String team;
	private String community;
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(int seq, String stdid, String stdname, String grade, String gender, String phonenum, String major,
			String rc, String team, String community) {
		super();
		this.seq = seq;
		this.stdid = stdid;
		this.stdname = stdname;
		this.grade = grade;
		this.gender = gender;
		this.phonenum = phonenum;
		this.major = major;
		this.rc = rc;
		this.team = team;
		this.community = community;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int sid) {
		this.seq = sid;
	}
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getRc() {
		return rc;
	}
	public void setRc(String rc) {
		this.rc = rc;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
}
