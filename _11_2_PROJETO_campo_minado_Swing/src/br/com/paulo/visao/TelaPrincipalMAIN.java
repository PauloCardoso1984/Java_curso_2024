package br.com.paulo.visao;

import javax.swing.JFrame;

import br.com.paulo.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipalMAIN  extends JFrame {
	
	public TelaPrincipalMAIN() {
		
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);	
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipalMAIN();
	}
}
