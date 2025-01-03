package padrao.observer;

public class AniversarioSurpresaMAIN {
	
	public static void main(String[] args) {
		
		Porteiro porteiro = new Porteiro();
		Namorada namorada = new Namorada();		
		
		// Forma 1
/*		porteiro.registraObservador(namorada);
		porteiro.monitorar();
*/		
		// Forma 2
		porteiro.registraObservador(namorada);
		porteiro.registraObservador(e -> { 
			System.out.println("Surpresa via lambda");
			System.out.println("Ocorreu em: " + e.getMomento());
		});
			
		porteiro.monitorar();
	}
}
