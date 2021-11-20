package week1.day2;

public class Isnumbervalid {
	
	
	
	public static boolean isValidnumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("This is a valid num "+ number);
			
		} catch (Exception e) {
			
			System.out.println("This is not a valid num "+ number);
			
			return false;
		
		}
		return true;
		
	}
	
	public static boolean isValidphnum(String number) {

		if(number.length()==10 && isValidnumber(number)) {
			
			System.out.println("This is a valid phn number "+number);
			
			return true;
			
		}
		System.out.println("This is not valid phn number "+number);
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isValidnumber("12344"));
		System.out.println(isValidnumber("1231214w"));
		System.out.println(isValidphnum("9292929292"));
		System.out.println(isValidphnum("9292929"));

		
	}

}
