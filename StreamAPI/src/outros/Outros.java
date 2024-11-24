package outros;

import java.util.Arrays;
import java.util.List;

import min_max.Aluno;

public class Outros {

	public static void main(String[] args) {
		
		// Aula 214 -
		// https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845794#overview
		
		Aluno a1 = new Aluno("Paulo", 7.9);
		Aluno a2 = new Aluno("Reginaldo", 4.7);
		Aluno a3 = new Aluno("Cardoso", 8.6);
		Aluno a4 = new Aluno("PRC", 9.9);
		Aluno a5 = new Aluno("CRP", 8.8);
		Aluno a6 = new Aluno("RPC", 7.4);
		Aluno a7 = new Aluno("CPR", 7.6);
		Aluno a8 = new Aluno("Paul", 8.7);
		Aluno a9 = new Aluno("Paulo", 7.9);
		Aluno a10 = new Aluno("Reginaldo", 4.7);
		Aluno a11 = new Aluno("Card", 2.9);
		Aluno a12 = new Aluno("PARECA", 4.7);		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
		
		// Não pegar valor duplicados
		System.out.println("Distinct...");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		// Paginação
		System.out.println("\nSkip...");
		alunos.stream()
			.distinct()
			.skip(2)  // vai pular 2 elementos
			.forEach(System.out::println);
		
		System.out.println("\nSkip / Limit...");
		alunos.stream()
			.distinct()
			.skip(2)  // vai pular 2 elementos
			.limit(2) // pegar a quantidade de elementos
			.forEach(System.out::println);
		
		System.out.println("\nSkip / Limit...");
		alunos.stream()
			.distinct()			
			.limit(2) // pegar a quantidade de elementos
			.skip(1)  // vai pular 2 elementos
			.forEach(System.out::println);

		// Pegue elemento enquanto encontrar ate dar false
		System.out.println("\ntakeWhile...");
		alunos.stream()
			.distinct()		
			.skip(2)  // vai pular 2 elementos
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);		
	}
}
