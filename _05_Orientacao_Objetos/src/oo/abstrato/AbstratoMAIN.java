package oo.abstrato;

public class AbstratoMAIN {

	public static void main(String[] args) {
	
		Animal a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println();
		
		Mamifero b = new Cachorro();
		System.out.println(b.mover());
		System.out.println(b.respirar());
		System.out.println(b.mamar());

	}
}
