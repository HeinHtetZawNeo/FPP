package day3;

public class ProgrammingAssignment2 {

	public static void main(String[] args) {
		System.out.println(avg(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 }));
		System.out.println(avg(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, Integer.MIN_VALUE }));
		System.out.println(avg(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, Integer.MAX_VALUE, -30 }));
		System.out.println(avg(new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 3 }));
	}

	public static int avg(int[] arrayOfInts) {
		int totalSum = 0;
		for (int temp : arrayOfInts) {
			totalSum += temp;
		}
		return totalSum / arrayOfInts.length;
	}

}
