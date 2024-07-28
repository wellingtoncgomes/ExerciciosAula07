package math;

public class Main {

	public static void main(String[] args) {
		MatematicaExercicio mat = new MatematicaExercicio();
		int[] arr = { 5, -2, 23, 509, 87, -42, 7};
		
		System.out.println(mat.geraNumeroAleatorio());
		System.out.println(mat.calculoHipotenusa(10, 7));
	 	System.out.println(mat.maiorValor(arr));
	 	System.out.println(mat.maiorValorDois(arr));
	}
}
