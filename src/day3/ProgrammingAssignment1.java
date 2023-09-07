package day3;

public class ProgrammingAssignment1 {

	public static void main(String[] args) {
		System.out.println(min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
		System.out.println(min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, Integer.MIN_VALUE}));
		System.out.println(min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, Integer.MAX_VALUE, -30}));
	}

	public static int min(int[] arrayOfInts) {
		int result = arrayOfInts[0];
		for(int temp:arrayOfInts) {
			if(result>temp)
				result = temp;
		}
		return result;
	}
}
