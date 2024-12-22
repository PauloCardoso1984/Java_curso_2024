package generics_Lista;
import java.util.Arrays;
import java.util.List;

public class ListaUtilMAIN {
	
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS","PHP", "Python", "Java");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
	
		// METODO 1
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		Integer ultimoValor = (Integer) ListaUtil.getUltimo1(nums);
		
		System.out.println(ultimaLinguagem);
		System.out.println(ultimoValor);
	
		System.out.println("=========");
		
		// METODO 2
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		Integer ultimoValor2 = ListaUtil.getUltimo2(nums);
		
		System.out.println(ultimaLinguagem2);
		System.out.println(ultimoValor2);
	}
}
