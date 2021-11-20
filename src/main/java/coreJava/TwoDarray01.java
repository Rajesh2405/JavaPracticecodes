package coreJava;

public class TwoDarray01 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 6, 2, 3 } };

		int a1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 6, 2, 3 } };

		int a3[][] = new int[a.length][a[0].length];

		// Actual matrix
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				a3[i][j] = a[i][j] + a1[i][j];
				System.out.print(a3[i][j] + " ");

			}

			System.out.println();

		}
		System.out.println("**********************");

		// Transpose matrix
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				a3[i][j] = a[i][j] + a1[i][j];
				System.out.print(a3[j][i] + " ");

			}

			System.out.println();

		}
	}

}
