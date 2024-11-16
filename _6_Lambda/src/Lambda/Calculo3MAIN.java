package Lambda;

import java.util.function.BinaryOperator;

public class Calculo3MAIN {

	public static void main(String[] args) {
		
		// BinaryOperator é original do JAVA
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(3.0, 3.0));		
		calc = (x, y) -> x / y;
		System.out.println(calc.apply(40.0, 3.9));
		
		System.out.println();
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(3, 3));		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(40, 3));	

	}
}
