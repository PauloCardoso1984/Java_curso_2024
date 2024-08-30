package equals_hascode;

import java.util.Scanner;

public class _1_Equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Usuario u1 = new Usuario();
		u1.nome = "Paulo Cardoso";
		u1.email = "paulocardoso@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Paulo Cardoso";
		u2.email = "paulocardoso@gmail.com";
		
		// COMPARAÇÃO
		System.out.println(u1 == u2); // Não reconhece a igualdade
		System.out.println(u1.equals(u2)); // Reconhece a igualdade, porque criou o hascode na classe Usuario
		System.out.println(u2.equals(u1)); // Reconhece a igualdade, porque criou o hascode na classe Usuario

		sc.close();
	}
}