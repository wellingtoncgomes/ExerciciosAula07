package stringBuilder;

public class ConstruirString {
	StringBuilder sb = new StringBuilder();
   
	public String construirString(String[] palavras) {
		sb = new StringBuilder();
		for (String palavra :palavras) {
            sb.append(palavra).append(" ");
        }
        return sb.toString().trim();
    }

    
    public String removerVogais(String palavra) {
		String vogais = "aeiouAEIOU";
		sb = new StringBuilder();
		for(int i = 0;i < palavra.length();i++ ) {
			if(vogais.indexOf(palavra.charAt(i)) == -1){
				sb.append(palavra.charAt(i));
			}
			
		}
		return sb.toString();
    }
    
    public String inserirString(String inicial, String adicional,int indice ) {
    	sb = new StringBuilder(inicial);
    	sb.insert(indice,adicional);
    	return sb.toString();
}

}