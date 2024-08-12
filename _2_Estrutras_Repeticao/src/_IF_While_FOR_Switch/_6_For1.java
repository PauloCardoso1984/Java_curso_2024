package _IF_While_FOR_Switch;

public class _6_For1 {

	public static void main(String[] args) {
		
		// Contador de 2 em 2
		for (int contador = 0; contador <= 20; contador +=2 ) {
			System.out.println(contador);
		} System.out.println();
		
		// Contador de 2 em 2
		for (int contador = 0; contador <= 20; contador +=2 ) {
			System.out.printf("i = %d\n", contador);
		} System.out.println();
		
		// Contador de 1 em 1
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		} System.out.println();
		
		// Decremento
		for (int contador = 10; contador >= 0; contador--) {
			System.out.println(contador);
		} System.out.println();
		
		// Forma 1 - Decremento de 2 em 2
		for (int contador = 10; contador >= 0; contador-= 2) {
			System.out.println("Numero: " + contador);
		} System.out.println();
		
		// Forma 2 - Decremento de 2 em 2
		for (int contador = 10; contador >= 0; contador-= 2) {
			System.out.printf("Numero = %d\n", contador);
		} System.out.println();
		
		// (DIFERENTE)
		int i = 1;
		for(; i < 10; i++) { System.out.println(i); } 
		System.out.println("Saiu do For..."); System.out.println(i); 
		System.out.println();
		
		// For dentro de For
		for (int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.printf("[%d %d]  ", x, y);
			}
			System.out.println();
		} System.out.println();
		
		// Desafio FOR - 1
		String valorA = "#";
		for (int w = 1; w <= 5; w++) {
			System.out.println(valorA);
			valorA += "#";
		} System.out.println();
		
		// Desafio FOR - 2
		for(String v = "X"; !v.equals("XXXXXXXXXX"); v += "X") {
			System.out.println(v);
		}
	}
}
