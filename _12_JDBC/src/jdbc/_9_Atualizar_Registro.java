package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class _9_Atualizar_Registro {

	public static void main(String[] args) throws SQLException {
		
		// entrada via teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o id da pessoa: ");
		int codigo = sc.nextInt();
		sc.nextLine(); // Consumir a linha
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		// criando a conexao com Banco de Dados
		Connection conexao = FabricaConexao.getConexao();		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			_6_Pessoa p = new _6_Pessoa(r.getInt(1), r.getString(2)); // indice 1 e coluna 2
			System.out.println("O nome atual é: " + p.getNome());
			
			System.out.print("Informe o novo nome: ");
			String novoNome = sc.nextLine();
			
			// fazendo atualização no Banco de Dados - UPDATE			
			stmt.close();	// encerrando a PreparedStatement
			stmt = conexao.prepareStatement(update);  // nova conexao PreparedStatement
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute(); // essa linha quem atualizará o Banco de Dados
			
			System.out.println("Pessoa alterada do sucesso!!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		conexao.close();
		sc.close();
	}
}