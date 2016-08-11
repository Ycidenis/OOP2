package com.gmail.ycidenis;

public class Main {

	public static void main(String[] args) throws MyException {
		Group gg = new Group();
		Student stOne = new Student("Данил", "Дверин", 15, true, "Good", 10, "IT");
		Student stTwo = new Student("Надежда", "Цветочная", 15,false , "Good", 10, "IT");
		Student stThree = new Student("Александр", "Полянный", 16, true, "Good", 10, "IT");
		Student stFour = new Student("Елизавета", "Ромашкова", 15, false, "Good", 10, "IT");
		Student stFive = new Student("Марат", "Гундосов", 15, true, "Good", 10, "IT");
		Student stSix = new Student("Виолетта ", "Вазова", 14, false, "Good", 10, "IT");
		Student stSeven = new Student("Илья", "Крышкин", 17, true, "Good", 10, "IT");
		Student stEight = new Student("Екатерина", "Булкина", 16, false, "Good", 10, "IT");
		Student stNine = new Student("Руслан", "Ухачев", 17, true, "Good", 10, "IT");
		Student stTen = new Student("Евгения", "Ламинатова", 16, false, "Good", 10, "IT");
		Student stEleven = new Student("Никон", "Нотный", 17, true, "Good", 10, "IT");
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
