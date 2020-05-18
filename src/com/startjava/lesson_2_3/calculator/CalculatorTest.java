package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Введите первое число: ");
			calculator.setFirstNumber(scan.nextInt());
			System.out.println("Введите знак математической операции: ");
			calculator.setOperation(scan.next().charAt(0));
			System.out.println("Введите второе число: ");
			calculator.setSecondNumber(scan.nextInt());
			calculator.calculate();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("нет") && !answer.equals("да"));
		} while (!answer.equals("нет"));
	}
}