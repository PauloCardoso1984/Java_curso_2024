package excecaoCausada;

public class ExcecaoCausadaMAIN {

	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null ) {
				System.out.println(e.getCause().getMessage());
			}		
		}
	}
	
	// Método
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}		
	}
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nuloooo!!!");
		}
		System.out.println(aluno.nome);
	}
}
