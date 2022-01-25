package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	 void test1() {
System.out.println("beforemethod");
	}
	
	@Test
	 void test3() {
System.out.println("Test");
	}
	
	@AfterMethod
	 void test2() {
System.out.println("Aftermethod");
	}

}
