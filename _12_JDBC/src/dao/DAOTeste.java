package dao;

public class DAOTeste {

	public static void main(String[] args) {
	
		DAO dao = new DAO();
		
//		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
//		System.out.println(dao.incluir(sql, "Paulo RRR Cardoso"));
//		System.out.println(dao.incluir(sql, "Paulo Reginaldo Card"));
//		System.out.println(dao.incluir(sql, "Paulo R2 Cardoso"));
//		System.out.println(dao.incluir(sql, "Paulo R3 Cardoso"));
		
		// Pode passar com mais de 1 parametro
		String sqll = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sqll, "Paulo RRR Cardoso", 1000));
		System.out.println(dao.incluir(sqll, "Paulo Reginaldo Card", 1001));
		System.out.println(dao.incluir(sqll, "Paulo R2 Cardoso", 1002));
		System.out.println(dao.incluir(sqll, "Paulo R3 Cardoso", 1003));
		
		dao.close();
	}
}
