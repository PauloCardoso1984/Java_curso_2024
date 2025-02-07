package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _10_1_Excluir_Pessoa {

	public static void main(String[] args) throws SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual pessoa deseja excluir");		
		
		System.out.print("Informe o código para que seja EXCLUIDO: ");
		int codigo = sc.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		
		// neste caso excluirá todos que tiver o id maior que o informado
		String delete = "DELETE FROM pessoas WHERE codigo > ?"; 		
		
		PreparedStatement stmt = conexao.prepareStatement(delete);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa exluida com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Nada feito. \nAção cancelada....");
		}		
		conexao.close();
		sc.close();
	}
}