package match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match_MAIN {

	public static void main(String[] args) {

		// Aula 211 -
		// https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845784#content

		Aluno a1 = new Aluno("Paulo", 7.9);
		Aluno a2 = new Aluno("Reginaldo", 4.7);
		Aluno a3 = new Aluno("Cardoso", 8.4);
		Aluno a4 = new Aluno("PRC", 9.9);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7.1;	
		Predicate<Aluno> reprovado = aprovado.negate();	
		
		System.out.print("Todos os alunos foram aprovados? " );  
		System.out.println(alunos.stream().allMatch(aprovado));
		
		System.out.print("Tem algum dos alunos foram aprovados? " );  
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		System.out.print("Nenhum dos alunos foram aprovados? " );  
		System.out.println(alunos.stream().noneMatch(aprovado));
		
		System.out.print("Nenhum dos alunos foram aprovados? " );  
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
}
