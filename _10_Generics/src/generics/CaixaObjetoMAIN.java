package generics;

public class CaixaObjetoMAIN {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double-> vai transformar em Double
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá Mundo"); // double-> vai transformar em Double
		// Forma 1
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		// Forma 2
		System.out.println(caixaB.abrir());
		
		System.out.println("\n");
		
		// ========================================
		
		CaixaGenerics<String> caixa1 = new CaixaGenerics<>();
		caixa1.guardar("Segredo!!");
		// Forma 1
		System.out.println(caixa1.abrir());
		
		// Forma 2
		String coisa1 = caixa1.abrir();
		System.out.println(coisa1);
		
		
		CaixaGenerics<Double> caixa2 = new CaixaGenerics<>();
		caixa2.guardar(3.1415);
		// Forma 1
		System.out.println(caixa1.abrir());
		
		// Forma 2
		Double coisa2 = caixa2.abrir();
		System.out.println(coisa2);
	}
}
