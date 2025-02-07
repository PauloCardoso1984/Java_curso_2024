package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	public static void main(String[] args) throws SQLException {	
	
	// Fazendo acesso a conexao por meio da class
	Connection conexao = FabricaConexao.getConexao();

	// Comando para criar a tabela
	String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
			+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
			+ "nome VARCHAR(80) NOT NULL)";
	
	Statement stmt = conexao.createStatement();
	// Passando o SQL para execução
	stmt.execute(sql);
	
	System.out.println("Tabela criada com sucesso!!");
	
	conexao.close();	
	}
}
