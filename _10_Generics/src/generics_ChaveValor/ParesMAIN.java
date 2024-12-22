package generics_ChaveValor;

public class ParesMAIN {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Paulo");
		resultadoConcurso.adicionar(2, "Reginaldo");
		resultadoConcurso.adicionar(3, "Cardoso");
		resultadoConcurso.adicionar(4, "Paulo Cardoso");
		resultadoConcurso.adicionar(5, "Cardoso Paulo");
		resultadoConcurso.adicionar(2, "Reginaldo Cardoso");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));

	}
}
