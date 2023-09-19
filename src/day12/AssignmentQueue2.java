package day12;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentQueue2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		char[] inputCharList;
		
		System.out.println("Enter Input:");
		inputString = sc.nextLine();
		inputCharList = inputString.toCharArray();
		
		boolean foundColon = false;
		
		LinkedList<Character> leftSideQueue = new LinkedList<Character>();
		LinkedList<Character> rightSideQueue = new LinkedList<Character>();
		for(char c: inputCharList) {
			if(c==':') {
				foundColon = true;
			}else {
				if(foundColon) { //right side
					rightSideQueue.add(c);
				}else { //left side
					leftSideQueue.add(c);
				}	
			}
		}
		if(!foundColon) {
			System.out.println("N");
			return;
		}
		if(leftSideQueue.size()>rightSideQueue.size()){
			System.out.println("L");
			return;
		}
		if(leftSideQueue.size()<rightSideQueue.size()){
			System.out.println("R");
			return;
		}
		
		while(leftSideQueue.size()>0) {
			char left = leftSideQueue.remove();
			char right = rightSideQueue.remove();
			if(left != right) {
				System.out.println("D");
				return;
			}	
		}
		System.out.println("S");
		return;
	}

}
