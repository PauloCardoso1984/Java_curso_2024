package aula57_Calculadora;

import java.util.Scanner;

public class Calculo_IF {

	public static void main(String[] args) {
		
		// Ler num1
		// Ler num2
		// Escolher qual operação deseja fazer + - * /
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual operação deseja realizar? "
				+ "\n1 =  + "
				+ "\n2 =  - "
				+ "\n3 =  * "
				+ "\n4 =  /");
		int operacao = sc.nextInt();
		
		System.out.println("Digite os números: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (operacao == 1) {
			System.out.println(num1 + num2);
		}
		if(operacao == 2) {
			System.out.println(num1 - num2);
		}
		if (operacao == 3) {
			System.out.println(num1 * num2);
		}
		if (operacao == 4) {
			System.out.println(num1 / num2);
		}
	}
}
