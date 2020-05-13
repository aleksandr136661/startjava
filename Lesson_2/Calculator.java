public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operation;

	public int getFirstNumber() {
		return this.firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return this.secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperation() {
		return this.operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
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
