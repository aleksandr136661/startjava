public class Calculator {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		double result;
		char matSign = '+';

		if (matSign == '+') {
			result = a + b;
			System.out.println("a+b=" + result);
		} else if (matSign == '-') {
			result = a - b;
			System.out.println("a-b=" + result);
		} else if (matSign == '*') {
			result = a * b;
		 	System.out.println("a*b=" + result);
		} else if (matSign == '/') {
			result = a / b;
			System.out.println("a/b=" + result);
		} else if (matSign == '^') {
			result = 1;
			for (int i = 1; i <= b; i++) {
				result *= a;
			}
			System.out.println("a^b=" + result);
		} else if (matSign == '%') {
			result = a % b;
			System.out.println("a%b=" + result);
		}
	}
}