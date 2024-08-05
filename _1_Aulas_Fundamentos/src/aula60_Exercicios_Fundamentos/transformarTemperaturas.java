package aula60_Exercicios_Fundamentos;

import java.util.Scanner;

public class transformarTemperaturas {

	public static void main(String[] args) {
		
		// Tranformar Celsius em Fahrenheit		
		Scanner sc = new Scanner(System.in);
		System.out.print("Transformar a Temperatura de Celsius em Fahrenheit "
				+ "\nDigite a temperatura: ");
		
		double celsius = sc.nextDouble();		
		double fahrenheit = (celsius * 9 / 5) + 32;		
		System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit);
		System.out.println();
		
		
		// Tranformar Fahrenheit em Celsius		
		System.out.print("Transformar a Temperatura de Fahrenheit em Celsius"
				+ "\nDigite a temperatura: ");
		
		double fahrenheit1 = sc.nextDouble();		
		double celsius1 = (fahrenheit1 - 32) * 5 / 9;		
		System.out.println("A temperatura em Fahrenheit é de: " + celsius1);
		
		sc.close();
	}
}