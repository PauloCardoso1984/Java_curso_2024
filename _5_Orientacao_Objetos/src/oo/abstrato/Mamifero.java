package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	// Métodos inacabados -> isso é possivel em classe Abstrata
	public abstract String mamar();
}
