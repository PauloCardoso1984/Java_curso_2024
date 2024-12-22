package equals_hascode;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class _3_Set {

	public static void main(String[] args) {
		
		// Ter todos os dados do mesmo tipo
		// O HashSet não respeita a ordem de inserção
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Paulo");
		listaAprovados.add("Reginaldo");
		listaAprovados.add("Cardoso");
		listaAprovados.add("Corinthians");
		
		System.out.println(listaAprovados);
		
		for(String candidato : listaAprovados ) {
			System.out.println(candidato);
		}
		System.out.println();
		
		// O TreeSet e SortedSet ordena por ordem alfabética
		SortedSet<Integer> listaAprovado = new TreeSet<>();
		listaAprovado.add(7);
		listaAprovado.add(2);
		listaAprovado.add(5);
		listaAprovado.add(59);
		
		System.out.println(listaAprovado);
		
		for(Integer candidato : listaAprovado ) {
			System.out.println(candidato);
		}		
	}
}
