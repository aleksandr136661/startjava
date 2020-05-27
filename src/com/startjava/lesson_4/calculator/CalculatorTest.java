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
			String example = scan.nextLine();
			String array[] = example.split(" ");
			String operation =array[1];
			double result;
			switch (operation.charAt(0)) {
				case '+':
					result = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);;
					System.out.println(Integer.parseInt(array[0]) + " + " + Integer.parseInt(array[2]) + " = " + result);
					break;
				case '-':
					result = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
					System.out.println(Integer.parseInt(array[0]) + " - " + Integer.parseInt(array[2]) + " = " + result);
					break;
				case '*':
					result = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
					System.out.println(Integer.parseInt(array[0]) + " * " + Integer.parseInt(array[2]) + " = " + result);
					break;
				case '/':
					result = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
					System.out.println(Integer.parseInt(array[0]) + " / " + Integer.parseInt(array[2]) + " = " + result);
					break;
				case '%':
					result = Integer.parseInt(array[0]) % Integer.parseInt(array[2]);
					System.out.println(Integer.parseInt(array[0]) + " % " + Integer.parseInt(array[2]) + " = " + result);
					break;
				case '^':
					result = Math.pow(Integer.parseInt(array[0]),Integer.parseInt(array[2]));
					System.out.println(Integer.parseInt(array[0]) + " ^ " + Integer.parseInt(array[2]) + " = " + result);
					break;
				default:
					System.out.println("Введена неизвестная операция");
			}
			do {
				System.out.println("Хотите продолжить? [Да/Нет]: ");
				answer = scan.nextLine();
			} while (!answer.equals("Нет") && !answer.equals("Да"));
		} while (!answer.equals("Нет"));
		System.out.println("Калькулятор выключен");
	}
}