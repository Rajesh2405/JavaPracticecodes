package week1.day1;

import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 5, 5, 6, 8, 9, 2, 6, 8, 9, 10 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] != a[j]) {

					System.out.print(a[i]);
				}
			
			}
		}
		}

	}

