package com.gmail.ycidenis;

public class Main {

	public static void main(String[] args) throws MyException {
		Group gg = new Group();
		Student stOne = new Student("�����", "������", 15, true, "Good", 10, "IT");
		Student stTwo = new Student("�������", "���������", 15,false , "Good", 10, "IT");
		Student stThree = new Student("���������", "��������", 16, true, "Good", 10, "IT");
		Student stFour = new Student("���������", "���������", 15, false, "Good", 10, "IT");
		Student stFive = new Student("�����", "��������", 15, true, "Good", 10, "IT");
		Student stSix = new Student("�������� ", "������", 14, false, "Good", 10, "IT");
		Student stSeven = new Student("����", "�������", 17, true, "Good", 10, "IT");
		Student stEight = new Student("���������", "�������", 16, false, "Good", 10, "IT");
		Student stNine = new Student("������", "������", 17, true, "Good", 10, "IT");
		Student stTen = new Student("�������", "����������", 16, false, "Good", 10, "IT");
		Student stEleven = new Student("�����", "������", 17, true, "Good", 10, "IT");
		gg.registerStudent(stOne);
		gg.registerStudent(stTwo);
		gg.registerStudent(stThree);
		gg.registerStudent(stFour);
		gg.registerStudent(stFive);
		gg.registerStudent(stSix);
		gg.registerStudent(stSeven);
		gg.registerStudent(stEight);
		gg.registerStudent(stNine);
		gg.registerStudent(stTen);
		gg.registerStudent(stEleven);
		
		gg.toString();
	}

}	
