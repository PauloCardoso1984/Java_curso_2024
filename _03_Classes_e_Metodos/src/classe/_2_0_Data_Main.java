package classe;

import java.util.Scanner;

public class _2_0_Data_Main {

	public static void main(String[] args) {

		// Aceitar String e Tranformar em Inteiro
		Scanner sc = new Scanner(System.in);
	
		_2_1_Data data = new _2_1_Data();
		System.out.println("Fazer um programa para montar duas datas.");
		System.out.print("Dia: ");
		data.dia = sc.next();
		int d = Integer.parseInt(data.dia); // Aceitar String e Tranformar em Inteiro
		
		System.out.print("Mês: ");
		data.mes = sc.next();
		int m = Integer.parseInt(data.mes); // Aceitar String e Tranformar em Inteiro
		
		System.out.print("Ano: ");
		data.ano = sc.next();
		int a = Integer.parseInt(data.ano); // Aceitar String e Tranformar em Inteiro
		System.out.println();
		
		_2_1_Data data1 = new _2_1_Data();
		System.out.print("Dia: ");
		data1.dia = sc.next();
		int d1 = Integer.parseInt(data1.dia); // Aceitar String e Tranformar em Inteiro
		
		System.out.print("Mês: ");
		data1.mes = sc.next();
		int m1 = Integer.parseInt(data1.mes); // Aceitar String e Tranformar em Inteiro
		
		System.out.print("Ano: ");
		data1.ano = sc.next();
		int a1 = Integer.parseInt(data1.ano); // Aceitar String e Tranformar em Inteiro
		
		System.out.println();
		System.out.println(d + "/" + m + "/" + a);
		System.out.printf("%d/%d/%d\n", d, m, a);
		System.out.println("Formatada pela classe: " + data.dataFormatada1(data.dia,data.mes,data.ano));
		data.imprimirDataFormatada();
		
		System.out.println("\n" + d1 + "/" + m1 + "/" + a1);
		System.out.printf("%d/%d/%d\n", d1, m1, a1);
		System.out.println("Formatada pela classe: " + data1.dataFormatad2());
		data1.imprimirDataFormatada();
		System.out.println();
	
		// Utilizando o construtor com argumentos
		_2_1_Data data5 = new _2_1_Data("18", "02","1984");
		System.out.println(data5);
		
		// Utilizando o construtor com argumentos definidos
		_2_1_Data data6 = new _2_1_Data();
		System.out.println(data6);
		
		sc.close();
	}
}
