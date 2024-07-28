package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {

	public void ordenarLista(ArrayList<Integer> lista) {
		Collections.sort(lista);
	}
	
	public void encontraMaiorMenor(ArrayList<Integer> lista) {
		System.out.println("Lista: " + lista);
        System.out.println("Menor valor: " + Collections.min(lista));
        System.out.println("Maior valor: " + Collections.max(lista));
	}
	
}
