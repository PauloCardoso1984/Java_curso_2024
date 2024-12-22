package OperadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUninario {

	public static void main(String[] args) {
	
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQaudrado = n -> n * n;
		
		int res1 = maisDois.andThen(vezesDois).andThen(aoQaudrado).apply(0);
		System.out.println(res1);
		
		int res2 = aoQaudrado.compose(vezesDois).compose(maisDois).apply(1);
		System.out.println(res2);
	}
}
