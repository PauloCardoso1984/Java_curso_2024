package excecao1_chacadaNaoChecada;

public class ChecadaVsNaoChecada_MAIN {

	public static void main(String[] args) {
	
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println("Qual foi o erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());		
			e.printStackTrace();
		}
		
		System.out.println("FIM...  ;)");
	}

	// Métodos
	// Excecao não CHECADA
	static void geraErro1() {
		// Se não colocaar o throw não será lançada a excecao
		throw new RuntimeException("Ocorreu um erro 01");
	}
	
	// Excecao CHECADA
	static void geraErro2() throws Exception {
		try {
			throw new Exception("Ocorreu um erro 02");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		}		
	}
}
