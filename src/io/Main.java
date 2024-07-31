package io;

public class Main {

	public static void main(String[] args) {
       
        String nomeDoArquivo = "C:\\Users\\Wellington\\Documents\\ler.txt";
        
        LeitorArquivo leitor = new LeitorArquivo();

        leitor.lerEImprimir(nomeDoArquivo);
        
        System.out.println("======================Copiar Arquivo===============================");
        Copiadora copiadora = new Copiadora();
        copiadora.copiar("C:\\Users\\Wellington\\Documents\\ler.txt", "C:\\Users\\Wellington\\Documents\\ler2.txt");

        System.out.println("======================Copiar Arquivo===============================");
        String[] arrayDeStrings = {
                "Aula 07",
                "Linguagem JAVA",
                "LP3",
                "Quarta feira"
            };
            GravadorArquivo gravador = new GravadorArquivo();
            
            gravador.gravar("C:\\Users\\Wellington\\Documents\\teste.txt", arrayDeStrings);
	
	}
}