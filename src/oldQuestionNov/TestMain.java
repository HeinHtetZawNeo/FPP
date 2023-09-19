package oldQuestionNov;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		//Question 2
		System.out.println(How_Many_Digit("Hello1234567890asfkjlasjdfl;kjasdl;fjas;dlkjfl;")==10);
		System.out.println(How_Many_Digit("Hello123")==3);
		System.out.println(How_Many_Digit("Hello123 33")==5);
		
		//Question 3
		int[][] scoreList = new int[][] {{80,70,60},{85,86,90}};
		chargeTestScore(scoreList);
		for(int i=0;i<scoreList.length;i++) {
			for(int j:scoreList[i]) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//question 4
		int[][] allEven = new int[][] {{80,70,60},{90,86,90}};
		int[][] allEvenAndOdd = new int[][] {{80,71,60},{90,86,90}};
		System.out.println(allEven(allEven)==true);
		System.out.println(allEven(allEvenAndOdd)==false);
		
		//question 5
		System.out.println(myEndsWith("abcde","de")==true);
		System.out.println(myEndsWith("abcde","d")==false);
		
		//question 5
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("K");
		arr1.add("OK");
		arr1.add("OK1");
		arr1.add("OK12");
		System.out.println(returnStringWithShortestLength(arr1)=="K");
	}

	public static int How_Many_Digit(String st) {
		char[] charList = st.toCharArray();
		int count =0;
		for(char temp:charList) {
			if(temp >='0' && temp <= '9') {
				count++;
			}
		}
		return count;
	}
	
	public static void chargeTestScore(int[][] the_array) {
		for(int i=0;i<the_array.length;i++) {
			for(int j=0;j<the_array[i].length;j++) {
				if(the_array[i][j]>=85)
					the_array[i][j]+=4;
				else
					the_array[i][j]+=7;
			}
		}
	}
	
	public static boolean allEven(int[][] array1) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				if(array1[i][j]%2==1) return false;
			}
		}
		return true;
	}
	
	public static boolean myEndsWith(String s1,String s2) {
		if(s1.length() <=0) return false;
		if(s2.length() <=0) return true;
		
		char[] s1CharList = s1.toCharArray();
		char[] s2CharList = s2.toCharArray();
		
		for(int i=0;i<s2CharList.length;i++) {
			if(s2CharList[s2CharList.length-i-1] != s1CharList[s1CharList.length-i-1]) 
				return false;
		}
		
		return true;
	}
	
	public static String returnStringWithShortestLength(ArrayList<String> arr) {
		int ShortestIndex = 0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).length() < arr.get(ShortestIndex).length()) {
				ShortestIndex = i;
			}
		}
		return arr.get(ShortestIndex);
	}
}
