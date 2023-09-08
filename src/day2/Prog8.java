package day2;

import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Type in a string: ");
		String temp = sc.nextLine();

		for (int length = 0; length <= temp.length(); length++) {
			System.out.println("Substrings of length " + length);
			if (length == 0)
				System.out.println("[]");
			else {
				for (int startIndex = 0; temp.length() >= startIndex + length; startIndex++) {
					System.out.println("[" + temp.substring(startIndex, startIndex + length) + "]");
				}
			}
		}

	}

}
