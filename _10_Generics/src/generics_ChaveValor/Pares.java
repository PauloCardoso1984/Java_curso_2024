package generics_ChaveValor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Pares<C extends Number, V> {
	
	// Essa linha ABAIXO não precisa do COMPARABLE
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return;	
		Par<C, V> novoPar = new Par<C, V> (chave, valor);
		// === Esse restante do código substitui o anterior pelo atual ===
		if(itens.contains(novoPar)) { 
			itens.remove(novoPar);
		}
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;	
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null; 
	}
}
