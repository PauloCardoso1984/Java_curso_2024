package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _2_IfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Verificar se o número é Impar ou Par");
		System.out.print("Digite o valor: ");
		String valor = sc.nextLine();

		int numero = Integer.parseInt(valor);

		// Verificar se o numero é IMPAR ou PAR
		if (numero % 2 == 0) 
			System.out.println("Esse númerp é PAR");
		else
			System.out.println("Esse número é ÍMPAR");
		
		sc.close();
	}
}
