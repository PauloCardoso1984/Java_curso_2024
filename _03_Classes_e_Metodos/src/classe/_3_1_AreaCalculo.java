package classe;

public class _3_1_AreaCalculo {
	
	double raio;
	double la;
	double ladoMa;
	double ladoMe;
	static final double PI = 3.14;
	
	// Construtor padrão ou vazio
	_3_1_AreaCalculo() {
	}
	
	// Construtor com argumentos
	_3_1_AreaCalculo (double raioInicial) {
		raio = raioInicial;
	}
	
	// Construtor com argumentos
	_3_1_AreaCalculo (double lado, double ladoMaior, double ladoMenor) {
		lado = la;
		ladoMenor = ladoMe;
		ladoMaior = ladoMa;
	}
	
	// Metodo de calculo da área a circunferência
	double areaCircunferencia() {
		return Math.pow(raio, 2) * PI;
	}	
	
	double areaQuadrado(double la) {
		return la * la;
	}
	
	double areaRetangulo(double ladoMa, double ladoMe) {
		return ladoMa * ladoMe;
	}
	
	double areaTrianguloRetangulo(double ladoMa, double ladoMe) {
		return (ladoMa * ladoMe) / 2;
	}
}
