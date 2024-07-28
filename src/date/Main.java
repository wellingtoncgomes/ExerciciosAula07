package date;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
			DataCalendario data = new DataCalendario();
		
		 	Calendar cal1 = Calendar.getInstance();
	        cal1.set(2024, Calendar.JUNE, 15);
	        Date data1 = cal1.getTime();

	        Calendar cal2 = Calendar.getInstance();
	        cal2.set(2024, Calendar.JULY, 10);
	        Date data2 = cal2.getTime();

	        long diferencaDias = data.calculaDiferencaDias(data1, data2);
	        System.out.println("Diferença em dias: " + diferencaDias);
	        
	        data.comparaDatas(data1, data2);
	        data.comparaDatas(data2, data1);
	        
	        System.out.println("Somando dias a data 1: " + data.somarDias(data1,25));
	        data1 = data.somarDias(data1,25);
	      
	        data.comparaDatas(data1, data2);
	        
	}

}
