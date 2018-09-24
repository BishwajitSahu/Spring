package com.bi.dto;

import java.io.Serializable;
import java.util.Date;

public class MedicineDetailsDTO implements Serializable {
	private int medId;
	private String medName;
	private int price;
	private Date mfgDt;
	private Date expiryDt;
	public int getMedId() {
		return medId;
	}
	public void setMedId(int medId) {
		this.medId = medId;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMfgDt() {
		return mfgDt;
	}
	public void setMfgDt(Date mfgDt) {
		this.mfgDt = mfgDt;
	}
	public Date getExpiryDt() {
		return expiryDt;
	}
	public void setExpiryDt(Date expiryDt) {
		this.expiryDt = expiryDt;
	}
	
}
