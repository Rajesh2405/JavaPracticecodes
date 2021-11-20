package week1.day1.assignments;

public class Squarecalc {

	
	public int square(int a) {

		int sq = a*a;
		
		return sq;
	}
	
	public void sum(int a, int b) {

		int sqadd = a+b;
		
		System.out.println(sqadd);
		
	}
	
	public static void main(String[] args) {
		
		Squarecalc obj = new Squarecalc();
		
		int v1 = obj.square(5);
		int v2 = obj.square(5);
		
		obj.sum(v1, v2);
	}
	
}
