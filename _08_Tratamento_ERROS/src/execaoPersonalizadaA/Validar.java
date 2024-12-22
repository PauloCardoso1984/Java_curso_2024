package execaoPersonalizadaA;

public class Validar {
	
	private Validar() {
	}
	
	public static void aluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");
		}
		// TRIM -> tira os espaços e isEmpyty -> está vazio
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExcepition("nome");
		}
		if (aluno.nota < 0 || aluno.nota > 10 ) {
			throw new NumeroForaIntervaloExcepition("nota");
		}
	}
}
