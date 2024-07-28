package string;

public class Palindromo {
	
    public static boolean ehPalindromo(String palavra) {
        int tam = palavra.length();
        for (int i = 0; i < tam / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tam - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
