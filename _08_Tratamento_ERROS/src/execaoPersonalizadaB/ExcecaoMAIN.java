package execaoPersonalizadaB;

public class ExcecaoMAIN {

	public static void main(String[] args) {
		
		try {
		Aluno aluno = new Aluno("Paulo", 8);
		Validar.aluno(aluno);
		} catch (StringVaziaExcepition | NumeroForaIntervaloExcepition | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaExcepition | NumeroForaIntervaloExcepition | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim ;)");

	}
}