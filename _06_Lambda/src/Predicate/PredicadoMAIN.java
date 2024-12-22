package Predicate;

import java.util.function.Predicate;

public class PredicadoMAIN {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto ("Notebook", 3893.90, 0.15);
		System.out.println(isCaro.test(produto));
		
	}
}
