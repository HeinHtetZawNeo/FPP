package day2;

import java.util.Scanner;

public class Prog5 {

	/*
	 * Write a program (called Prog5) that asks the user to input a String. The
	 * output is the characters of this String in reverse order. (For example, if
	 * the input string is "Hello", the output string would be "olleH".) (Definitely
	 * do for the midterm.)
	 * 
	 * Output the number of ‘x’s in the string from the user. For example if the
	 * user types in “Exit abc exit”, then the output would be “2 ‘x’ characters
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an input string: ");
		String input = sc.nextLine();

		char[] charArray = input.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--)
			System.out.print(charArray[i]);
		System.out.println();
		System.out.print("Enter another input string to count x: ");
		String input2 = sc.nextLine();
		int xCount = 0;
		charArray = input2.toCharArray();

		for (char temp : charArray) {
			if (temp == 'x')
				xCount++;
		}
		System.out.println(xCount + " ‘x’ characters");

	}

}
