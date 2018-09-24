package com.bi.dto;

import java.util.Date;

public class MedPlusDTO {
	private int mid;
	private String medname;
	private int price;
	private Date mfgdate;
	private Date expire;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	
}
