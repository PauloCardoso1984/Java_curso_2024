package oo.polimorfismo_dinamico;

public abstract class Comida {

	private double peso;

	// Construtor
	public Comida(double peso) {
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
