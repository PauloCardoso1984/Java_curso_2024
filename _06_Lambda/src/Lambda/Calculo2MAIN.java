package Lambda;

public class Calculo2MAIN {

	public static void main(String[] args) {
		
		// Expressões Lambda
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(3, 3));
		
		Calculo calc1 = (x, y) -> { return x * y; };
		System.out.println(calc1.executar(3, 3));
		
		calc = (x, y) -> x / y;
		System.out.println(calc.executar(3, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
	}
}
