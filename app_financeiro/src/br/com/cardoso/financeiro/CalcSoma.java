package br.com.cardoso.financeiro;

public class CalcSoma implements Calc {

	@Override
	public double soma(double... nums) {
		double total = 0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;
	}
}
