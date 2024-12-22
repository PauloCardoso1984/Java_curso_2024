package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
	
		// Criando uma referencuia, neste caso para o PRINT
		Consumer<String> print = System.out::print;
		Consumer<Object> printl = System.out::println;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "HTML ", "Banco de Dados\n" );
		langs.forEach(print); // Chamando aq referencia para imprimir
		
		String[]maisLangs = {"Python,", "Lisp"," Go", " JavaScript\n"}; 
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs, 1, 3).forEach(print); // Selecionando até onde quer
		
		System.out.println();
		
		List<String> outrasLangs = Arrays.asList("C# ", "PHP ", "Kotlin ");
		outrasLangs.stream().forEach(print); // imprimindo em ordem
		System.out.println("\n");
		outrasLangs.parallelStream().forEach(printl); // Pode mostrar fora de ordem 
		
	//	Stream.generate(() -> "a").forEach(print); // vai gerar a letra A indefinidas vezes
	//	Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
