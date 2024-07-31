package HashMap;

import java.util.HashMap;

public class ContadorPalavras {
	
	 public void contarFrequenciaDePalavras(String texto) {
	        String[] palavras = texto.split("\\s+");
	        HashMap<String, Integer> contadorDePalavras = new HashMap<>();
	        
	        for (String palavra : palavras) {
	            palavra = palavra.toLowerCase();
	            if (contadorDePalavras.containsKey(palavra)) {
	                contadorDePalavras.put(palavra, contadorDePalavras.get(palavra) + 1);
	            } else {
	                contadorDePalavras.put(palavra, 1);
	            }
	        }
	        
	        System.out.println("Frequência das palavras:");
	        for (String palavra : contadorDePalavras.keySet()) {
	            System.out.println(palavra + ": " + contadorDePalavras.get(palavra));
	        }
	        
	       
	    }
}
