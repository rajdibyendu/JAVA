
public class String_Concat {
	public static void concat(String arg) {
		arg=arg+"ABC";
		System.out.println("Inside the concat(), str becomes: "+arg);
	}
	public static void main(String[] args) {
		String str="java";
		System.out.println("Before calling concat(), str is: "+str);
		concat(str);
		System.out.println("After calling concat(), str is: "+str);
	}
}
