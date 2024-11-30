package execaoPersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExcepition extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloExcepition(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;		
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo. ", nomeDoAtributo);
	}
}
