package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private int guessNumber;
	private Scanner scan;
	private Player player1;
	private Player player2;
	private int attempt = 10;

	public GuessNumber(Player player1, Player player2) {
		scan = new Scanner(System.in);
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void inputNumber( Player player) {
		System.out.println(player.getName() + ", введите число: ");
		player.setNumber(scan.nextInt());
	}

	public void play() {
		Random random = new Random();
		guessNumber = random.nextInt(100) + 1;
		System.out.println(guessNumber);
		int k =0;
			do {
				if (attempt > 0) {
					System.out.println(player1.getName() + " у вас " + attempt + " попыток");
					inputNumber(player1);
					player1.getEnteredNums()[k] = player1.getNumber();
					if (!checkNumber(player1)) {
						System.out.println(player2.getName() + " у вас " + attempt + " попыток");
						inputNumber(player2);
						player2.getEnteredNums()[k] = player2.getNumber();
						k++;
						attempt--;
					} else {
						break;
					}
				}
			} while (!checkNumber(player2));
	}

	public boolean checkNumber(Player player) {
		boolean result = false;
		if (attempt > 0) {
			if (player.getNumber() > guessNumber) {
				System.out.println("Вы ввели число, которое больше числа, загаданного компьютером.");
			} else if (player.getNumber() < guessNumber) {
				System.out.println("Вы ввели число, которое меньше числа, загаданного компьютером.");
			} else {
				System.out.println(player.getName() + ", Вы угадали и победили!");
				for (int i = 0; i < 10; i++) {
					System.out.print(player1.getEnteredNums()[i]);
				}
				System.out.println();
				for (int j = 0; j < 10; j++) {
					System.out.print(player2.getEnteredNums()[j]);
				}
				result = true;
			}
		}
		if (attempt == 0) {
			System.out.println("У " + player1.getName() + " и у " + player2.getName() + " закончились попытки");
			for (int i = 0; i < 10; i++) {
				System.out.print(player1.getEnteredNums()[i]);
			}
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(player2.getEnteredNums()[j]);
			}
			attempt = 10;
		}
		return result;
	}
}
