package coreJava;

public class ExecutionOrder {
	
	 static {
		System.out.println("Static sample");
	}
	
	
	public void Demo() {
		System.out.println("Instance method");
	}
	
	public  ExecutionOrder() {
		System.out.println("inside constructor");
	}
	
	
	public static void main(String[] args) {
		
		new ExecutionOrder().Demo();
	
	}
	

}


