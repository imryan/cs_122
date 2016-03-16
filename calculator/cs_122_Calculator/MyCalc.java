package cs_122_Calculator;

public class MyCalc implements MyCalcInterface {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double division(double a, double b) {
		if (b == 0) {
			return 0;
		}
		
		return a / b;
	}	
}
