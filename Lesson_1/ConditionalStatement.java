public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 29;
		if (age > 20) {
			System.out.println("Возраст больше 20") ;
		}
		boolean isMale = true;
		if (isMale) {
			System.out.println("Пол мужской");
		}
		boolean isNotMale = true;
		if (isNotMale) {
			System.out.println("Пол не мужской");
		}
		double height = 1.75;
		if (height < 1.80) {
			System.out.println("Рост ниже 180");
		} else {
			System.out.println("Рост больше 180");
		}
		char letter = 'M';
		if (letter == 'M') {
			System.out.println("Первая буква М");
		} else if (letter == 'I') {
			System.out.println("Первая буква I");
		} else {
			System.out.println("Таких букв нет");
		}
	}
}