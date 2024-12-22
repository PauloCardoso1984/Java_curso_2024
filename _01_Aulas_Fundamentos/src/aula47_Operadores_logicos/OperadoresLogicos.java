package aula47_Operadores_logicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
			
	boolean condicao1 = true;
	boolean condicao2 = 3 > 7;
	
	System.out.println(" 1 - " + condicao1);
	System.out.println(" 2 - " + condicao2);
	System.out.println(" 3 - " + (condicao1 && !condicao2));
	System.out.println(" 4 - " + (condicao1 && condicao2));
	System.out.println(" 5 - " + (condicao1 || condicao2));
	System.out.println(" 6 - " + (condicao1 ^ condicao2));
	System.out.println(" 7 - " + !condicao1);
	System.out.println(" 8 - " + condicao2);
	System.out.println();
	
	// Tabela verdade E
	System.out.println("Tabela verdade E (AND)");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	System.out.println();

	// Tabela verdade OU
	System.out.println("Tabela verdade OU (OR)");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	System.out.println();
	
	// Tabela verdade OU Exlusivo
	System.out.println("Tabela verdade OU Eclusivo (XOR)");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	System.out.println();
	
	// Tabela verdade NOT (Nagação)
	System.out.println("Tabela verdade NOT (Negação)");
	System.out.println(!true);
	System.out.println(!false);
	System.out.println();
	}
}
