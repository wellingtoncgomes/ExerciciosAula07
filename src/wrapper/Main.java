package wrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> listaString = List.of("1", "2", "3", "4", "5");
        List<Integer> listaInteiro = new ArrayList<>();
        
        ListaInteiros lista = new ListaInteiros();
        
        lista.converterLista(listaString, listaInteiro);
        System.out.println(listaInteiro);
        
        System.out.println("soma:"+ lista.somarLista(listaInteiro));
        System.out.println("média:"+ lista.mediaListaInteiros(listaInteiro));
        System.out.println("soma lista de string:"+ lista.somarListaString(listaString));
	}
}