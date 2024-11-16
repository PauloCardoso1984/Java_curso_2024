package ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {		
		
		List<String> aprovados = Arrays.asList("Paulo", "Reginaldo", "Cardoso");
		
		System.out.println("Lista de Aprovados: TRADICIONAL");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLista de Aprovados: LAMBDA #01");
		aprovados.forEach(nome -> System.out.println(nome + "!!"));
		
		System.out.println("\nLista de Aprovados: METHOD REFERENCE #1");
		aprovados.forEach(System.out::println);
		
		// Utilizando o método abaixo => meuImprimir
		System.out.println("\nLista de Aprovados: LAMBDA #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nLista de Aprovados: METHOD REFERENCE #2");
		aprovados.forEach(ForEach::meuImprimir);
	}
	
	// Personalizar forma de imprimir
	static void meuImprimir (String nome) {
		System.out.println("Olá! Meu nome é " + nome);
	}
}
