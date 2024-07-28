package arrayList;

import java.util.ArrayList;

public class ListaTarefa {
	ArrayList<String> listaTarefas = new ArrayList<>();
	
	public void adicionaTarefa(String tarefa) {
		listaTarefas.add(tarefa);
	}
	
	public void removerTarefas(String tarefa) {
		listaTarefas.remove(tarefa);
	}
	
	public void mostrarListaTarefa() {
		for(String tarefa:listaTarefas) {
			System.out.println(tarefa);
		}
	}

}
