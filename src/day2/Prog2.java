package day2;

public class Prog2 {

	/*
	 * Create a class Prog2. Inside its main method, create float variables to store
	 * each of the following numbers: 1.27, 3.881, 9.6 Output to the console the
	 * following two values: a. the sum of the floats as an integer, obtained by
	 * casting the sum to type int b. the sum of the floats as an integer, obtained
	 * by rounding the sum to the nearest integer, using the Math.round function
	 */
	public static void main(String[] args) {
		float f1 = 1.27f;
		float f2 = 3.881f;
		float f3 = 9.6f;

		int resultInt = (int) (f1 + f2 + f3);
		System.out.println(resultInt);

		int resultRound = Math.round(f1 + f2 + f3);
		System.out.println(resultRound);
	}

}
