package equals_hascode;

import java.util.HashSet;
import java.util.Set;

public class _2_Collections {

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		/*======= COLLECTIONS =======
	SET  
	 	 - Pode ser Heteronêneo :(
	 	 - Pode ser Homegêneo :)
	 	 - Não aceita objetos duplicados
	 	 - Pode ser ordenado => Não ordenado (por padrão)
		 - Não indexado
		 - Não aceita repetição
		*/ 
	
		HashSet conjunto = new HashSet();
		// Adicionar
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		System.out.println("Tamanho do conjunto : " + conjunto.size());
		conjunto.add("teste"); // Não é repetido
		conjunto.add('x'); // Não aceita repetição
		System.out.println("Tamanho do conjunto : " + conjunto.size());
		// Remover
		System.out.println(conjunto.remove('X'));
		System.out.println(conjunto.remove('x'));
		// Verificar se contém
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto + "\n");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// Imprimir os conjuntos
		System.out.println(conjunto + "\n");
		System.out.println(nums);
		
		// União dos conjuntos
		conjunto.add(nums);
		System.out.println(conjunto);
		
		// Reter numeros repetidos / intercessão
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// Limpar o conjunto
		conjunto.clear();
		System.out.println(conjunto);

/*
		 
	MAP 
		 - Chave / Valor
		 - Chave não aceita repetição
		 - Valor aceita repetição
		 
	QUEUE (FILA)
		 - Implementa fila 
		 - First in/Firt out (FIFO) - Primeiro entrar e primeiro a sair
		 
	STACK (PILHA)
		 - Implementa pilha (Stack)
		 - Last in / Firt out (LIFO) - Ultimo a entrar e primeiro a sair		 
		 */

	}
}
