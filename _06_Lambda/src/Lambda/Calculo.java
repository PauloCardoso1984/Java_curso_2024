package Lambda;

// Com essa anotação diz que a interface poderá ter apenas 1 único método abstrato funcional.
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "Legal...";
	}

	static String muitoLegal() {
		return "Muito legal...";
	}
}
