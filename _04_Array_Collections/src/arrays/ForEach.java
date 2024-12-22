package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);	

		double[] notasA = { 9.9, 8.7, 7.2, 9.4 };

		// FOR TRADICIONAL
		for (int i = 0; i < notasA.length; i++) {
			System.out.print(notasA[i] + " - ");
		}
		System.out.println();

		// FOR EACH
		for (double d : notasA) {
			System.out.print(d + " - ");
		}
		System.out.println();
		
		
		/* DESAFIO - Calcular a média de um usuário. Precisará perguntar:
		- Quantas notas o aluno teve
		- Informar as notas 
		- Depois apresenta a média. */
		
		// FOR NOMAL			
		double totalNotas = 0;
		
		System.out.print("\nQuantas notas: ");
		int qtdNotas = sc.nextInt();
		
		double[] notas = new double[qtdNotas];		
		for(int i = 0; i <= notas.length - 1; i++) {	
			System.out.print("Informe a nota: " +(i + 1) + " : ");	
			notas[i] = sc.nextDouble();			
			totalNotas += notas[i];
		}
		System.out.println();
		System.out.println(Arrays.toString(notas));
		System.out.println("Total de notas : " + totalNotas);
		System.out.println("Dividido por : " + qtdNotas);
		System.out.println("Média : " + totalNotas / qtdNotas);
		System.out.println();
		
		// FOR EACH
		double total = 0;
		for(double n : notas) {
			total += n;			
		}
		System.out.println(Arrays.toString(notas));
		System.out.println("Total de notas : " + total);
		System.out.println("Dividido por : " + qtdNotas);
		System.out.println("Média : " + total / qtdNotas);
		
		sc.close();
	}
}
