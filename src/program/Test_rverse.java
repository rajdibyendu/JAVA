package program;

public class Test_rverse {
	public static void main(String[] args) {
		int num=1000;
		reverse(num);
				
	}
	public static void reverse(int arg) {
			if(arg<10) {
				System.out.println(arg);;
				return;
			}
			else {
				System.out.print(arg%10);
				reverse(arg/10);
			}
	}
}
