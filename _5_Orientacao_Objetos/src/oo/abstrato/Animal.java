package oo.abstrato;

public abstract class Animal {
	
	public String respirar() {
		return "Usando Oxigênio";
	}
	
	// Métodos inacabados -> isso é possivel em classe Abstrata
	public abstract String mover();
}
