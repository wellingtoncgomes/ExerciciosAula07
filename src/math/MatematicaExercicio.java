package math;

import java.util.Arrays;

public class MatematicaExercicio {
	public double geraNumeroAleatorio() {
		return Math.random() * 100;
	}
	
	public double calculoHipotenusa(double cateto, double catetoDois) {
		return Math.pow(cateto, 2) + Math.pow(catetoDois, 2);
	}
	
	public int maiorValor(int array[]) {
		Arrays.sort(array);
		
		return array[array.length - 1];
	}
	
	public int maiorValorDois(int array[]) {
		int maior = 0;
		int tam=array.length;
		for(int i=0;i <tam/2;i++) {
			if(maior< Math.max(array[i],array[tam-1])) {
			maior = Math.max(array[i],array[tam-1]);
		}
			tam--;
		}
		return maior;
	}
	
}
