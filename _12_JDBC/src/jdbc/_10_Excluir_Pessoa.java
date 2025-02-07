package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _10_Excluir_Pessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual pessoa deseja excluir");
		
		
		System.out.print("Informe o código para que seja EXCLUIDO: ");
		int codigo = sc.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String delete = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(delete);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa exluida com sucesso!");
		} else {
			System.out.println("Nada feito. Ação cancelada....");
		}		
		conexao.close();
		sc.close();
	}
}
