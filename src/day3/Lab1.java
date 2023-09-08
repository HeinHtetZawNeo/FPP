package day3;

import java.util.*;;
public class Lab1 {

	/*
	 * Write an application that determines if an input word is a palindrome.  A palindrome is a string
	 * that reads the same forward and backward, for example, noon  and  madam.
	 * Ignore the case of the letter.   (Definitely do for the midterm.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String");
		String input = sc.nextLine();
		System.out.println("@"+input+"@");
		for(int i=0, j=input.length()-1;i<input.length()/2;i++,j--) {
			if(input.charAt(i)!=input.charAt(j)) {
				System.out.print("this is not palindrome");
				return;
			}
		}
		System.out.print("This is palindrome");
	}

}
