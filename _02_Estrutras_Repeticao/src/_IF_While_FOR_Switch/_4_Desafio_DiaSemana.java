package _IF_While_FOR_Switch;

import java.util.Scanner;

public class _4_Desafio_DiaSemana {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o dia semana: ");
		String semana = sc.next();
		
		// MANEIRA 1 - ignorando letras maiusculas		
		if (semana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (semana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (semana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (semana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia da semana não loclaizado...");
		}	
		
		// MANEIRA 2		
		if ("domingo".equalsIgnoreCase(semana)) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(semana)) {
			System.out.println("2");
		} else if ("terça".equalsIgnoreCase(semana)) {
			System.out.println("3");
		} else if ("quarta".equalsIgnoreCase(semana)) {
			System.out.println("4");
		} else if ("quinta".equalsIgnoreCase(semana)) {
			System.out.println("5");
		} else if ("sexta".equalsIgnoreCase(semana)) {
			System.out.println("6");
		} else if ("sabado".equalsIgnoreCase(semana)) {
			System.out.println("7");
		} else {
			System.out.println("Dia da semana não loclaizado...");
		}	
		
		// MANEIRA 3 - transformar tudo em minuscula		
		if ("domingo".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("2");
		} else if ("terça".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("3");
		} else if ("quarta".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("4");
		} else if ("quinta".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("5");
		} else if ("sexta".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("6");
		} else if ("sabado".equalsIgnoreCase(semana.toLowerCase())) {
			System.out.println("7");
		} else {
			System.out.println("Dia da semana não loclaizado...");
		}
				
		sc.close();
	}
}
