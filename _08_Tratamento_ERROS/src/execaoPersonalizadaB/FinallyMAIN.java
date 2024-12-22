package execaoPersonalizadaB;

import java.util.Scanner;

public class FinallyMAIN {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite o numero ");
			x = sc.nextInt();
			System.out.println(7 / x);			
		} catch (Exception e) {
			System.out.println("O numero " + x + " " + e.getMessage());			
		} finally {
			System.out.println("Finally...");
			sc.close();			
		}
	System.out.println("Fim");

	}

}
