public class MyFirstGame {
	public static void main (String[] args) {
		int zagadka = 20;
		if (zagadka == 0) {
			zagadka = 1;
		}
		int i = 20;
		if (i > 100) {
			i = 100;
		}
		do{
			if (zagadka < i) {
				System.out.println("Введеное вами число больше того, что загадал компьютер");
				i--;
			}else if (zagadka > i) {
				System.out.println("Введеное вами число меньше того, что загадал компьютер");
				i++;
			}
		}while(zagadka != i);
		System.out.println("Вы угадали!");
	}
}