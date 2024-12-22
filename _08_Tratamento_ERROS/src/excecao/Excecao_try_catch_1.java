package excecao;

public class Excecao_try_catch_1 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Paulo", 9.8);
		
		
		try {
		imprimirNomeAluno(aluno);
		} catch(Exception e){
			System.out.println("Ocorreu um erro no moemnto de imprimir o nome!!!");
		}
		
		try {
		// Causando um erro
		System.out.println(7 / 0);
		} catch (ArithmeticException e) { 	// Tratamento dado a aritmetica
			e.printStackTrace(); 			// Mostrar o erro
			System.out.println("Ocorreu o erro: " + e.getMessage());
			System.out.println("Não pode dividir numero por 0.. Burrroooo...");
		}
		
		System.out.println("Fim :)");

	}
	// Método
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);		
	}
}
