package coreJava;

public class AlphabeticPattern {

	public static void main(String[] args) {

		int n = 6;

		int alpha = 65;

		for (int i = 0; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {

				System.out.print((char) alpha + " ");
			}
			
			alpha++;

			System.out.println();
		}

	}

}
