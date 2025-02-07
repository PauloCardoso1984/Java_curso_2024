package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class _7_ConsultarPessoa_1 {

	public static void main(String[] args) throws SQLException {

		// Consultar todas as pessoas do Banco de Dados
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		// armazenar o resultado em uma variavel
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<_6_Pessoa> pessoas = new ArrayList<>();
		
		// Pretendo receber diversas linha, por isso o while
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new _6_Pessoa(codigo, nome));
		}
		
		for(_6_Pessoa p : pessoas){
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		} 
		
		stmt.close();
		conexao.close();
	}
}
