package day12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentStacks11B {
	public static void main(String[] args) {
		LinkedList<Integer> intList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int temp;
		while(true) {
			System.out.println("Enter some integers for me to reverse (Enter -1 to quit):");
			temp = Integer.parseInt(sc.nextLine());
			if(temp != -1)
				intList.push(temp);
			else
				break;
		}
		
		//Print
		Iterator<Integer> myIterator = intList.iterator();
		if(myIterator.hasNext())
			System.out.print(myIterator.next());
		while(myIterator.hasNext()) {
			Integer tempInt =0;
			tempInt = myIterator.next();
			if(myIterator.hasNext()) {
				System.out.print(", "+tempInt);
			}else {
				System.out.print(" and "+tempInt);
			}
		}
	}
}
