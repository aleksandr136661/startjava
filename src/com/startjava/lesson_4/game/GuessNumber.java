package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private int guessNumber;
	private Scanner scan;
	private Player player1;
	private Player player2;
	private int attempt = 10;
	private int num = 0;

	public GuessNumber(Player player1, Player player2) {
		scan = new Scanner(System.in);
		this.player1 = player1;
		this.player2 = player2;
	}

	private boolean checkNumber(Player player) {
		boolean result = false;
		if (attempt > 0) {
			if (player.getEnteredNums()[num] > guessNumber) {
				System.out.println("Вы ввели число, которое больше числа, загаданного компьютером.");
			} else if (player.getEnteredNums()[num] < guessNumber) {
				System.out.println("Вы ввели число, которое меньше числа, загаданного компьютером.");
			} else {
				System.out.println(player.getName() + ", Вы угадали и победили!");
				print();
				result = true;
			}
		}
		if (attempt == 0) {
			System.out.println("У " + player1.getName() + " и у " + player2.getName() + " закончились попытки");
			print();
			attempt = 10;
		}
		return result;
	}

	public void play() {
		Random random = new Random();
		guessNumber = random.nextInt(100) + 1;
		do {
				if (attempt > 0) {
					System.out.println(player1.getName() + " у вас " + attempt + " попыток");
					System.out.println(player1.getName() + ", введите число: ");
					player1.getEnteredNums()[num] = scan.nextInt();
					if (!checkNumber(player1)) {
						System.out.println(player2.getName() + " у вас " + attempt + " попыток");
						System.out.println(player1.getName() + ", введите число: ");
						player2.getEnteredNums()[num] = scan.nextInt();
						num++;
						attempt--;
					} else {
						break;
					}
				}
			} while (!checkNumber(player2));
	}

	private void print () {
		for (int l = 0; l < 10; l++) {
			System.out.print(player1.getEnteredNums()[l]);
		}
		System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.print(player2.getEnteredNums()[j]);
		}
	}
}