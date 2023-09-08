package day3;

import java.util.Scanner;

public class StarProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int input = Integer.parseInt(sc.nextLine());
		int j = 0;
		for (int i = 0; i < input; i++) {
			if (i == 0)
				System.out.println("*");
			else if (i == input - 1) {
				for (int k = 0; k < input; k++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
				j++;
			}

		}

	}

}
