package oo.heranca;

public class Jogo_MAIN {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10, 10); // (x , y)
		
		Heroi heroi = new Heroi(10, 11); // (x , y)

		System.out.println("Monstro tem => " + monstro.vida + " vidas.");
		System.out.println("Heroi tem   => " + heroi.vida + " vidas.");
		
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida + " vidas.");
		System.out.println("Heroi tem   => " + heroi.vida + " vidas.");
	}
}
