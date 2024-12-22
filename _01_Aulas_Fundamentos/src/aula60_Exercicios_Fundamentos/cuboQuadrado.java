package aula60_Exercicios_Fundamentos;

import java.util.Scanner;

public class cuboQuadrado {

	public static void main(String[] args) {
		
		/*Criar um programa que leia um valor e apresente os resultados ao quadrado e aocubo do valor*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para apresentar o valor ao cubo e ao quadrado");
		System.out.print("Valor: ");
		String valor = sc.nextLine().replace(",", ".");
		
		double numero = Double.parseDouble(valor);
		
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		
		System.out.println("\nVaor transformado: \nQuadrado: " + quadrado + "\nCubo: " + cubo);
		
		sc.close();
	}
}
