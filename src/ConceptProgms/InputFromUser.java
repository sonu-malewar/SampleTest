package ConceptProgms;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <= 3; i++) {
			String c = sc.next();
			int a = sc.nextInt();
			
			
			System.out.printf("%-15s%03d\n",c,a);
			
			
		}
		
		sc.close();
		
		
	}

}
