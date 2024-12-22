package Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

	public static void main(String[] args) {
		
		/* 
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */			
		
	//	1. A partir do produto calcular o preço real (com desconto)
		Function<Produtos, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		
	//	2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		UnaryOperator<Double> importoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		
	//	3. Frete: >= 3000 (100) / < 3000 (50)
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
	//	4. Arredondar: Deixar duas casas decimais
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		
	//	5. Formatar: R$ 1234,56
		Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".",",");

		
		Produtos p1 = new Produtos("Notebbok", 3256.05, 0.15);
		
		String preco = precoFinal
				.andThen(importoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1);
		
		System.out.println("O preço final é: " + preco);		
	};
}
