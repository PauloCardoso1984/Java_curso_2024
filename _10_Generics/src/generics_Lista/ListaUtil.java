package generics_Lista;

import java.util.List;

public class ListaUtil {
	
	// A interrogação quer dizer que pode ser lista dae qualquer natureza
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
