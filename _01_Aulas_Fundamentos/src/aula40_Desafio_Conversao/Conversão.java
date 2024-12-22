package aula40_Desafio_Conversao;

import java.util.Scanner;

public class Conversão {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// DESAFIO - Conversão
		System.out.print("Salário 1: R$ ");
		String valor1 = sc.nextLine().replace(",", "."); // Substituir a , por .

		System.out.print("Salário 2: R$ ");
		String valor2 = sc.nextLine().replace(",", "."); // Substituir a , por .

		System.out.print("Salário 3: R$ ");
		String valor3 = sc.nextLine().replace(",", "."); // Substituir a , por .

		double salario1 = Double.parseDouble(valor1); // Transformando String em Double
		double salario2 = Double.parseDouble(valor2); // Transformando String em Double
		double salario3 = Double.parseDouble(valor3); // Transformando String em Double

		float media = (float) ((salario1 + salario2 + salario3) / 3);
		System.out.printf("\nA média dos 3 pagamentos é R$ %.2f", media);

		sc.close();
	}
}
