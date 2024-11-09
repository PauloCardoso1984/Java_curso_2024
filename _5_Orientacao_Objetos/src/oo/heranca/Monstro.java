package oo.heranca;

public class Monstro extends Jogador{
	
	// Sobreescrevendo o construtor
	Monstro(int x, int y){
		super (x, y);
	}
	
	Monstro() {
		this (0, 0);
	}
}
