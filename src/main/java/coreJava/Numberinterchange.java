package coreJava;

public class Numberinterchange {

	int  a = 150;
	
	int  b = 200;
	
	
	public void wtoutvar() {

		a = a*b; // 150*200 = 3000
		
		b = a/b;// 3000/200 = 150
		
		a = a/b;  // 3000/150 = 200
		
		System.out.println("Value of 'a' changed to "+ a);
		System.out.println("Value of 'b' changed to "+ b);
		
	}
	
	
	public static void main(String[] args) {

		Numberinterchange sobj =new Numberinterchange ();
		
		sobj.wtoutvar();
		
	}

}
