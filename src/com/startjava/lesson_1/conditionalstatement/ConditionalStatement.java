package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 29;
		if (age > 20) {
			System.out.println("Возраст больше 20") ;
		}
		boolean isMale = true;
		if (isMale) {
			System.out.println("Пол мужской");
		}
		
		if (!isMale) {
			System.out.println("Пол не мужской");
		}

		double height = 1.75;
		if (height < 1.80) {
			System.out.println("Рост ниже 180");
		} else {
			System.out.println("Рост больше 180");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Первая буква М");
		} else if (firstNameLetter == 'I') {
			System.out.println("Первая буква I");
		} else {
			System.out.println("Таких букв нет");
		}
	}
}