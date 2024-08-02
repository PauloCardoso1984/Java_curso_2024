package aula57_Calculadora;

import java.util.Scanner;

public class Caulculo_switch {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Escolher qual operação deseja fazer + - * /
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("\nQual operação deseja realizar? "
				+ "\n1 =  + "
				+ "\n2 =  - "
				+ "\n3 =  * "
				+ "\n4 =  /\n");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			System.out.println(num1 + num2);
			break;
		}
		case 2: {
			System.out.println(num1 - num2);
			break;
		}
		case 3: {
			System.out.println(num1 * num2);
			break;
		}
		case 4: {
			System.out.println((double)num1 / num2);
			break;
		}
		default:
			System.out.println("Valores inválidos...");
		}
		
	sc.close();
	}
}
