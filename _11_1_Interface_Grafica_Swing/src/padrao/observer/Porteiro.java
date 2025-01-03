package padrao.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registraObservador (ObservadorChegadaAniversariante observador){
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner sc = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou? ");
			valor = sc.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {	
				
				// Criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				// Notificar os interessados
				observadores.stream().forEach(o -> o.chegou(evento));
	//			break;
				valor = "sair";
			} else {
				System.out.println("Alarme falso!!!! \n");
			}
		}
		sc.close();
	}
}
