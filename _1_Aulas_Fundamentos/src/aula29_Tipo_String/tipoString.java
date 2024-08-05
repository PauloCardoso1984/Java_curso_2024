package aula29_Tipo_String;

import java.util.Scanner;

public class tipoString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 - " + "Olá pessoal".charAt(5));
		
		String s = "Boa tarde";

		// Tudo em maiuscula
		s = s.toUpperCase();
		
		s = "Boa tarde";
		
		// Concatenar
		System.out.println("1 - " + s.concat("!!!!!"));
		System.out.println("2 - " + s + "!!!!!");
		
		// Verificar se começa com a letra ou palavra identificada
		System.out.println("3 - " +s.startsWith("Boa"));
		System.out.println("4 - " + s.startsWith("boa"));
		
		// Ignorar se começa com maiuscula ou minuscula
		System.out.println("5 - " + s.toLowerCase().startsWith("boa"));
		
		// Verificar se termina com uma letra ou palavra
		System.out.println("6 - " + s.endsWith("dia"));
		System.out.println("7 - " + s.endsWith("tarde"));
		System.out.println("8 - " + s.toUpperCase().endsWith("TARDE"));
		
		// Quantos caracteres tem uma String
		System.out.println("9 - " + s.length());
		
		// Comparação de igualdade
		System.out.println("10 - " + s.equals("boa tarde"));
		System.out.println("11 - " + s.toLowerCase().equals("boa tarde"));
		System.out.println("12 - " + s.equalsIgnoreCase("boa tarde"));
		
		System.out.println();
		
		var nome = "Paulo";
		var sobrenome = "Cardoso";
		var idade = 40;
		var salario = 12321.98;
		
		// Forma 1 de imprimir
		System.out.println(nome + " " + sobrenome + "\nIdade: " + idade + "\nSalário R$: " + salario);
		
		// Forma 2 de imprimir
		System.out.printf("Nome: %s %s tem %d e recebe de salario R$: %.2f ", nome, sobrenome,idade, salario );
		
		// Forma 3 de imprimir
		String frase = String.format("\nNome: %s %s tem %d e recebe de salario R$: %.2f ", nome, sobrenome,idade, salario);
		System.out.println(frase);
		System.out.println();
		
		// Conversão dp Tipo Primitivo - Casting
		double a = 1;
		System.out.println(a);
		
		// Casting
		float b = (float)1.23456; 
		System.out.println(b);
		
		
		// aula 36 → 7m = https://www.udemy.com/course/fundamentos-de-programacao-com-java/learn/lecture/15397206#questions
		int c = 140; 
		byte d = (byte) c;
		System.out.println(d);
		System.out.println();
		
		
		// CONVERSÃO DE TIPOS NUMÉRICOS PARA STRING
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		int num2 = 200000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());		
		System.out.println(("" + num2).length());
		System.out.println();
		
		
		// CONVERSÃO DE STRING PARA NUMERO
		System.out.println("Digite 2 valores");
		String str1 = sc.next();
		String str2 = sc.next();		
		
		double numero1 = Double.parseDouble(str1);
		double numero2 = Double.parseDouble(str2);
		double soma = numero1 + numero2;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(soma);
		System.out.println();
	
		sc.close();
	}
}
