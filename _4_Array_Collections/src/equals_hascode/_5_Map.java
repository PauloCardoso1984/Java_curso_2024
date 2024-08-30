package equals_hascode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _5_Map {

	public static void main(String[] args) {
		
		// Chave e valor
		Map<Integer, String> usuarios = new HashMap<>();
		
		// Adicionar
		usuarios.put(1,"Paulo");
		usuarios.put(1,"Paulinho"); // vai substituir o primeiro
		usuarios.put(5,"Reginaldo");
		usuarios.put(4,"Cardoso");
		usuarios.put(3,"Deus");
		usuarios.put(2,"Indaiatuba");
		
		// Verificar o tamanho
		System.out.println(usuarios.size());
		
		// Verificar se esta vazia
		System.out.println(usuarios.isEmpty());
		
		// Mostrar as chaves
		System.out.println(usuarios.keySet());
		
		// Mostar ps valores
		System.out.println(usuarios.values());
		
		// Mostrar chaves e valores
		System.out.println(usuarios.entrySet());
		
		// Verifica se contém
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("Deus"));
		
		// Obter a chama por meio do valor
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.get(6));
		
		// Percorrer os elementos
		// CHAVE
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// VALOR
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		// USANDO O ENTRYSET (Valor e Chave)
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue() + " ");
		} System.out.println();
		
		// Remover por chave ou valor
		System.out.println(usuarios.remove(1, "Paulinho"));
		System.out.println(usuarios.remove(4, "Paulinho"));
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue() + " ");
		}
	}
}
