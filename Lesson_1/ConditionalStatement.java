public class ConditionalStatement {
	public static void main (String[] args) {
		int vozrast = 29;
		if (vozrast > 20) {
			System.out.println("возраст больше 20") ;
		}
		boolean ispolM = true;
		if (ispolM) {
			System.out.println("Пол мужской");
		}
		boolean isnpolM = true;
		if (isnpolM) {
			System.out.println("Пол не мужской");
		}
		double rost = 1.75;
		if (rost < 1.80) {
			System.out.println("Рост ниже 180");
		} else{
			System.out.println("Рост больше 180");
		}
		char bykva = 'M';
		if (bykva == 'M') {
			System.out.println("Первая буква М");
		}else if (bykva == 'I') {
			System.out.println("Первая буква I");
		}else{
			System.out.println("Таких букв нет");
		}
	}
}