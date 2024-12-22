package Lambda;

public class Calculo1MAIN {

	public static void main(String[] args) {		
		
		Calculo soma = new Somar();
		Calculo multiplica1 = new Multiplicar();
		
		System.out.println(soma.executar(5, 9));
		System.out.println(multiplica1.executar(5, 9));
		
		// Polimorfismo
		soma = new Multiplicar();
		System.out.println(multiplica1.executar(9, 9));
		
	}
}
