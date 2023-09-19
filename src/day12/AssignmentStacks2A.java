package day12;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentStacks2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an input");
		String tempString = sc.nextLine();
		
		char[] charList = tempString.toCharArray();
		LinkedList<Character> charLinkedList = new LinkedList<Character>();
		
		for(char c: charList) {
			switch (c) {
			case '(':
			case '[':
			case '{':	
				charLinkedList.push(c);
				break;
			case ')':
				if(charLinkedList.pop() != '(')
					System.out.println("ERROR");
				break;
			case ']':
				if(charLinkedList.pop() != '[')
					System.out.println("ERROR");
				break;
			case '}':
				if(charLinkedList.pop() != '{')
					System.out.println("ERROR");
				break;
			}
		}
		if(charLinkedList.size()!=0) 
			System.out.print("ERROR");
	}
}
