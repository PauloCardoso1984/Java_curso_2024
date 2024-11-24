package desafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map_Desafio_AULA {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> num = Arrays.asList(6);

		/*
		 * 1. Numero para String binária... 6 => "110" 
		 * 2- Inverter a String... "110" => "011" 
		 * 3. Converter de volta para inteiro => "011" => 3
		 */

		// Mostrar a relação da lista
		nums.stream()
			.forEach(System.out::print); System.out.println("\n");

		// Transformar em binários
		nums.stream()
			.map(Integer::toBinaryString)
			.forEach(System.out::println); System.out.println();
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
				
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.forEach(System.out::println); System.out.println();			

		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println); System.out.println();	
			
		// Resposta do Desafio		
		System.out.println("Resposta do Desafio");
		num.stream()
		.forEach(System.out::print);
		
		num.stream()
		.map(Integer::toBinaryString)
		.forEach(System.out::println); 
		
		num.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.forEach(System.out::println); 
		
		num.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println); System.out.println();
	}
}
