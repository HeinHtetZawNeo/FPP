package day3;

import java.util.Scanner;

public class StarProblemD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<(input*2)-1;i++) {
			for(int j=0;j<input;j++) {
				if(j==0) {	//first column
					System.out.print("*");
				}
				else if(i==input-1 && j==input-1) { //middle row, last column
					System.out.print("*");
				}
				else if(i==j) {
					System.out.print("*");
				}
				else if(i>=input && (i+j)==(input*2)-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
