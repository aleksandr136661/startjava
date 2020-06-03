package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;
		System.out.println("Калькулятор запущен!");

		do {
			System.out.print("Введите математическое выражение через пробел: ");
			calculator.setExample(scan.nextLine());
			calculator.calculate();
			do {
				System.out.println("Хотите продолжить? [Да/Нет]: ");
				answer = scan.nextLine();
			} while (!answer.equals("Нет") && !answer.equals("Да"));
		} while (!answer.equals("Нет"));
		System.out.println("Калькулятор выключен");
	}
}