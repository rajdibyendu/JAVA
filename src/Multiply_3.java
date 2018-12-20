
public class Multiply_3 {
		public static void triple(int a) {
			a=2*a;
			System.out.println("Inside the triple(), num becomes: "+a);
		}
		public static void main(String[] args) {
			int num=10;
			System.out.println("Before calling triple(), num is: "+num);
			triple(num);
			System.out.println("After calling triple(), num is: "+num);
		}
}
