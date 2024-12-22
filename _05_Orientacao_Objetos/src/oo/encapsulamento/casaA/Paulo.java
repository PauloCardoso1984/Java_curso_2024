package oo.encapsulamento.casaA;

public class Paulo {
	
	Deus esposa = new Deus();
	
	void testeAcessos() {
		/*
		segredo
		facoDentroDeCasa
		formaDeFalar
		todosSabem
		*/
//		System.out.println(esposa.segredo); (é privado)
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}

}
