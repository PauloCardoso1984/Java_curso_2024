package aula44_Math;

public class Aritmetica {

	public static void main(String[] args) {
		
		int a = 2 + 3 * 4;
		
		// Potência
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		// DESAFIO
		int a1 = 6;
		int a2 = 3 + 2;
		int a3 = 3 * 2;
		
		int b1 = 1 - 5;
		int b2 = 2 - 7;
		int b3 = 2;
		
		double c1 = Math.pow(10, 3);
		
		double resultado1 = Math.pow((a1 * a2), 2);
		double resultado2 = Math.pow((b1 * b2) / b3, 2);		
		double resultado3 = Math.pow((resultado1 /a3) - resultado2, 3);
		int _final = (int) (resultado3 / c1);
		
		System.out.println(_final);		
	}
}
