package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _3_If_ElseIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double nota = sc.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.print("Nota inválida");
		} else if (nota > 9) {
			System.out.print("Conceito A");
		} else if (nota >= 7) {
			System.out.print("Conceito B");
		} else if (nota >= 5) {
			System.out.print("Conceito C");
		} else if (nota >= 3) {
			System.out.print("Conceito D");
		} else {
			System.out.print("Conceito E");
		}
		sc.close();
	}
}
