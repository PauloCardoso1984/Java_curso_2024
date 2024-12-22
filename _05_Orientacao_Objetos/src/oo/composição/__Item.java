package oo.composição;

public class __Item {
	
	String nome;
	int quantidade;
	double preco;
	
	// Associação
	__Compra compra;
	
	// Construtor com argumentos
	public __Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Item: " + nome + "\nQuantidade: " + quantidade + "\nPreço: " + preco + "\n"; 
	}
}
