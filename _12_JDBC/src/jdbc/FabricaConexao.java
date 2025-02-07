package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() {

		try {
			// Dados da conexão
			Properties prop = getProperties();

			// Coneção com Banco de Dados - Tentativa de via documento properties
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
// 		Coneção com Banco de Dados - Tentativa de conexão
//		final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServercertificate=false&useSSL=true";
//		final String usuario = "root";
//		final String senha = "PAULO84";

	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}
