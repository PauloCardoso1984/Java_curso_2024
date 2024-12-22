package aula54_Equals;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner sc = new Scanner(System.in);
		String s2 = sc.next();
		// Trim → tira os espaços em branco
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		sc.close();
	}
}
