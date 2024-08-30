package classe;

import java.util.Scanner;

public class _3_0_AreaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		_3_1_AreaCalculo area = new _3_1_AreaCalculo();
		System.out.print("Digite um valor de raio para calcular a área: ");
		area.raio = sc.nextDouble();

		System.out.println("Valor = " + area.areaCircunferencia());

		_3_1_AreaCalculo area2 = new _3_1_AreaCalculo(9);

		System.out.println("Valor = " + area2.areaCircunferencia());
		System.out.println("Valor de PI = " + _3_1_AreaCalculo.PI);
		
		System.out.println("\nO que deseja calcular: \n1 - Cincunferência \n2 - Quadrado \n3 - Retangulo \n4 - Triângulo-Retângulo ");
		int w = sc.nextInt();
		
		if (w == 1 ) {
			System.out.print("\nDigite o valor do raio : ");
			area.raio = sc.nextDouble();
			System.out.print("Circunferência : " + area.areaCircunferencia());
		} else 
			if (w == 2) {
			System.out.println("\nDigite o valor do lado : ");
			area.la = sc.nextDouble();
			System.out.print("Quadrado : " + area.areaQuadrado(w));
		} else 
			if (w == 3) {
			System.out.print("Digite o valor do lado Maior : ");
			double a = sc.nextDouble();
			System.out.print("Digite o valor do lado Menor : ");
			double b = sc.nextDouble();
			System.out.print("Retângulo : " + area.areaRetangulo(a, b));
		} else 
			if (w == 4) {
			System.out.print("Digite o valor do lado Maior : ");
			double a = sc.nextDouble();
			System.out.print("Digite o valor do lado Menor : ");
			double b = sc.nextDouble();
			System.out.print("Triângulo-Retângulo : " + area.areaTrianguloRetangulo(a, b));
		} else {
			System.out.println("Operação não identificada....");
		}		
		
		sc.close();
	}
}
