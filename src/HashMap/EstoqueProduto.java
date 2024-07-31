package HashMap;

import java.util.HashMap;

public class EstoqueProduto {
    HashMap<String, Integer> estoque = new HashMap<>();
    
   
    public void adicionarProduto(String produto, int quantidade) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) + quantidade);
    }
    
   
    public void removerProdutos(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            int currentQuantity = estoque.get(produto);
            if (quantidade >= currentQuantity) {
                estoque.remove(produto);
            } else {
                estoque.put(produto, currentQuantity - quantidade);
            }
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
    
    public void listarProduto(String produto) {
        if (estoque.containsKey(produto)) {
            System.out.println("Quantidade de " + produto + ": " + estoque.get(produto));
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public void listarTodosProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (String produto : estoque.keySet()) {
                System.out.println(produto + ": " + estoque.get(produto));
            }
        }
    }
}