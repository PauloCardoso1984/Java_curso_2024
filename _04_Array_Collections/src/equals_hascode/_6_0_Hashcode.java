package equals_hascode;

import java.util.HashSet;

public class _6_0_Hashcode {

	public static void main(String[] args) {
	
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Paulo"));
		usuarios.add(new Usuario("Reginaldo"));
		usuarios.add(new Usuario("Céu"));
		usuarios.add(new Usuario("Anjo"));
		
		boolean resultado = usuarios.contains(new Usuario("Céu"));
		System.out.println(resultado);
		
		boolean resultado1 = usuarios.contains(new Usuario("Arcanjo"));
		System.out.println(resultado1);
		
	}
}
