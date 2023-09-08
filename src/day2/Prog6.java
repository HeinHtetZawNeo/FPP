package day2;

import java.util.*;

public class Prog6 {

	/*
	 * Write a program (called Prog6) that accepts String arguments (stored in args)
	 * from the main method, removes all duplicates, and outputs these arguments
	 * (without duplicates) in a comma-separated format. For example, if the input
	 * into the main method is ["horse", "dog", "cat", "horse","dog"] then the
	 * output would be "horse","dog","cat"
	 * 
	 * Typical output: Original list: [ horse dog cat horse dog horse cat horse ]
	 * List without duplicates: [ horse dog cat ]
	 * 
	 * Hint : Consider using a local variable!
	 */
	public static void main(String[] args) {
		List<String> result = new ArrayList<String>();
		boolean add;

		for (String temp : args) {

			add = true;

			for (String anotherTemp : result) {
				if (anotherTemp.trim().equals(temp.trim())) {
					add = false;
					break;
				}
			}

			if (add)
				result.add(temp);
		}
		/*
		 * for(String temp:result) System.out.print(temp+" ");
		 */

		for (int i = 0; i < result.size(); i++) {
			if (i == 0) {
				System.out.print(result.get(i));
			} else {
				System.out.print("," + result.get(i));
			}
		}
	}

}
