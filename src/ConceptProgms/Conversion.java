package ConceptProgms;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Conversion {
	
	




	public static String getDayOfWeek(String year,String month,String day) {
		
		int d = Integer.parseInt(day);
		int m = Integer.parseInt(day);
		int y = Integer.parseInt(day);
		
		LocalDate lt = LocalDate.of(y,m,d);
		
		return lt.getDayOfWeek().name();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day =sc.next();
		String month =sc.next();
		String year =sc.next();
	
		
		System.out.println(getDayOfWeek(year,month,day));
	
		
		

}
}