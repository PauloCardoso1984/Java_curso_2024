package classe;

public class _1_0_Produto_Main {

	public static void main(String[] args) {

		_1_1_Produto p1 = new _1_1_Produto(); // Usando constritor sem argumentos
		p1.nome = "Notebbok";
		p1.preco = 2000.f;
		_1_1_Produto.desconto = 0.29;

		var p2 = new _1_1_Produto("Caneta Preta"); // Usando construtor com argumentos
		p2.preco = 1000.0f;
		
		_1_1_Produto.desconto = 0.50;
		
		_1_1_Produto x = new _1_1_Produto("Caderno", 1250); // Usando construtor com 2 argumentos
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(x.nome);

		// Sem desconto do Gerente
		double precofinal1 = p1.precoComDesconto(0.5); // CENTEZIMAL
		
		// Com desconto do Gerente entre parenteses
		double precofinal2 = p2.precoComDesconto(0.5); // CENTEZIMAL
		
		// Com desconto do Gerente entre parenteses
		double precofinal3 = x.precoComDesconto(); // CENTEZIMAL
		
		double mediaCarrinho = ((precofinal1 + precofinal2 + precofinal3) / 3);
		
		System.out.printf("\nMedia do carrinho = R$ %.2f", mediaCarrinho);
		System.out.println("\nPreço com desconto = R$ " + p1.precoComDesconto() + " e  R$ " +  p2.precoComDesconto());
	}
}
