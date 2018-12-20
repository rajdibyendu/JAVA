package stringClass;

public class string {
	public static void main(String[] args) {
	String str1=new String("java");
	String str2=new String("java");
	String str3="java";
	String str4="java";
	
	//override toString==states
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println("-------------");
	
	//override hashCode==hashCode based on states
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(str3.hashCode());
	System.out.println(str4.hashCode());
	System.out.println("-------------");
	
	//compare address since using == operator
	System.out.println(str1==str2);		//address different
	System.out.println(str2==str3);
	System.out.println(str3==str4);		//address same
	
	//override equals==compare states
	System.out.println(str1.equals(str2));
	System.out.println(str2.equals(str3));
	System.out.println(str3.equals(str4));
}
}
