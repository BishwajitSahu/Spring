package com.bi.command;

public class MyCommand {
	private int sNo;
	private String sName;
	private String course="java";
	private String sAdd="hyd";
	private int age;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getsAdd() {
		return sAdd;
	}
	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
