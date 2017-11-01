
public class Calculator {

	private Calculator() {

	}

	public static double calculate(int a, int b, String operation) {

		switch (operation) {
		case "+":
			return (a + b);
		case "-":
			return (a - b);
		case "*":
			return (a * b);
		case "/":
			return (a / b);
		default:
			throw new UnsupportedOperationException("Wrong operation. ");
		}
	}

}
