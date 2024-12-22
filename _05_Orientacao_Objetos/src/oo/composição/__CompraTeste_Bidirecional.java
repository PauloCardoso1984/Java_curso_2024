package oo.composição;

public class __CompraTeste_Bidirecional {

	public static void main(String[] args) {
	
		// Instanciando a classe compra
		__Compra compra1 = new __Compra();
		compra1.cliente = "Paulo Cardoso";
		compra1.adicionarItem(new __Item("caneta", 20, 7.45));
		compra1.adicionarItem(new __Item("caneca", 23, 16.65));
		compra1.adicionarItem(new __Item("borracha", 110, 1.25));
		compra1.adicionarItem(new __Item("lapizeira", 30, 18.99));
		compra1.adicionarItem("caderno", 125, 28.99);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// Monstrando a relação bidirecional....
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println(total);
	}

}
