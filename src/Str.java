
public class Str {
	public static void main(String[] args) {
		String str = "My name is Dibyendu Raj, My name is Dibyendu2 Raj2";
		String str2 = str.replace("My name is ", "").replace(",", "");
		System.out.println(str2);
		String[] arr = str2.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0)
				System.out.print("FIRST NAME : "+arr[i]);
			else
				System.out.println("\tLAST NAME : "+arr[i]);
		}
	}
}
