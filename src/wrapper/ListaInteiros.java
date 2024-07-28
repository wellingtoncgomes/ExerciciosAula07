package wrapper;
import java.util.List;

public class ListaInteiros {
	
	public void converterLista(List<String> listaString,List<Integer> listaInteiro) {
		
		for(String numero: listaString) {
			listaInteiro.add(Integer.parseInt(numero));
		}
	}
	
	public int somarLista(List<Integer> listaInteiro) {
		int soma = 0;
		for(int numero : listaInteiro) {
			soma+= numero;
		}
		return soma;
	}
	
	public int mediaListaInteiros(List<Integer> listaInteiro) {
		int soma = somarLista(listaInteiro);
		int media = soma/listaInteiro.size();
		return media;		
	}

	public int somarListaString(List<String> listaString) {
		int soma = 0;
		for(String numero : listaString) {
			soma+= Integer.parseInt(numero);
		}
		return soma;
	}
}
