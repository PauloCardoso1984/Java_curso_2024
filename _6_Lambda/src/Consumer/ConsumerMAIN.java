package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMAIN {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);		
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Caderno", 26.99, 0.02);	
		Produto p3 = new Produto("Lapis", 1.34, 0.10);	
		Produto p4 = new Produto("Livro", 112.34, 0.15);	
		Produto p5 = new Produto("Estojo", 19.55, 0.09);	
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		
		System.out.println();
		produtos.forEach(p -> System.out.println(p.preco));
		
		System.out.println();
		produtos.forEach(System.out::println);

	}

}
