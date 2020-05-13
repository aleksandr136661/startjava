public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operation;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		secondNumber = secondNumber;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		operation = operation;
	}

	public void calculate() {
		int result;
		switch (operation) {
			case '+':
				result = firstNumber + secondNumber;
				System.out.println(firstNumber + " + " + secondNumber + " = " + result);
				break;
			case '-':
				result = firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber + " = " + result);
				break;
			case '*':
				result = firstNumber * secondNumber;
				System.out.println(firstNumber + " * " + secondNumber + " = " + result);
				break;
			case '/':
				result = firstNumber / secondNumber;
				System.out.println(firstNumber + " / " + secondNumber + " = " + result);
				break;
			case '%':
				result = firstNumber % secondNumber;
				System.out.println(firstNumber + " % " + secondNumber + " = " + result);
				break;
			case '^':
				result = 1;
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
				break;
			default:
				System.out.println("Введена неизвестная операция");
		}
	}
}
