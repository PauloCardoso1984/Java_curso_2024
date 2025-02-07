package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _8_ConsultarPessoa_2 {

	public static void main(String[] args) throws SQLException {  
		
		// CONSULTAR REGISTRO NO BANCO DE DADOS
		
		Scanner sc = new Scanner(System.in);
		
		// Consultar todas as pessoas do Banco de Dados
		Connection conexao = FabricaConexao.getConexao();
		
		// fazer busca pelo nome 
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		System.out.print("Informe o valor pra pesquisa: ");
		String pesquisa = sc.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);		
		
		// parametro para a busca
		stmt.setString(1, "%" + pesquisa + "%");
		ResultSet resultado = stmt.executeQuery();
		
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
		sc.close();
	}
}


