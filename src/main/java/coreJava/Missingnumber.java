package coreJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Missingnumber {

	static int a[] = { 1, 2, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		
		sumall();
		eachvaluesubtraction();
		

	}

	public static void sumall() {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}

		int n = a.length + 1;

		n = n * (n + 1) / 2;

		System.out.println("Missing number from 'sumall' method :" + (n - sum));

	}

	public static void eachvaluesubtraction() {

		int n = a.length + 1;

		int sum = n * (n + 1) / 2;
		
		//int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
		
			sum = sum -a[i];
			
		}

		System.out.println("Missing num from 'eachvaluesubtraction' method :"+sum);
	}
	
	
	
	

}
