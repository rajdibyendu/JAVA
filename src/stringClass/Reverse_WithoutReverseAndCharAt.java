package stringClass;

import java.util.Arrays;

public class Reverse_WithoutReverseAndCharAt {
	
	public static void main(String[] args) {
		
		String str = "java";
		String str1 = "";
		
		char[] ch = str.toCharArray();
		
		for (int i = ch.length - 1; i >= 0; i--) {
			str1 = str1 + ch[i];
		}
		System.out.println(str1);
	}
}
