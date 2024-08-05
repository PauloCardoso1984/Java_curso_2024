package aula60_Exercicios_Fundamentos;

import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular bhaskara, digite os três coeficientes:");
		System.out.print("a = ");
		double a = sc.nextDouble();
		
		System.out.print("b = ");
		double b = sc.nextDouble();
		
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		// Fórmula = a2 + 4.a.c     raiz de delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		double resultadoDelta = Math.sqrt(delta);
		
		// Raizes
		double raizx = (-b + resultadoDelta) / (2 * a);
		double raizy = (-b - resultadoDelta) / (2 * a);
		
		System.out.println("\nO delta é " + resultadoDelta);
		System.out.println("\nRaiz x = " + raizx);
		System.out.println("Raiz y = " + raizy);

		sc.close();
	}
}
