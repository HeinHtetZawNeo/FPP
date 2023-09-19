package day12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentStacks1 {

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
		while(myIterator.hasNext()) {
			System.out.print(myIterator.next());
		}
	}

}