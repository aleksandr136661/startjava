import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private int guessNumber;
	private boolean continuePlay;
	private Scanner scan;

	public GuessNumber() {
		scan = new Scanner(System.in);
	}

	public void play(Player player1, Player player2) {
		continuePlay = true;
		Random random = new Random();
		guessNumber = random.nextInt(100) + 1;
		do {
			System.out.println(player1.getName() + ", введите число: ");
			player1.setNumber(scan.nextInt());
			checkNumber(player1);
			if (continuePlay) {
				System.out.println(player2.getName() + ", введите число: ");
				player2.setNumber(scan.nextInt());
				checkNumber(player2);
			}
		} while (continuePlay);
	}

	private void checkNumber(Player player) {
		if (player.getNumber() > guessNumber) {
			System.out.println("Вы ввели число, которое больше числа, загаданного компьютером.");
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Вы ввели число, которое меньше числа, загаданного компьютером.");
		} else {
			System.out.println(player.getName() + ", Вы угадали и победили!");
			continuePlay = false;
		}
	}
}