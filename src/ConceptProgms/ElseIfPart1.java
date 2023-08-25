package ConceptProgms;

import java.util.Scanner;
 class ElseIfPart1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans="";
		if(num%2==1) {
			
			ans="Weired";
		}
		else {
			
			if(num>=6 && num<=20) {
				
				ans="Weired";
			}
			else {
				
		    ans="Not Weired";
			
			
		}
		
		
	}
		System.out.println(ans);

	}}
