package br.com.cardoso.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cardoso.app.Calculadora;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		
		System.out.println(calc.soma(2, 3, 4, 5, 9));

		System.out.println(calc.getClass().getName());
	
		try {
			Field fielId = calc.getClass().getDeclaredFields()[0];
			fielId.setAccessible(true);
			fielId.set(calc, "def");			
			System.out.println(fielId.get(calc));
			
			fielId.setAccessible(false);
			
			System.out.println(calc.getId());
			
		} catch (Exception e) {
				e.printStackTrace();
		}		
		
		Calc c1 = new CalcSoma();
		Calc c2 = new CalcSoma2();
		
		System.out.println(c1.soma(1, 3, 5));
		System.out.println(c2.soma(7, 9, 1));
  	} 
}
