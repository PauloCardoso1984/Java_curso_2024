package br.com.cardoso.app.calculo;

import br.com.cardoso.app.Calculadora;
import br.com.cardoso.app.calculo.interno.OperacoesAritmetica;
import br.com.cardoso.app.logging.Logger;

public class CalculadoraImpl implements Calculadora  {
	
	private String id = "abc";

	private OperacoesAritmetica opAritmetica = new OperacoesAritmetica();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmetica.soma(nums);
	}

	public String getId() {
		return id;
	}
}