package com.gmail.ycidenis;

import java.util.Arrays;

public class Group {
	Student [] studentGroup = new Student[10];
	
	

	public Group(Student[] studentGroup) {
		super();
		this.studentGroup = studentGroup;
	}

	public Group() {
		super();
	}

	public Student[] getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(Student[] studentGroup) {
		this.studentGroup = studentGroup;
	}

	@Override
	public String toString() {
		return "Group [studentGroup=" + Arrays.toString(studentGroup) + "]";
	}
	public void registerStudent (Student student) throws MyException{
		for (int j = 0; j < studentGroup.length; j++) {
			if(j == studentGroup.length){
				throw new MyException();
			}
			if(studentGroup[j]==null){
				studentGroup[j]=student;
				}
			}
		}
	}
		

	

