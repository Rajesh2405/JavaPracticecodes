package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesCheck {

	public static void main(String[] args) {
		
		System.out.println(parenthesesValidation("{[}]}"));
		
	}
	
	public static boolean parenthesesValidation(String exp) {
		
		List<Character> brackets = new ArrayList<Character>();
		
		for (Character ch : exp.toCharArray()) {
			
			if (ch == '{' || ch == '[') {
				
				brackets.add(0, ch);
			}
			else {
				if (brackets.isEmpty()) {
					return false;
				}
				char temp = brackets.get(0);
				if ((ch == '}' && temp =='{')
					|| (ch == ']' && temp =='[')) {
					
					brackets.remove(0);
				}
				else {
					return false;
				}
			}
		}
		if (!brackets.isEmpty()) {
			return false;
		}
		
		return true;
	}

}
