package oo.heranca.desafio;

public class Carro_MAIN {

	public static void main(String[] args) {
	
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();		
		
		civic.acelerar();
		ferrari.acelerar();		
		System.out.println("Civic   " + civic);
		System.out.println("Ferrari " + ferrari + "\n");
		
		civic.acelerar();
		ferrari.acelerar();		
		ferrari.ligarTurbo();
		System.out.println("Civic   " + civic);		
		System.out.println("Ferrari " + ferrari + "\n");
		
		civic.acelerar();
		ferrari.acelerar();
		System.out.println("Civic   " + civic);				
		System.out.println("Ferrari " + ferrari + "\n");

		System.out.println("A velocidade do AR " + ferrari.velocidadeDoAr() + "\n");
		
		civic.frear();
		ferrari.frear();
		System.out.println("Civic   " + civic);				
		System.out.println("Ferrari " + ferrari + "\n");
		
	}
}
