package oo.polimorfismo_estatico;

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
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
}
