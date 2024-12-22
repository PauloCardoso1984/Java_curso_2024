package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		// FORMA 1
		double[] notasAlunoA = new double[4];

		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 10;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Total das notas = " + totalAlunoA);
		System.out.println("Dividido por = " + notasAlunoA.length);
		System.out.println("Média = " + totalAlunoA / notasAlunoA.length);
		System.out.println();
		
		//===========================================
		
		// FORMA 2
		final double bomComportamento = 6.5;	
		double[] notasAlunoB = {8, 9.8, 8.6, 7, 9, 10.0, bomComportamento, 9.9};
	
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("Total das notas = " + totalAlunoB);
		System.out.println("Dividido por = " + notasAlunoB.length);
		System.out.println("Média = " + totalAlunoB / notasAlunoB.length);		
	}
}
