package reduce3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {

	public static void main(String[] args) {
		
		// Aula 211 - https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845784#content
	
		Aluno a1 = new Aluno("Paulo", 7.9);
		Aluno a2 = new Aluno("Reginaldo", 4.7);
		Aluno a3 = new Aluno("Cardoso", 8.4);
		Aluno a4 = new Aluno("PRC", 9.9);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.1;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar2(nota);		
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		System.out.println("Notas somadas_1: ");
		Media media1 = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println("A mpedia da TURMA é: " + media1.getValor());
		
		
		System.out.println("\nNotas somadas_2: ");
		Media media2 = alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println("A mpedia da TURMA é: " + media2.getValor());
	}
}
