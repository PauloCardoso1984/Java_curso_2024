package fila;

import java.util.ArrayDeque;
import java.util.Deque;

public class lifo_stack_pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("Matemática");
		livros.push("Português"); // pode gerar uma excessão
		livros.push("Inglês");
		livros.push("Ciências");
		livros.push("Bíblia");
		
		for(String lv: livros) {
			System.out.println(lv);
		} System.out.println();
		
		// Último a entrar é o primeiro a sair
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.peek());

		// Mostrar e remover
		// MANEIRA 1
		System.out.println(livros.poll());

		// MANEIRA 2 - Porém essa gera excessão se o elemento estiver vazio
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		
		// Tamanho da lista
		System.out.println(livros.size());
		
		// Verificar se contém algo na lista
		System.out.println(livros.contains("Matemática"));
		
		// Verificar se está vazia
		System.out.println(livros.isEmpty());
		
		// Limpar a lista
		livros.clear();
		System.out.println(livros);		
	}
}
