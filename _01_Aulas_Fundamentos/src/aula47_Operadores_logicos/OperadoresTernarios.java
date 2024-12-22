package aula47_Operadores_logicos;

public class OperadoresTernarios {

	public static void main(String[] args) {
	
		  double media = 1.6;
		  
		  // Forma 1
		  String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovado";
		  String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
	
		  // Forma 2
		  String resultadoFinal1 = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Recuperação" : "Reprovado";
		  		  
		  System.out.println("O aluno está: " + resultadoFinal);	
		  System.out.println("O aluno está: " + resultadoFinal1);
	}
}
