package string_bufferClass;

public class Palindrome_String {
	public static void main(String[] args) {
		String str ="Malayalam";
		StringBuffer buff=new StringBuffer(str);
		buff.reverse();
		String str1=buff.toString();
		if(str.equalsIgnoreCase(str1))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}
