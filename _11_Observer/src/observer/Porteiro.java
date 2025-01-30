package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {
	
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Assim que chegar me ligue digitando 1: ");
		
		while(true) {
			int valor = sc.nextInt();
			
			if(valor == 1) {
				ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
							
				// Notificar os observador que o evento ocorreu neste momento
				for(ChegadaAniversarianteObserver observer: this.observers) {
					observer.chegou(event);
				}
			} else {
				System.out.println("Alarme falso.....");
			} 
		}
	}
}
