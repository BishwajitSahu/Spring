package com.bi.dto;

import java.io.Serializable;

import com.lowagie.text.Cell;

public class StudentDTO implements Serializable {
	private int sno;
	private String sname;
	private String course;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
