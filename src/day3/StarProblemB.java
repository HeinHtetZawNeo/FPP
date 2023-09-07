package day3;

import java.util.Scanner;

public class StarProblemB {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int input = Integer.parseInt(sc.nextLine());
		int k=input-1;
		
		
		for(int i=0;i<input;i++) {
			for(int j=0;j<input;j++) {
				if(i<input-1) {
					if(j<input-1) {
						if(i!=0) {
							if(j==k)
								System.out.print("*");
							else
								System.out.print(" ");
						}else {
							//first row
							System.out.print(" ");
						}
					}else {
						//last column
						System.out.print("*");
					}
				}else {
					//last row
					System.out.print("*");	
				}
			}
			k--;
			System.out.print("\n");
		}
	}

}
