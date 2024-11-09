package oo.composição;

public class _Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
		return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
