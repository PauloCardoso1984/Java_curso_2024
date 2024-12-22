package aula60_Exercicios_Fundamentos;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// Calcular IMC de uma pessoa e informar a condiação da pessoa
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu peso: ");
		String massa = sc.nextLine().replace(",", ".");
		
		System.out.print("Qual sua altura: ");
		String metros = sc.nextLine().replace(",", ".");		
		
		double peso = Double.parseDouble(massa);
		double altura = Double.parseDouble(metros);		
	
		System.out.println();
		
		double IMC = peso / (Math.pow(altura, altura));
		
		if (IMC < 19) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) muito magra");
		}
		if (IMC > 20 && IMC < 25 ) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) normal");
		}
		if (IMC > 25 && IMC < 30 ) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) sobrepeso");
		}
		if (IMC > 30 && IMC < 35 ) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) obesidade grau I");
		}
		if (IMC > 35 && IMC < 40 ) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) obesidade grau II");
		}
		if (IMC > 40 ) {
			System.out.println("Seu IMC é " + IMC + " é considerado(a) obesidade grau III");
		}
		sc.close();
	}
}
