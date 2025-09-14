package stringClass;

public class method_StringClass {
	public static void main(String[] args) {
		String str = "JavaDeveloper";
		String str1 = "";
		String str2 = null;

		System.out.println("length of string - "+str.length());// length of string
		System.out.println("character at index - "+str.charAt(3));// character at index
		System.out.println(str.indexOf("v"));// index of character 1st occurrence
		System.out.println(str.indexOf("e", 6));// index of character 2nd occurrence
		System.out.println(str.contains("ava"));// sub-string present or not
		System.out.println(str.substring(5));// sub-string from index to last
		System.out.println(str.substring(5, 9));// sub-string from index, to index(-1)
		System.out.println(str.toUpperCase());// UPPERCASE
		System.out.println(str.toLowerCase());// lowercase
		System.out.println(str.isEmpty());// is string empty?false
		System.out.println(str1.isEmpty());// is string empty?true
		// System.out.println(str2.isEmpty());//is string empty?NullPointerException
		System.out.println(str.replace('a', 'u'));// replace character
		System.out.println(str.replace("ava", "i"));// replace string
		System.out.println(str.lastIndexOf("e")); //Last index of a letter/word
	}
}
