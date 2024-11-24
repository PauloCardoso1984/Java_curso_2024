package reduce1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		
		// Aula 200 - https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845776#overview
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		Integer total1 = nums.parallelStream().reduce(10, soma); // NÃO USAR, DARÁ PROBLEMA
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(10, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
