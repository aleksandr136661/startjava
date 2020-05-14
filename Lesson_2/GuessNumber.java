import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private int guessNumber;
	private Scanner scan;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		scan = new Scanner(System.in);
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void inputNumber( Player player){
		System.out.println(player.getName() + ", введите число: ");
			player.setNumber(scan.nextInt());
	}

	public void play() {
		Random random = new Random();
		guessNumber = random.nextInt(100) + 1;
		do {
			inputNumber(player1);
			if (!checkNumber(player1)) {
				inputNumber(player2);
			} else {
				break;
			}
		} while (checkNumber(player2));
	}

	private boolean checkNumber(Player player) {
		boolean result = false;

		if (player.getNumber() > guessNumber) {
			System.out.println("Вы ввели число, которое больше числа, загаданного компьютером.");
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Вы ввели число, которое меньше числа, загаданного компьютером.");
		} else {
			System.out.println(player.getName() + ", Вы угадали и победили!");
			result = true;
		}
		return result;
	}
}
