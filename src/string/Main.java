package string;

public class Main {

	public static void main(String[] args) {
		
			String palavra1 = "radar";
			String palavra2 = "paralelepipedo";
			
			System.out.println("\n============= Palindromo ================ ");
	        boolean resultado1 = Palindromo.ehPalindromo(palavra1);
	        boolean resultado2 = Palindromo.ehPalindromo(palavra2);
	        System.out.println("A palavra " + palavra1 + " é um palíndromo? " + resultado1);
	        System.out.println("A palavra " + palavra2 + " é um palíndromo? " + resultado2);
	
	
	        System.out.println("\n============= Contar Vogais ================ ");
	        
	        int contador1 = ContadorVogal.contaVogal(palavra1);
	        int contador2 = ContadorVogal.contaVogal(palavra2);
	        System.out.println("A palavra " + palavra1 + " tem quantas vogais? " + contador1);
	        System.out.println("A palavra " + palavra2 + " tem quantas vogais? " + contador2);
	
	        System.out.println("\n============= Primeira Ocorrência ================ ");
	        
	        int contador3 = PrimeiraOcorrencia.encontraPrimeiraOcorrencia(palavra1, "a");
	        int contador4 = PrimeiraOcorrencia.encontraPrimeiraOcorrencia(palavra2, "e");

	        System.out.println("Na palavra -> " + palavra1 + " -> a primeira ocorrência da letra 'a' é na posição " + contador3);
	        System.out.println("Na palavra -> " + palavra2 + " -> a primeira ocorrência da letra 'e' é na posição " + contador4);
	}

}
