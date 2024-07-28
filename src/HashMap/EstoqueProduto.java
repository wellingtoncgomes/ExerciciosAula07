package HashMap;

import java.util.HashMap;

public class EstoqueProduto {
	HashMap<String, Integer> estoque= new HashMap<>();
	
	public void adicionarProduto(String produto,int quantidade) {
		estoque.put(produto, quantidade);
	}
	
	public void removerProdutos(String produto,int quantidade) {
		estoque.remove(produto);
	}
	
	public void listarProduto(String produto) {
           if (estoque.containsKey(produto)) {
               System.out.println("Quantidade de " + produto + ": " + estoque.get(produto));
           } else {
               System.out.println("Produto não encontrado.");
           }
	}
	
}
