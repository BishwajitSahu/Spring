package com.bi.command;

public class EnquiryCommand {
	private String name;
	private int age;
	private String gender;
	private String qlfy;
	private String skill;
	private String city;
	private int expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	@Override
	public String toString() {
		return "EnquiryCommand [name=" + name + ", age=" + age + ", gender=" + gender + ", qlfy=" + qlfy + ", skill="
				+ skill + ", city=" + city + ", expectedSalary=" + expectedSalary + "]";
	}
	
}
