package HashMap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 EstoqueProduto estoque = new EstoqueProduto();
	        
	        estoque.adicionarProduto("Caneta", 10);
	        estoque.adicionarProduto("Caderno", 5);
	        
	        System.out.println("Listando produtos após adição:");
	        estoque.listarProduto("Caneta");
	        estoque.listarProduto("Caderno");
	        
	        estoque.removerProdutos("Caneta", 3);
	        
	        System.out.println("Listando produtos após remoção parcial:");
	        estoque.listarProduto("Caneta");
	        
	        estoque.removerProdutos("Caderno", 5);
	        
	        System.out.println("Listando produtos após remoção total:");
	        estoque.listarProduto("Caderno");
	        
	        System.out.println("Tentando listar um produto inexistente:");
	        estoque.listarProduto("Lápis");
	        estoque.adicionarProduto("Borracha", 15);
	        estoque.removerProdutos("Borracha", 25);
	        System.out.println("Listando todos:");
	        
	        estoque.listarTodosProdutos();
	        
	        System.out.println("======================Contador Palavra===============================");
	        ContadorPalavras contador = new ContadorPalavras();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um texto:");
	        String texto = scanner.nextLine();
	        
	        contador.contarFrequenciaDePalavras(texto);
	        scanner.close();
	        
	        System.out.println("======================Gerenciador de Contato===============================");
	        GerenciadorDeContatos agenda = new GerenciadorDeContatos();
	        
	        agenda.adicionarContato("João", "19991578478");
	        agenda.adicionarContato("Carla","19992356877");
	        agenda.adicionarContato("Antonio", "1999151158");
	        
	        agenda.buscarContato("Carla");
	        
	}

}
