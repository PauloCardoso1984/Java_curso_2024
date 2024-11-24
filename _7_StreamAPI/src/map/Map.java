package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List <String> marcas = Arrays.asList("BMW ", "Honda ", "Toyota ", "FIAT \n");
		marcas.stream().forEach(print);
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		marcas.stream().map(m -> m.toLowerCase()).forEach(print);
		System.out.println();	
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
		UnaryOperator<String> grito = n -> n + "!!!!  ";
		
		// Forma 1
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));	
		
		// Forma 2
		marcas.stream().map(maiuscula).forEach(print);
		marcas.stream().map(maiuscula).map(primeiraLetra).forEach(print); System.out.println();
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		System.out.println("\n");
		
		// Forma 3 - Buscando por Classe
		marcas.stream().map(Utilitarios::maiuscula).forEach(print);
		marcas.stream().map(Utilitarios::maiuscula).map(Utilitarios::primeiraLetra).map(Utilitarios::grito).forEach(print);
	}
}
