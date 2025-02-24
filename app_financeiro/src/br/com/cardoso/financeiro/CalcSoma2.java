package br.com.cardoso.financeiro;

import java.util.Arrays;

public class CalcSoma2 implements Calc {

	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}	
}
