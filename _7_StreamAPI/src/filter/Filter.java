package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Paulo", 7.8);
		Aluno a2 = new Aluno("Reginaldo", 8.8);
		Aluno a3 = new Aluno("Cardoso", 6.8);
		Aluno a4 = new Aluno("Paul", 8.5);
		Aluno a5 = new Aluno("Regis", 5.9);
		Aluno a6 = new Aluno("Card", 6.9);
		Aluno a7 = new Aluno("PRC", 9.5);
		Aluno a8 = new Aluno("PCR", 5.3);
		Aluno a9 = new Aluno("RPC", 5.5);
		Aluno a10 = new Aluno("CPR", 9.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		// FORMA 1 **************************************************************
		// Filtrar os alunos
		System.out.println("FORMA 1 - Alunos APROVADO");
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabens	" + a.nome + "!. Você está APROVADO")
			.forEach(System.out::println);
	
		System.out.println("\nFORMA 1 - Alunos REPROVADO");
		alunos.stream()
			.filter(a -> a.nota < 7)
			.map(a -> "Que pena	" + a.nome + "!. Você está REPROVADO")
			.forEach(System.out::println);
		
		// FORMA 2 *************************************************************
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = a -> a.nota < 7;
		
		System.out.println("\nFORMA 2 - Alunos APROVADO");
		alunos.stream()
			.filter(aprovado)
			.map(a -> "Parabens	" + a.nome + "!. Você está APROVADO")
			.forEach(System.out::println);
		
		System.out.println("\nFORMA 2 - Alunos REPROVADO");
		alunos.stream()
			.filter(reprovado)
			.map(a -> "Que pena	" + a.nome + "!. Você está REPROVADO")
			.forEach(System.out::println);	
		
		// FORMA 3 **************************************************************
		System.out.println("\nFORMA 3 - Alunos APROVADO");
		Predicate<Aluno> aprov = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabens	" + a.nome + "!. Você está APROVADO";
		alunos.stream()
			.filter(aprov)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
		
		System.out.println("\nFORMA 3 - Alunos REPROVADO");		
		Predicate<Aluno> reprov = a -> a.nota < 7;
		Function<Aluno, String> saudacaoReprovado = a -> "Que pena	" + a.nome + "!. Você está REROVADO";
		alunos.stream()
			.filter(reprov)
			.map(saudacaoReprovado)
			.forEach(System.out::println);
	}
}
