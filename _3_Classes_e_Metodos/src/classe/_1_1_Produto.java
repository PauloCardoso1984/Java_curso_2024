package classe;

public class _1_1_Produto {

	String nome;
	double preco;
	static double desconto = 0.25; // Desconto de forma geral
	
	// Construtor sem argumentos
	_1_1_Produto() {
	}
	
	// Construtor com 1 argumento
	_1_1_Produto(String nomeInicial){
		nome = nomeInicial;
	}

	// Construtor com 2 argumentos
	_1_1_Produto(String nomeInicial, double precoInicial){
	nome = nomeInicial;
	preco = precoInicial;
}	
	
	// MÉTODOS
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
