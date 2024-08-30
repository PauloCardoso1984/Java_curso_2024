package equals_hascode;

import java.util.ArrayList;
import java.util.List;

public class _4_0_List {

	public static void main(String[] args) {
		
/*		LIST
 		- Pode ser heterogênea
 		- Pode ser homogêneo
 		- É ordenado 
		- Indexado
		- Aceita repetição	
*/		
		List<_4_1_Usuario> lista = new ArrayList<>();
		lista.add(new _4_1_Usuario("Reginaldo"));
		lista.add(new _4_1_Usuario("Cardoso"));
		lista.add(new _4_1_Usuario("Deus"));
		lista.add(new _4_1_Usuario("Jesus"));
		lista.add(new _4_1_Usuario("Espirito Santo"));
		lista.add(new _4_1_Usuario("Corinthians"));
		lista.add(new _4_1_Usuario("Fernando"));
		lista.add(new _4_1_Usuario("Nérias"));
		
		_4_1_Usuario u1 = new _4_1_Usuario("Paulo");
		lista.add(u1);		
		
		for (_4_1_Usuario l : lista) {
			System.out.println(l.nome);
		}
		for (_4_1_Usuario l : lista) {
			System.out.print(l.nome + ", ");
		} 
		System.out.println();
		
		// Buscando por indice / SEM TO STRING DA CLASSE
		System.out.println("\nBuscando por indice (3) : " + lista.get(3).nome);
		
		// Buscando por indice / COM TO STRING DA CLASSE
		System.out.println("\nBuscando por indice (1) : " + lista.get(1));
		
		// Remover 2 forma
		// Forma 1
		lista.remove(1);
		for (_4_1_Usuario l : lista) {
			System.out.print(l.nome + ", ");
		}
		System.out.println();
		// Forma 2
		lista.remove(new _4_1_Usuario("Paulo"));
		for (_4_1_Usuario l : lista) {
			System.out.print(l.nome + ", ");
		}
		System.out.println();
		
		System.out.println("Removido : " + lista.remove(new _4_1_Usuario("Reginaldo")));
		System.out.println("Removido : " + lista.remove(1));

		// Verificar se contém na lista
		System.out.println(lista.contains(new _4_1_Usuario ("Fernando")));
		System.out.println(lista.contains(new _4_1_Usuario ("Paulo")));
	}
}
