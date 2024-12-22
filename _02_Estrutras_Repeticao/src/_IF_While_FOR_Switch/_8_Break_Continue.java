package _IF_While_FOR_Switch;

public class _8_Break_Continue {

	public static void main(String[] args) {

		// COM BREAK →→→ USAR
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			} System.out.println(i);
		} System.out.println("Fim...\n");
		
		// COM BREAK →→→ NÃO USAR
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if(a == 1) {
					break ;
				} System.out.printf("[%d %d] ", a, b);
			} System.out.println();
		}
		
		externo: for (int y = 0; y < 3; y++) {
			for (int z = 0; z < 3; z++) {
				if(y == 1) {
					break externo;
				} System.out.printf("[%d %d] ", y, z);
			} System.out.println();
		} System.out.println();

		
		// COM CONTINUE
		for (int j = 0; j < 10; j++) {
			if (j % 2 == 1) {
				continue;
			} System.out.println(j);
		} System.out.println("Fim...");

		// Neste caso vai pular o 5
		for (int x = 1; x <= 10; x++) {
			if (x == 5)
				continue;
			System.out.println(x);
		}
		
		externo: for (int y = 0; y < 3; y++) {
			for (int z = 0; z < 3; z++) {
				if(y == 1) {
					continue externo;
				} System.out.printf("[%d %d] ", y, z);
			} System.out.println();
		} System.out.println();
	}
}
