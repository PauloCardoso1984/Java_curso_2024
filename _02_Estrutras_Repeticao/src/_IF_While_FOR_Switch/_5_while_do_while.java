package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _5_while_do_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Aula 1 - While Determinado
		int contador = 1;
		int contar = 1;

		while (contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}
		System.out.println();

		while (contar <= 20) {
			System.out.printf("i = %d / ", contar);
			contar += 2;
		}
		System.out.println();
		System.out.println();

		
		// Aula 2 - While Indeterminado
		String valor = "";
		// Enquanto não digitar "sair" o programa não para / Ignorando a forma escrrita
		while (!valor.trim().equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			valor = sc.nextLine();
		}
		System.out.println("Programa encerrado.... \n");
		
		
		// Aula 3 - do While 
		String texto = "";
		// Enquanto não digitar "sair" o programa não para / Ignorando a forma escrrita
		do {
			System.out.print("Para parar digite SAIR. Voce diz: ");
			texto = sc.nextLine();
		} while (!texto.trim().equalsIgnoreCase("sair"));		
		
		System.out.println("Programa encerrado....\n");
		
		
		// Aula 4 - Desafio
		// Somar as notas de uma turma e depdois verificar a média, se digitir -1 sai do programa e as nortos somente podem estar entre 0 e 10
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = sc.nextDouble();
			
			if(nota >0 && nota <=10) {
				total += nota; // somando as notas digitadas
				quantidadeNotas++; // quantidade de notas digitadas
			} else {
				System.out.println("==== Nota inválida!!!==== ;)");
			}
		}
		System.out.println();
	
		double notab = 0;
		int quantidadeNotasb = 0;
		double totalb = 0;
		
		while(notab != -1) {
			System.out.print("Informe a nota: ");
			notab = sc.nextDouble();
			
			if(notab >0 && nota <=10) {
				totalb += notab; // somando as notas digitadas
				quantidadeNotasb++; // quantidade de notas digitadas
			} else if(notab != -1) {
				System.out.println("==== Nota inválida!!!====/ ;)");
			}
		}
		
		// Média
		double media = total / quantidadeNotas;
		double mediab = totalb / quantidadeNotasb;
		System.out.println("\nMédia da turma = " + media);
		System.out.println("Média da turma = " + mediab);
		
		sc.close();
	}
}
