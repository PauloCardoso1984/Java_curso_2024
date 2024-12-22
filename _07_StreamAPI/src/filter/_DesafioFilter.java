package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class _DesafioFilter {

	public static void main(String[] args) {
	
		_ProdutoFilter p1 = new _ProdutoFilter("Lapís", 1.99, 0.12, 0);
		_ProdutoFilter p2 = new _ProdutoFilter("Borracha", 2.50, 0.15, 10);
		_ProdutoFilter p3 = new _ProdutoFilter("Caderno", 29.59, 0.05, 20);
		_ProdutoFilter p4 = new _ProdutoFilter("Livro", 121.00, 0.27, 0);
		_ProdutoFilter p5 = new _ProdutoFilter("Bolsa", 71.55, 0.25, 0);
		_ProdutoFilter p6 = new _ProdutoFilter("Notebook", 1660.91, 0.10, 0);
		_ProdutoFilter p7 = new _ProdutoFilter("Estojo", 100.90, 0.29, 0);
		_ProdutoFilter p8 = new _ProdutoFilter("Cores", 35.05, 0.18, 8);
		_ProdutoFilter p9 = new _ProdutoFilter("Marcador", 9.99, 0.19, 14);
		_ProdutoFilter p10 = new _ProdutoFilter("Régua", 15.06, 0.14, 0);
		
		List<_ProdutoFilter> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p8, p9, p10);
		
		// Filter, Filter, Map
		Predicate<_ProdutoFilter> superPromocao = p -> p.desconto >= 0.2;
		Predicate<_ProdutoFilter> freteGratis = p -> p.valorFrete == 0;
		Predicate<_ProdutoFilter> precoRelevante = p -> p.preco >= 50;
		
		Function<_ProdutoFilter, String> chamadaPromocional = 
				p -> "Aproveite " + p.nome + " por R$ " + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
