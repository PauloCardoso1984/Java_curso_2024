package reduce2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {

	public static void main(String[] args) {
		
		// Aula 209 - https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845778?start=15#content
	
		Aluno a1 = new Aluno("Paulo", 7.9);
		Aluno a2 = new Aluno("Reginaldo", 4.7);
		Aluno a3 = new Aluno("Cardoso", 8.1);
		Aluno a4 = new Aluno("PRC", 9.9);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.1;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		
		// Operação = pegar a relação dos aprovados e somar as notas
		System.out.print("Notas somadas1: ");
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
		
		System.out.print("Notas somadas2: ");
		alunos.stream()
	//		.filter(aprovado) // -> tirei o filtro desta forma somará todas
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}
}
