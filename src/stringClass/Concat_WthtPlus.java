package stringClass;

public class Concat_WthtPlus {
	public static void main(String[] args) {
		String  str2="";
		String str=new String("java");
		String str1=new String("mava");
		int l1=str.length();
		int l2=str1.length();
		for (int i=0; i<l1; i++) 
			str2=str2+ str.charAt(i);
		for (int j=0; j<l2; j++)
			str2=str2+str1.charAt(j);
			System.out.println(str2);
	}
}
