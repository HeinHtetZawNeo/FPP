package day3;

import java.util.Scanner;

public class StarProgramF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int input = Integer.parseInt(sc.nextLine());
		// if input is even, exit
		if (input % 2 == 0)
			return;

		int middle = input / 2;
		int temp = 2;

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 && j == middle) // top row
					System.out.print("*");
				else if (i == input - 1 && j == middle) // last row
					System.out.print("*");
				else if ((i + j) == middle) // top left
					System.out.print("*");
				else if (i > middle && j == i - middle) // left bottom
					System.out.print("*");
				else if (i <= middle && j == i + middle) // right top
					System.out.print("*");
				else if (i > middle && j == input - temp)// right bottom
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if (i > middle)
				temp++;
			System.out.println();
		}
	}

}
