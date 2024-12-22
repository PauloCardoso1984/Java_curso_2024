package oo.polimorfismo_estatico;

public class Feijao {
	
	private double peso;
	
	
	// Construtor
	public Feijao(double peso) {
		setPeso(peso); // pegando o valor do Set
	}

	// Get e Set
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}

