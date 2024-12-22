package classe;

public class _2_1_Data {
	
	String dia;
	String mes;
	String ano;

	// Construtor padrão com argumentos pre-definidos - 02 formas
	// Forma 1
/*	_2_1_Data () {
		dia = "1";
		mes = "2";
		ano= "1970";		
	}
*/	
	// Forma 2
	_2_1_Data () {
		this("1", "2", "1970");
	}
	
	_2_1_Data (String dia, String mes, String ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
	// MÉTODO
	String dataFormatada1(String dia, String mes, String ano) {
		return dia + "/" + mes + "/"+ ano;
	}
	
	// 1ª FORMA     
/*	String dataFormatad2() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}   
*/	
	// 2ª FORMA
	String dataFormatad2() {
		String formato = "%s/%s/%s";
		return String.format(formato, dia, mes, ano);
	}
	
	// UMA FUNÇÃO DENTRO DA OUTRA
	void imprimirDataFormatada() {
		System.out.println(dataFormatad2());
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
