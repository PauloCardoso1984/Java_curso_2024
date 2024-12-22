package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _1_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = sc.nextDouble();
		
		if (media >= 7) {
			System.out.print("Aprovado \nParabéns");
		}
		if (media <7 && media >= 5) {
			System.out.println("Recuperação");
		}
		if (media > 0 && media < 5) {
			System.out.println("Reprovado");
		}		
		sc.close();
	}
}
