public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 20;
		if (hiddenNumber <= 0) {
			hiddenNumber = 1;
		} else if (hiddenNumber >= 100) {
			hiddenNumber = 100;
		}
		int answer = 20;
		if (answer <= 0) {
			System.out.println("Число не пренадлежит диапозону (0 100]");
		} else if (answer > 100) {
			System.out.println("Число не пренадлежит диапозону (0 100]");
		}
		if ((answer > 0) && (answer <= 100)) {
			do{
				if (hiddenNumber < answer) {
					System.out.println("Введеное вами число больше того, что загадал компьютер");
					answer--;
				} else if (hiddenNumber > answer) {
					System.out.println("Введеное вами число меньше того, что загадал компьютер");
					answer++;
				}
			} while (hiddenNumber != answer);
			System.out.println("Вы угадали!");
		}
	}
}