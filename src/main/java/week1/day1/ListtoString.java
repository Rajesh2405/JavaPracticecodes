package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class ListtoString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("rajesh");

		list.add("kumar");

		System.out.println(list);

		String[] array = list.toArray(new String[list.size()]);

		for (String string : array) {

			System.out.println(string);

		}

		// Finding unique number and printing duplicate with their occurence
		int arr[] = { 4, 3, 4, 5, 6, 4, 5, 7, 8, 7, 9, 3, 9 };

		ArrayList<Integer> newarr = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			int k = 0;
			
			if (!newarr.contains(arr[i])) {

				newarr.add(arr[i]);

				k++;
			
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					k++;
				}
			}
		//System.out.println(arr[i]);
			System.out.println(k);
			if (k==1) {
				System.out.println(arr[i]+" is a unique number");
			}
		}


	}
	}
}
