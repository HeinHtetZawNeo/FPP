package day12;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentStacks2B {
	/*
	 * 
	 */
	public static void main(String[] args) {
		String tempString = "(a + b[(x+y)] + 10)";
		System.out.println(myCompiler(tempString) == true);

		tempString = "(a + b[(x+y)] + 10))";
		System.out.println(myCompiler(tempString) == false);

		tempString = "(a + b[(x+y)] + 10) // test)";
		System.out.println(myCompiler(tempString) == true);

		tempString = "(a + b[(x+y)] + 10) // \"test)\"";
		System.out.println(myCompiler(tempString) == true);

		tempString = "(a + b[(x+y)] + 10) // test\"\" comment \n (A+B";
		System.out.println(myCompiler(tempString) == false);

		tempString = "(a + b[(x+y)] + 10) // test\"\" comment \n (A+B)";
		System.out.println(myCompiler(tempString) == true);

		tempString = "(a + b[(x+y)] + 10) /* Testing )))) ";
		System.out.println(myCompiler(tempString) == true);

		tempString = "(a + b[(x+y)] + 10) /* Testing )))*/) ";
		System.out.println(myCompiler(tempString) == false);
	}

	public static boolean myCompiler(String s) {
		char[] charList = s.toCharArray();
		LinkedList<Character> charLinkedList = new LinkedList<Character>();

		boolean singleComment = false;
		boolean multiComment = false;
		boolean inString = false;

		String tempStr = "";

		for (char c : charList) {
			if ((!singleComment) && (!multiComment) && (!inString)) { // When Ignore is false
				switch (c) {
				case '(':
				case '[':
				case '{':
					charLinkedList.push(c);
					tempStr = "";
					break;
				case ')':
					if (charLinkedList.size() > 0) {
						if (charLinkedList.pop() != '(')
							return false;
					} else {
						return false;
					}
					tempStr = "";
					break;
				case ']':
					if (charLinkedList.pop() != '[')
						return false;
					tempStr = "";
					break;
				case '}':
					if (charLinkedList.pop() != '{')
						return false;
					tempStr = "";
					break;
				case '/':
					if (tempStr.equals("/")) {
						singleComment = true;
						tempStr = "";
					} else
						tempStr = "/";
					break;
				case '*':
					if (tempStr.equals("/")) {
						multiComment = true;
					}
					tempStr = "";
					break;
				case '\"':
					inString = true;
					break;
				default:
					tempStr = "";
					break;
				}
			} else { // When ignore is true
				switch (c) {
				case '\n':
					singleComment = false;
					break;
				case '\"':
					inString = false;
					break;
				case '*':
					tempStr = "*";
					break;
				case '/':
					if (tempStr.equals("*"))
						multiComment = false;
				default:
					tempStr = "";
					break;
				}
			}
		}
		if (charLinkedList.size() != 0)
			return false;
		return true;
	}

}
