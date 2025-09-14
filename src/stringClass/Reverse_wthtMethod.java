package stringClass;

public class Reverse_wthtMethod {
	
	public static void main(String[] args) {
		
		String str1 = "";
		String str = new String("javac");
		
		int n = str.length();
		
		for (int i = n - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		
		System.out.println(str1);
	}
}
