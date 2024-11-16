package Funcao;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOUimprar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOUimprar.apply(33));

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + " !!!!";
		
		Function<String, String> duvida = valor -> valor + " ????";
		
		String resultadoFinal1 = parOUimprar.andThen(empolgado).andThen(oResultadoE).apply(32);
		String resultadoFinal2 = parOUimprar.andThen(duvida).andThen(oResultadoE).apply(32);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);

	}
}
