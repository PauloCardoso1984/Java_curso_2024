package oo.composição.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	// Relação unidirecional
	final List<Compra> compras = new ArrayList<>();
	
	// Construtor
	public Cliente(String nome) {
		this.nome = nome;
	}	
	
	void adidionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
