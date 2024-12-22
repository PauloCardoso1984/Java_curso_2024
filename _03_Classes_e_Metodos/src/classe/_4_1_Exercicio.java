package classe;

public class _4_1_Exercicio {

	// Para usar dentro do escopo precisa colocar static
	static int a = 3;	
	int b = 5;
	
	public static void main(String[] args) {
		// Usando classe static
		System.out.println(a);		
		
		// Para usar int b = 5; vou precisar de instanciar
		_4_1_Exercicio t = new _4_1_Exercicio();
		System.out.println(t.b);
	}
}
