package oo.heranca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	
	// Default não será necessário implementar nas classes
	default int velocidadeDoAr() {
		return 1;
	}
}
