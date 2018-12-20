package test;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		String str="abcdef";
//		char[] ch=str.toCharArray();
//		char temp=ch[0];
//		ch[0]=ch[ch.length-1];
//		ch[ch.length-1]=temp;
		
//		for(char c:ch)
//			System.out.println(c);
//		
//		System.out.println(Arrays.toString(ch));
		
		char start=str.charAt(0);
		char end=str.charAt(str.length()-1);
		String sub=str.substring(1, str.length()-1);
		
		System.out.println(end+sub+start);
	}
}
