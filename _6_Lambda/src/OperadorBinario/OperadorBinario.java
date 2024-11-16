package OperadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.9, 5.9));

		// Forma 1
		BiFunction<Double, Double, String> resultado1 = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1.apply(9.8, 6.8));

		// Forma 2
		BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado2.apply(8.8, 1.8));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(4.5, 6.0));
	}
}
