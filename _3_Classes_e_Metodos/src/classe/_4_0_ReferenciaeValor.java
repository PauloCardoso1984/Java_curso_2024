package classe;

public class _4_0_ReferenciaeValor {

	public static void main(String[] args) {

		byte a = 2;
		byte b = a; // atrituição poe valor (Tipo Primitivo)
		System.out.println(a + " - " + b);

		a++;
		b--;
		System.out.println(a + " - " + b);

		_2_1_Data d1 = new _2_1_Data("21", "08", "2024");
		_2_1_Data d2 = d1;

		d1.dia = "18";
		d2.mes = "02";

		System.out.println(d1.dataFormatad2());
		System.out.println(d2.dataFormatad2());
		
		// Chamar o metodo abaixo
		voltarDataParaValorPadrão(d1);
		System.out.println("\nUsando o metodo = " + d1);
		
		voltarDataParaValorPadrão(d2);
		System.out.println("Usando o metodo = " + d2);
		
		// Chamar o metodo que altera o primitivo → não sofre mudança
		int c = 5;
		alterarPrimitivo(c);
		System.out.println("\n" + c);		
	}
	
	// Metodo para volatar ao valor padrão
	static void voltarDataParaValorPadrão(_2_1_Data d) {
		d.dia = "1";
		d.mes = "1";
		d.ano = "1970";
	}
	
	static void alterarPrimitivo(int c) {
		c++;		
	}
}
