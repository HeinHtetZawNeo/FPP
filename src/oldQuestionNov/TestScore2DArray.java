package oldQuestionNov;

import java.util.Arrays;

public class TestScore2DArray {
	public static void changeTestScores(int[][] the_array) {
		for (int i = 0; i < the_array.length; i++) {
			for (int j = 0; j < the_array[i].length; i++) {
				if (the_array[i][j] >= 85) {
					the_array[i][j] += 4;
				} else {
					the_array[i][j] += 7;
				}
			}
		}

	}

	public static void main(String[] args) {

		int[][] scoreList = new int[][] { { 85, 83, 84, 87 }, { 88, 86, 90, 91 } };
		changeTestScores(scoreList);

		for (int i = 0; i < scoreList.length; i++) {
			for (int j = 0; j < scoreList[i].length; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}// End of main() String
} // Class ends