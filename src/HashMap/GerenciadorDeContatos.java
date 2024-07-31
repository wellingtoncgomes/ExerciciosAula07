package HashMap;

import java.util.HashMap;

public class GerenciadorDeContatos {
	private HashMap<String, String> contatos;

    public GerenciadorDeContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome.toLowerCase(), telefone);
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
    }

    public void buscarContato(String nome) {
        String telefone = contatos.get(nome.toLowerCase());
        if (telefone != null) {
            System.out.println("Telefone de " + nome + ": " + telefone);
        } else {
            System.out.println("Contato não encontrado para o nome: " + nome);
        }
    }


}
