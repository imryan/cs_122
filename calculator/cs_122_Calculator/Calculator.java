package cs_122_Calculator;

public class Calculator {

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		
		int a = 2, b = 2;
		System.out.println(a + " plus " + b + " = " + calc.addition(a, b));
		System.out.println(a + " minus " + b + " = " + calc.subtraction(a, b) + "\n");
		
		double x = 4.0, y = 4.0;
		System.out.println(x + " times " + y + " = " + calc.multiplication(x, y));
		System.out.println(x + " divided by " + y + " = " + calc.division(x, y) + "\n");
		
		// Divide by zero
		double n = 0, d = 4;
		System.out.println(n + " divided by " + d + " = " + calc.division(n, d));
	}
}