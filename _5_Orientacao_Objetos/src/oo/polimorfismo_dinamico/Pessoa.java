package oo.polimorfismo_dinamico;

public class Pessoa {
	
	private double peso;

	// Construtor
	public Pessoa(double peso) {
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

	// Método
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}
