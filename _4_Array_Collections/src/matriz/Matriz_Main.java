package matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos na turma: ");
		int qtdAlunos = sc.nextInt();
		
		System.out.print("Quantos notas por aluno: ");
		int qtdNotas = sc.nextInt();
		
		// MATRIZ
		double total = 0;
		double[][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		// for externo => i = aluno
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			// for interno => j = notas
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d: ",nota + 1, aluno + 1);
				notasDaTurma[aluno][nota] = sc.nextDouble();
				total += notasDaTurma[aluno][nota] ;
			}			
		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Quantidade de alunos: " + qtdAlunos);
		System.out.println("Quantidade de notas: " + total);
		System.out.println("Média da turma: " + media);
		
		for(double [] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		
		sc.close();
	}
}
