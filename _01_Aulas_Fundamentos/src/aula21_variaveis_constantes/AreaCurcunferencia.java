package aula21_variaveis_constantes;

public class AreaCurcunferencia {

	public static void main(String[] args) {

		double raio = 3.4;
		final double PI = 3.141559; // final → não deixará o valor ser alterado

		// Calcular area da circuferência
		// Forma 1
		double area = PI * raio * raio;
		System.out.println("Área: " + area);

		// Forma 2
		System.out.println("Área: " + PI * raio * raio);

		// Mudando o valor do raio
		raio = 52;
		System.out.println("Área: " + PI * raio * raio);
	}
}
