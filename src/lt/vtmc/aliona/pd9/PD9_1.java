package lt.vtmc.aliona.pd9;

import java.util.Stack;

public class PD9_1 {

	
	public static String reverse (String str) {
		if (str == null || str.equals("")) 
			return str;
		
		Stack <Character> stack = new Stack <Character>();
		
		char [] ch = str.toCharArray();
		for ( int i = 0; i<str.length(); i++) 
	    if (ch[i] != ' ')
			stack.push(ch[i]);
		
			int k = 0;
			
			while (!stack.isEmpty()) {
				ch[k++]= stack.pop();
			}
			return String.copyValueOf(ch);
		}
	
	
	
	public static void main(String[] args) {
	String str = "Java for all";
	str = reverse(str);
	System.out.println("Reversed string: " + str);
	}
}
