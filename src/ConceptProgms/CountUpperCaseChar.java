package ConceptProgms;

import java.text.Format;

public class CountUpperCaseChar {
	
	public static void toFindUppercaseChar(String input) {
		Boolean flag=false;
		int totalChar =input.length();
		int upperCase=0;
		int lowerCase=0;
		for (int i = 0; i < input.length(); i++) {
			
			if(Character.isUpperCase(input.charAt(i))){
				upperCase++;
				
			}
			else {
				lowerCase++;
			}
			
		}
		System.out.println(upperCase);
		
		
	
	}
	
	public static void main(String[] args) {
		
		toFindUppercaseChar("LearNong123");
		
	}

}
