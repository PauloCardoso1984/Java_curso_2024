package classe;

public class _5_0_Null {

	public static void main(String[] args) {
		
		// DIFERENÇA ENTRE NULO E VAZIO
		
		// VAZIO
		String s1 = "";
		System.out.println(s1);
		System.out.println(s1.concat("!!!!!!"));
		
		// NULO
		String s2 = null;
		System.out.println(s2);
		if(s2 != null ) {
			System.out.println(s2.concat("!!!!!!")); // Existe esse erro porque sempre será nulo
		} System.out.println("Valor nulo");
		
		_2_1_Data d1 = Math.random() > 0.5 ? new _2_1_Data() : null;
		
		if (d1 != null) {
			System.out.println(d1.dataFormatad2());
		}
		
		String d2 = Math.random() > 0.5 ? "Opa" : null;
		if(d2 != null ) {
			System.out.println(d2.concat("!!!!!!"));
		}
	}
}
