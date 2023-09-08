package day3;

import java.util.*;

public class StarProblemC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Odd Number: ");
		int input = Integer.parseInt(sc.nextLine());
		// if input is even, exit
		if (input % 2 == 0)
			return;

		int middle = input / 2;

		for (int i = 0; i < middle + 1; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 && j == middle) {
					// first line
					System.out.print("*");
				} else if (i == middle) {
					System.out.print("*");
				} else if (j == middle - i || j == middle + i) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
