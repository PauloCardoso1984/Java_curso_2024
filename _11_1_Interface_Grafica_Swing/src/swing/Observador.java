package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		// Sistema padrão de encerramento da janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// Tamanho da janela
		janela.setSize(400, 200);
		
		// Layout das letras
		janela.setLayout(new FlowLayout());
		
		// Centralizar a janela na tela do computador
		janela.setLocationRelativeTo(null);
		
		// Botão
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		// Classe anônima que pegará o clino na janela
		// Forma 1
		botao.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu...\n");				
			}
		});
		
		// Forma 2
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!!!");				
			});	
		
		// Visualizar a janela
		janela.setVisible(true);
	}
}
