package stringClass;

public class NextToLast {
	public static void main(String[] args) {
		String str = "abde fg";
		System.out.println(str.substring(str.lastIndexOf(' ')+1,str.length()));
	}
}
