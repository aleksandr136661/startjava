package com.startjava.lesson_4.game;

import java.util.Arrays;
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

	public void play() {
		Random random = new Random();
		guessNumber = random.nextInt(100) + 1;

		do {
			if (attempt > 0) {
				System.out.println(player1.getName() + " у вас " + attempt + " попыток");
				inputNumber(player1);
				System.out.println(guessNumber);
				if (!checkNumber(player1)) {
					System.out.println(player2.getName() + " у вас " + attempt + " попыток");
					inputNumber(player2);
					System.out.println(guessNumber);
					num++;
					attempt--;
				} else {
					break;
				}
			}
		} while (!checkNumber(player2));
		printAttempts(player1);
		printAttempts(player2);
		Arrays.fill(player1.getEnteredNums(),0,player1.getAttemptCount(),0);
		Arrays.fill(player2.getEnteredNums(),0,player2.getAttemptCount(),0);
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + ", введите число: ");
		player.setEnteredNum(scan.nextInt());
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
				result = true;
			}
		}
		if (attempt == 0) {
			System.out.println("У " + player1.getName() + " и у " + player2.getName() + " закончились попытки");
			attempt = 10;
		}
		return result;
	}

	private void printAttempts(Player player) {
		int[] copyEnteredNums = Arrays.copyOf(player.getEnteredNums(), player.getAttemptCount());
		for (int l = 0; l < copyEnteredNums.length; l++) {
			System.out.print(copyEnteredNums[l] + " ");
		}
	}
}