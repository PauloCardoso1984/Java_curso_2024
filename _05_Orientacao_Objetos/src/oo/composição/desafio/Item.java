package oo.composição.desafio;

public class Item {
	
	final int quantidade;
	
	// Relação unidirecional
	final Produto produto;

	// Construtor
	public Item(Produto produto, int quantidade) {
	
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
