package week1.day1.assignments;

public class Findmonthdays {
	
	private void checkMonthdays(int a) {

		if (a<=0  || a>12) {
			System.out.println("invalid month");
		}
		else if (a==2) {
			System.out.println("Month days 28");
		}
			else if (a ==4 || a==6 || a== 9 || a==11) {
			System.out.println("Month days 30");	
			}
			else {
				System.out.println("Month days 31");
			}
		}


	public static void main(String[] args) {

		Findmonthdays days = new Findmonthdays();
		
		days.checkMonthdays(8);
		
	}

}
