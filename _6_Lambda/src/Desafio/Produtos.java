package Desafio;

public class Produtos {
	
	public String nome;
	public double preco;
	public double desconto;
	
	public Produtos(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		// Calcular desconto
		double precoFinal = preco * (1 - desconto);
		return nome + " - R$ " + preco + " - R$ " + precoFinal; 
	}
}
