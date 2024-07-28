package stringBuilder;

public class Main {

	public static void main(String[] args) {
		ConstruirString str = new ConstruirString();
        String[] palavras = {"Corinthians", "é", "maior", "do", "Brasil"};
        System.out.println(str.construirString(palavras));
        
        String frase = "Giovana é perfeita";
        System.out.println(str.removerVogais(frase));
        
        String frase2 = "Ontem fui  ";
        String frase3 = "ao restaurante";
        System.out.println(str.inserirString(frase2,frase3,10));
    

	}

}
