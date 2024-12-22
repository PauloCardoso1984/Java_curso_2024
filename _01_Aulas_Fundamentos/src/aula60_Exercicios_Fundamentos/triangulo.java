package aula60_Exercicios_Fundamentos;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Áre do triângulo retângulo: ");
		System.out.print("Base: ");
		double base = sc.nextDouble();

		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		double area = (base * altura) / 2;

		System.out.println("Area é de: " + area);

		sc.close();
	}
}
