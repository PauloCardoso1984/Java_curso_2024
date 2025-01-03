package observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
	
		// Onde será identificado que chegou
		porteiro.addChegadaAniversarianteObserver(namorada);
		
		porteiro.start();
	}
}
