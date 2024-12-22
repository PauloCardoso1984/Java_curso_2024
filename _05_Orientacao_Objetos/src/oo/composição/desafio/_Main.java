package oo.composição.desafio;

public class _Main {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebok", 5890), 6);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 29.97, 89);
		compra1.adicionarItem(new Produto("Celular", 2878), 65);
	
		Cliente cliente = new Cliente ("Paulo Cardoso Reginaldo");
		cliente.adidionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());	
	}
}
