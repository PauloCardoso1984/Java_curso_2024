package min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max {

	public static void main(String[] args) {
		
		// Aula 213 -
		// https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15845792#overview
		
		Aluno a1 = new Aluno("Paulo", 7.9);
		Aluno a2 = new Aluno("Reginaldo", 4.7);
		Aluno a3 = new Aluno("Cardoso", 8.6);
		Aluno a4 = new Aluno("PRC", 9.9);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		// Forma 1 *******************************************
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};		
		// Melhor aluno
		System.out.println(alunos.stream().max(melhorNota).get());		
		// Pior aluno
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println();
		
		// Forma 2 *******************************************
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};		
		// Melhor aluno
		System.out.println(alunos.stream().max(piorNota).get());		
		// Pior aluno
		System.out.println(alunos.stream().min(piorNota).get());
	}
}
