package day7;

public class Merge {
	public static void main(String[] args) {
		//Merge m = new Merge();
		//System.out.println(m.merge(new int[]{1,2,3,4},new int[]{5,6,7,8}));
		
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {1,2,3,4,5};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(int i:c) {
			System.out.println(i);
		}
		
	}
	public int[] merge(int[] arr1, int[] arr2) {
		if (arr1 == null)
			return arr2;
		if (arr2 == null)
			return arr1;
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] retVal = new int[len1 + len2];

		return recursiveMerge(retVal, 0, arr1, arr2);
	}

	public int[] recursiveMerge(int[] returnVal, int nextAvailPos, int[] first, int[] second) {
		if (first.length == 0) {
			System.arraycopy(second, 0, returnVal, nextAvailPos, second.length);
		}
		if (second.length == 0) {
			System.arraycopy(first, 0, returnVal, nextAvailPos, first.length);
		}

		if (first[0] <= second[0]) {
			returnVal[nextAvailPos] = first[0];
			return recursiveMerge(returnVal, nextAvailPos + 1, remove0th(first), second);
		} else {
			returnVal[nextAvailPos] = second[0];
			return recursiveMerge(returnVal, nextAvailPos + 1, first, remove0th(second));
		}
	}

	public int[] remove0th(int[] arr) {
		int[] temp = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			temp[i - 1] = arr[i];
		}
		return temp;
	}

}
