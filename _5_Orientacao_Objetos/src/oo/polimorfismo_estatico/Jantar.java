package oo.polimorfismo_estatico;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa (99.65);
		System.out.println(convidado.getPeso());
		
		Arroz ingrediente1 = new Arroz(0.22);
		Feijao ingrediente2 = new Feijao(0.10);
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.1);
		convidado.comer(sobremesa);		
		System.out.println(convidado.getPeso());

	}
}
