package abstraction;

public class PrintWthtLoop {
	public static void main(String[] args) {
		print(10);
	}
	static void print(int num) {
		if(num>1) {
			print(num-1);
		}
		System.out.println(num);
	}
}
