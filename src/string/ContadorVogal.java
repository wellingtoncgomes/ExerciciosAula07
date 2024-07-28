package string;

public class ContadorVogal {
	 public static int contaVogal(String palavra) {
		 int contador = 0;
		 String vogais = "aeiouAEIOU";
		 
		for(int i = 0;i < palavra.length();i++ ) {
			if(vogais.indexOf(palavra.charAt(i)) != -1){
				contador++;
			}
			
		}
		return contador;
	 }
}
