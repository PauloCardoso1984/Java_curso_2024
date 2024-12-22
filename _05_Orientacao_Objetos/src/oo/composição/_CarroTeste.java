package oo.composição;

public class _CarroTeste {

	public static void main(String[] args) {
	
		
		_Carro civic = new _Carro();
		System.out.println(civic.estaLigado());
		
		civic.ligar();
		System.out.println(civic.estaLigado());
		
		System.out.println(civic.motor.giros());
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();		
		System.out.println(civic.motor.giros());
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println(civic.motor.giros());		
		
		// Faltou encapsulamento
		civic.motor.fatorInjecao = -20;
		
		System.out.println(civic.motor.giros());

	}

}
