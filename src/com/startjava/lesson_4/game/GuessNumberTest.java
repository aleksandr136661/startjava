package com.startjava.lesson_4.game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int attempt = 10;
		System.out.println("Введите имя первого игрока:");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока:");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2);
		String answer;
		do {
			do {
				do {
					System.out.println("У вас " + attempt + " попыток");
					game.play();
					attempt--;
				} while((attempt!=0) &&(game.res==false));
				for (int i = 0; i<10; i++) {
					System.out.print(player1.saveNumber[i]);
					System.out.print(player2.saveNumber[i]);
				}
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("нет") && !answer.equals("да"));
			attempt = 10;
		}while(!answer.equals("нет"));
	}
}
