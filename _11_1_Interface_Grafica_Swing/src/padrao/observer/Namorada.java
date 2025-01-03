package padrao.observer;

public class Namorada implements ObservadorChegadaAniversariante {

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar o aniversariante chegars...");
		System.out.println("Cantar os parabéns... \n");
	}
}
