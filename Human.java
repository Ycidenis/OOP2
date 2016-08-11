package com.gmail.ycidenis;

public class Human {
	private String firstName;
	private String surName;
	private int age;
	private boolean sex;
	public Human(String firstName, String surName, int age, boolean sex) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.age = age;
		this.sex = sex;
	}
	public Human() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", surName=" + surName + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
