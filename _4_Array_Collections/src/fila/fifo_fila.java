package fila;

import java.util.LinkedList;
import java.util.Queue;

public class fifo_fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// 2 formas de adicionar
		fila.add("Paulo");			// Essa forma pode gerar erro 
		fila.offer("Reginaldo");	// Maneira indicada, por trabalha como true ou false
		fila.offer("Cardoso");
		fila.offer("Deus");
		fila.offer("Cristo");
		fila.offer("Anjo");
		
		// Pegar elementos da fila (primeiro elemento)
		System.out.println(fila.peek()); // Se tiver vazia, retorna nulo
		System.out.println(fila.element()); // Se tiver vazia gera ERRO
		
		// Ver o tamanho da fila
		System.out.println(fila.size());
		
		// Verificar se tem elementos na fila
		System.out.println(fila.isEmpty());
		
		// Retorna o primeiro elemento da fila e remove
		System.out.println(fila.poll()); // Usar o .poll
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // dará exceção se a lista estiver vazia

		// Limpar a fila
		fila.clear();
		System.out.println(fila);		
		
		//offer() 
	}
}
