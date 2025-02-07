package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost:3306?verifyServercertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "PAULO84";
		
		// Coneção com Banco de Dados
		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		// Criar o Banco de Dados
		Statement stmt = conexao.createStatement();
		
		// Criar no Banco de Dados se não existir
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();	
	}
}
