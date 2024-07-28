package date;

import java.util.Calendar;
import java.util.Date;

public class DataCalendario{
	
	
	public long calculaDiferencaDias(Date data1, Date data2) {
        long diferencaMilisegundo = data2.getTime() - data1.getTime();
        return diferencaMilisegundo / (1000 * 60 * 60 * 24);
	}
	
	
	 public Date somarDias(Date data, int dias) {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(data);
	        cal.add(Calendar.DAY_OF_MONTH, dias);
	        return cal.getTime();
	   }
	
	 public void comparaDatas(Date data1,Date data2) {
		 
		 if (calculaDiferencaDias(data1,data2)>0) {
	            System.out.println("A primeira data é antes da segunda.");
	        } else if (calculaDiferencaDias(data1,data2)<0) {
	            System.out.println("A primeira data é depois da segunda.");
	        } else {
	            System.out.println("As datas são iguais.");
	        }
		 
	 }
	
}
