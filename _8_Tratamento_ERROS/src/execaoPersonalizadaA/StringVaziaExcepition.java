package execaoPersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExcepition extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public StringVaziaExcepition(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;		
	}
	
	public String getMessage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
