package aula57_Calculadora;

import java.util.Scanner;

public class Caculo_Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Numero 2: ");
		double num2 = sc.nextDouble();
		
		System.out.print("\n +"
				+ "\n -"
				+ "\n *"
				+ "\n /"
				+ "\n %"
				+ "\nInforme a operação: ");
		String op = sc.next();
		
		// Lógica
		double 
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("\nResultado: %.2f %s %.2f = %s ", num1, op, num2, resultado);
		
		sc.close();
	}
}
