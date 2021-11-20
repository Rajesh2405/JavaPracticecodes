package week1.day1.assignments;

public class Subjectmarks {

	public static void findGrade(int phy, int chem, int bio, int max, int computer,int div) {
		
		int percentage = phy+chem+bio+max+computer/div;

		if (phy <=0 || phy>100 ||chem <=0 || chem>100 ||bio <=0 || bio>100  ||max <=0 || max>100 ||computer <=0 || computer	>100) {
			System.out.println("Invalid mark percentage");
		}
		else {
			System.out.println(percentage);
		}
			
	}
	
	public static void main(String[] args) {

		Subjectmarks.findGrade(67, 56, 78, 98, 75,(500*100));
		
	}

}
