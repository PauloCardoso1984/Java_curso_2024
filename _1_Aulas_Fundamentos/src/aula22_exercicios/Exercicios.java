package aula22_exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// Transformar Celsius em Farenheit
		// Formula = (F - 32) x 5/9
		System.out.print("Digite o valor em Farenheit → Celcius: ");
		double F = sc.nextDouble();
		double Farenheit = (F - 32) * (5.0 / 9.0);
		System.out.println(Farenheit + "ºC");		
		
		sc.close();

	}
}
