package day3;

import java.util.*;

public class Lab2A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		System.out.print("Enter String: ");
		String temp = sc.nextLine();
		sb.append(temp);

		// append bye
		sb.append(" bye");

		System.out.println(sb.toString());
	}

}
