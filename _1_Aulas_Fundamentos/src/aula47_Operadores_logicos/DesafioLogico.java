package aula47_Operadores_logicos;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		/* Fazer um programa que peça 02 fonfirmações. Se trabalhar na terçe e quinta for verdaeiro:
		 * - compra um TV de 50".
		 * Caso contrário:
		 * - compra TV de 32"
		 * Em ambos os casos vamos no Shopping tomar sorvete.
		 * Caso seja tudo negativo 
		 * - familia ficará em casa.
		 */

		Scanner sc = new Scanner(System.in);		
		
		// FORMA 1
		System.out.println("Vai trabalhar na terça e quinta-feira? ");
		System.out.println("F = 0   ou   V = 1");
		int terca = sc.nextInt();
		int quinta = sc.nextInt();		
		
		if (terca == 1 && quinta == 1) {
			System.out.println("Oba!!\nVamos comprar uma TV de 50' e tomar sorvete no Shopping");
		} if (terca == 1 && quinta == 0) {
			System.out.println("Que legal!!\nVamos comprar uma TV de 32' e tomar sorvete no Shopping");
		} if (terca == 0 && quinta == 1) {
			System.out.println("Que legal!!\nVamos comprar uma TV de 32' e tomar sorvete no Shopping");
		} else  if (terca == 0 && quinta == 0) {
			System.out.println("Estamos sem grana...\nFicaremos em casa");
		}			
		sc.close();
	}
}
