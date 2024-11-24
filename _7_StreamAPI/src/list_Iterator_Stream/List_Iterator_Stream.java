package list_Iterator_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class List_Iterator_Stream {

	public static void main(String[] args) {
	
		// Forma 1 - FOR
		List<String> aprovados = Arrays.asList("Paulo", "Reginaldo","Cardoso", "Jesus");
		for (int i=0; i < aprovados.size(); i++) {
			System.out.println(i);			
		}
		
		// Forma 2 - FOR
		System.out.println("\nUsando o FOR:");
		for (int i=0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));			
		}
		
		// Forma 3 - ForEach
		System.out.println("\nUsando o FOREACH:");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// Forma 4 - Iterator (INTERFACE)
		System.out.println("\nUsando o ITERATOR:");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Forma 5 - Stream (INTERFACE)
		System.out.println("\nUsando o STREAM:");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno		
	}
}
