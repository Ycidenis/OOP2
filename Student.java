package com.gmail.ycidenis;

public class Student extends Human {
	private String studyProgress;
	private int studyYear;
	private String department;

	

	public Student(String firstName, String surName, int age, boolean sex, String studyProgress, int studyYear,
			String department) {
		super(firstName, surName, age, sex);
		this.studyProgress = studyProgress;
		this.studyYear = studyYear;
		this.department = department;
	}

	public Student() {
		super();
	}

	public String getStudyProgress() {
		return studyProgress;
	}

	public void setStudyProgress(String studyProgress) {
		this.studyProgress = studyProgress;
	}

	public int getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	@Override
	public String toString() {
		return "Student [studyProgress=" + studyProgress + ", studyYear=" + studyYear + ", department=" + department
				 + "]";
	}
	
	

}
