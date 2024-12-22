package generics_ChaveValor;

import java.util.TreeSet;

public class ComparableTesteMAIN {
	
	public static void main(String[] args) {
	
		// Organiza a lista em ordem / Número
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-125);
		
		for (Integer n : nums) {
			System.out.println(n);;
		}
		System.out.println();
		
		// Organiza a lista em ordem / Nome
		TreeSet<String> nome = new TreeSet<String>();
		
		nome.add("Paulo");
		nome.add("Cardoso Paulo");
		nome.add("Paulo Reginaldo");
		nome.add("Reginaldo Paulo ");
		nome.add("Cardoso");
		
		for (String nomes : nome) {
			System.out.println(nomes);
		}
	}	
}
