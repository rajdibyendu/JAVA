package program;

public class PrintNumber_Without_Loop {
	public static void main(String[] args) {
		new PrintNumber_Without_Loop().number(100);
	}
	void number(int a) {
		if(a>0) {
			number(a-1);
			System.out.println(a);
		}
	}
}

//or

//public class Print_1to10_WithoutLoop {
//	int num;
//	static int count=1;
//	public static void main(String[] args) {
//		print(100);
//	}
//	static void print(int num) {
//		System.out.println(count);
//		count++;
//		if(count<=num)
//			print(num);
//	}
//}


