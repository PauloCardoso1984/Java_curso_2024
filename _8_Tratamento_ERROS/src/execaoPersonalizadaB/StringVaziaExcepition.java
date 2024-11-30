package execaoPersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaExcepition extends Exception {
	
	private String nomeDoAtributo;
	
	public StringVaziaExcepition(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;		
	}
	
	public String getMessage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
