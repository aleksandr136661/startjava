import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя первого игрока:");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока:");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2);
		String answer;
		do {
			game.play();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("нет") && !answer.equals("да"));
		} while (!answer.equals("нет"));
	}
}
