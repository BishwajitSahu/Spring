package com.bi.command;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCommand {
	@NotEmpty(message="UserName is mendatory.")
	private String user;
	@NotEmpty(message="Password is mendatory.")
	private String pwd;
	private String domains;
	private String country;
	private Date dob;
	
	
	
	 public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCountry() {
	      return country;
	   }
	   public void setCountry(String country) {
	      this.country = country;
	   }
	public String getDomains() {
		return domains;
	}
	public void setDomains(String domains) {
		this.domains = domains;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserCommand [user=" + user + ", pwd=" + pwd + ", domains=" + domains + ", country=" + country + ", dob="
				+ dob + "]";
	}
	
}
