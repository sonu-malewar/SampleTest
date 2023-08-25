package ConceptProgms;

import java.util.Scanner;

public class LoopsPart1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result;
		
		
		for (int i = 1; i<=10; i++) {
			
			result = num*i;
			
			System.out.printf("%d X %d = %d \n",num,i,result);
			
		}
	}

}
