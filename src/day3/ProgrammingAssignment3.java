package day3;

import java.util.Scanner;

public class ProgrammingAssignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		StringBuffer input = new StringBuffer(sc.nextLine());
		
		readAndChange(input);
	}
	public static void readAndChange(StringBuffer input) {
		for(int i=0;i<input.length();i++) {
			
			char inputChar = input.charAt(i);
			if(Character.isLowerCase(inputChar)) {
				input.setCharAt(i, Character.toUpperCase(inputChar));
				
			}
			else if(Character.isUpperCase(inputChar)) {
				input.setCharAt(i, Character.toLowerCase(inputChar));
			}
		}
		
		System.out.print(input.toString());
	}

}
