package coreJava;

public class Occurenceofwordcount {

	public static void main(String[] args) {

		String str = "Do good and good will come to you";
		String wrd = "good";
		
		String[] split = str.split(" ");
		
		int count =0;
		
		for (int i = 0; i <split.length; i++) {
			
			if (wrd.equals(split[i])) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Number of occurence of the "+wrd+" :"+count);
		
		
	}

}
