package day12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentQueue1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tempInput = "";
		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();
		
		
		System.out.println("Enter something for Stack:");
		tempInput = sc.nextLine();
		char[] tempCharList = tempInput.toCharArray();
		for(char c: tempCharList) {
			stack.push(c);
		}
		
		moveStackToQueue(stack,queue);
		
		moveQueueToStack(stack, queue);
		
		while(stack.size()>0) {
			System.out.print(stack.pop());
		}
	}
	
	public static void moveStackToQueue(LinkedList<Character> stack, LinkedList<Character> queue) {
		while(stack.size()>0) {
			queue.add(stack.pop());
		}
	}
	
	public static void moveQueueToStack(LinkedList<Character> stack, LinkedList<Character> queue) {
		while(queue.size()>0) {
			stack.push(queue.remove());
		}
	}
	
}
