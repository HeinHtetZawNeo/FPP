package day3;

public class ProgrammingAssignment4 {

	public static void main(String[] args) {
		double[][] balances = new double[3][6];

		// Fill up the Array
		for (int i = 0; i < balances.length; i++) {
			for (int j = 0; j < balances[i].length; j++) {
				if (i == 0) {
					// first row
					balances[i][j] = 10000;
				} else {
					// other rows
					balances[i][j] = balances[i - 1][j] + (balances[i - 1][j] * (double) (10 + j) / 100);
				}

				System.out.print(" | " + balances[i][j] + " | ");
			}
			System.out.println();
		}

		double[] colTotal = new double[balances[0].length];
		double rowTotal = 0;

		// calculate Avgs
		for (int i = 0; i < balances.length; i++) {
			rowTotal = 0;

			for (int j = 0; j < balances[i].length; j++) {
				rowTotal += balances[i][j];
				colTotal[j] += balances[i][j];
			}

			System.out.printf("Row No.%d AVG is %.2f \n", i + 1, (double) rowTotal / balances[i].length);
		}

		// print out Column Avg
		for (int i = 0; i < colTotal.length; i++) {
			System.out.printf("Columns No.%d AVG is %.2f \n", i + 1, colTotal[i] / balances.length);
		}
	}

}
