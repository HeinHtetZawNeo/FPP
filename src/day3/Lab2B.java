package day3;

import java.util.*;

public class Lab2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		StringBuffer input = new StringBuffer(sc.nextLine());

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				input.setCharAt(i, Character.toUpperCase(input.charAt(i)));

			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				input.setCharAt(i, Character.toLowerCase(input.charAt(i)));
			}
		}

		System.out.print(input.toString());

	}

}
