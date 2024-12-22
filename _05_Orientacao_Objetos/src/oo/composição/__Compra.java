package oo.composição;

import java.util.ArrayList;

public class __Compra {
	
	String cliente;
	
	// Relacionamento 1 -> n
	ArrayList<__Item> itens = new ArrayList<__Item>();
	
	void adicionarItem(__Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		adicionarItem(new __Item(nome, quantidade, preco));		
	}

	
	double obterValorTotal() {
		double total = 0;
		
		for(__Item item: itens) {
			total += item.quantidade * item.preco;
		}		
		return total;
	}
}
