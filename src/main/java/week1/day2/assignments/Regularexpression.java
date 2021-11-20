package week1.day2.assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression {
	
	public static void main(String[] args) {
		
	
	String email = "Beautifulmorning98@gmail.co.india";
	
	String pat = "\\W";
	
	
	//String pat = "[.A-Za-z0-9]+@[a-z]+.[a-z]{2,}.[a-z]+";
	
	Pattern compile = Pattern.compile(pat);
	
	Matcher matcher = compile.matcher(email);
	
	while(matcher.find()) {
		System.out.println(matcher.group());
	}
	

	}
}
