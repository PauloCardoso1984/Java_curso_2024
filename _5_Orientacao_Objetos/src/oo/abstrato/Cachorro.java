package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Mama a cada 2 horas";
	}

}
