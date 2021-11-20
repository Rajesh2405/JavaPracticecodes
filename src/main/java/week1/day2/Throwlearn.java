package week1.day2;

public class Throwlearn {

public int div(int a, int b) throws Exception {

	int x = 0;
	
	if (a<b) {
		throw new Exception("smaller num cannot divised by larger number");
	}
	
	else {
		x = a/b;
	}
	
	return x;
	
}

public static void main(String[] args) throws Exception {
	Throwlearn obj = new Throwlearn();
	
			int di;
			try {
				di = obj.div(5, 10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		//System.out.println(di);
		System.out.println("end");
	}
}

