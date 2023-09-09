package day5;

//Java program to swap two numbers

import java.io.*;

class GFG {
		public void change(Integer number) {
		  number = 10;
		  System.out.println(number); // Prints 10
		}

		public static void main(String[] args) {
			GFG g = new GFG();
		  Integer myNumber = new Integer(5);
		  System.out.println("old"+myNumber); // Prints 10
		  myNumber = 12;
		  g.change(myNumber);
		  
		  System.out.println("new"+myNumber); // Prints 10
		}
}
