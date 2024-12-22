package br.com.paulo.cm;

import br.com.paulo.modelo.Tabuleiro;
import br.com.paulo.visao.TabuleiroConsole;

public class AplicacaoMAIN {

	public static void main(String[] args) {
	
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);		
		new TabuleiroConsole(tabuleiro);
		
	}
}
