package aula27_NotacaoPonto;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia";
		System.out.println(s);
		
		
		// Converter tudo em maiuscula
		s = s.toUpperCase();
		System.out.println(s);
		
		// Converter tudo em minusculas
		s = s.toLowerCase();
		System.out.println(s);
		
		// Substituir uma caractere por outro
		s = s.replace("dia", "ano");
		System.out.println(s);

		// Concatenar String
		s = s.concat(" !!!!!");
		System.out.println(s);

		System.out.println("Paulo".toUpperCase());

	}
}
