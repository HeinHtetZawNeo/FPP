package day3;

import java.util.Scanner;

public class StarProblemE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int input = Integer.parseInt(sc.nextLine());
		
		
		int temp = 1;
		
		for(int i=0;i<(input*2)-1;i++) {
			for(int j=0;j<input;j++) {
				if(j==input-1)
					System.out.print("*");
				else if((i+j)==input-1)
					System.out.print("*");
				else if(i>=input && j==temp) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i>=input)
				temp++;
			System.out.println();
		}
	}

}
