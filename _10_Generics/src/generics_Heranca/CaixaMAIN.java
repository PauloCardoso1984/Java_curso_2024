package generics_Heranca;

public class CaixaMAIN {

	public static void main(String[] args) {

		// Usar outra forma da CaixaInt
		/*
		 * CaixaInt<String> caixaA = new CaixaInt<>(); 
		 * caixaA.guardar("Teste");
		 * System.out.println(caixaA.abrir());
		 */

		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		System.out.println(caixaA.abrir());

		// ==========================================
		// Usando a Classe CaixaNumero

		CaixaNumero<Double> caixa1 = new CaixaNumero<>();
		caixa1.guardar(2.3);
		System.out.println(caixa1.abrir());
		
		CaixaNumero<Integer> caixa2 = new CaixaNumero<>();
		caixa2.guardar(18);
		System.out.println(caixa2.abrir());
	}
}
