package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		
//		Inserir um dado no Banco de Dados
//		String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')";
		
		// Dessa forma basta passar um unico dado, caso o nome o id será gerado automaticamente
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
//		Dessa forma precisa de passar 2 parametro e o id tem que ser informado
//		String sql = "INSERT INTO pessoas (nome) VALUES (?, ?)";
		
		// conectando ao Banco de Dados
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);  // 1 é da primeira ?
	//	stmt.setInt(2, 10);			// 2 é da segunda ?
		
		stmt.execute();
		
		System.out.println(nome + " incluido no Banco de Dados com sucesso");
		sc.close();
	}

}
