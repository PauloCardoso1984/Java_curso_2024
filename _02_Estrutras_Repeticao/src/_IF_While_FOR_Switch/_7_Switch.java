package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _7_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		// Switch - SEM BREAK (if)
		String faixa = "preta";
		
		// Transformar tudo em maiuscula
		switch(faixa.toLowerCase()) {		
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;
		default: 
			System.out.println("Nao sei nada..."); 
		}
		
		// Switch - COM BREAK
		String conceito = "";
		System.out.print("\nInforme a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;

		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: case 5:
			conceito = "C";
			break;
			
		case 4: case 3:
			conceito = "D";
			break;
			
		case 2: case 1: case 0:
			conceito = "E";
			break;		
			
		default:
			conceito = "não encontrado....";			
		}		
		System.out.println("Conceito " + conceito);
		sc.close();
	}
}
