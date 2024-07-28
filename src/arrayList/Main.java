package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		listaTarefa.adicionaTarefa("Fazer Atividade LP3");
		listaTarefa.adicionaTarefa("Fazer Prova 31/07");
		listaTarefa.adicionaTarefa("Ir ao Mercado");
		listaTarefa.adicionaTarefa("Fazer natação");
		
		listaTarefa.mostrarListaTarefa();
		System.out.println("================================");
		listaTarefa.removerTarefas("Ir ao Mercado");
		listaTarefa.mostrarListaTarefa();
		
		System.out.println("================================");
	    ArrayList<Integer> numeros = new ArrayList<>();
	    OrdenarLista ordenador = new OrdenarLista();
	    numeros.add(5);
	    numeros.add(3);
	    numeros.add(8);
	    numeros.add(1);
	    numeros.add(2);
	    System.out.println(numeros);
	    System.out.println("================================");
	    ordenador.ordenarLista(numeros);
	    System.out.println(numeros);
	    System.out.println("================================");
	    ordenador.encontraMaiorMenor(numeros);
	}

}
