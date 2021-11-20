package coreJava;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {

		String str = "I am 29 and my wife is 26";
		String pattern = "[\\d]+";
		
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		
		
		int sum = 0;
		while (matcher.find()) {
		
		 sum = sum + Integer.parseInt(matcher.group());
		
		}
		
		System.out.println(sum);


	}
}
