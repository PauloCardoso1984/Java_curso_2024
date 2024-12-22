package oo.polimorfismo_estatico;

public class Sorvete {

	private double peso;
	
	
	// Construtor
	public Sorvete(double peso) {
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
