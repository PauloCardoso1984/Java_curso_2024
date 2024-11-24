package reduce3;

public class MediaTeste {
	public static void main(String[] args) {
		
		System.out.print("Media de m1 = ");
		Media m1 = new Media();
		m1.adicionar1(8.6);
		m1.adicionar1(6.5);		
		System.out.println(m1.getValor());		

		System.out.print("Media de m2 = ");
		Media m2 = new Media().adicionar2(7.6).adicionar2(6.5);		
		System.out.println(m2.getValor());	
		
		// Media de m1 e m2
		System.out.print("Media de m1 e m2 = ");
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
	}
}
