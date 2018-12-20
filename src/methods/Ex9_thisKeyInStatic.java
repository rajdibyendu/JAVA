package methods;

public class Ex9_thisKeyInStatic {
	//instance variables
		int a=1000;
		int b=2000;
		static void sum(int a, int b) {//local variables
			System.out.println(a+b);//local output
			System.out.println(this.a+this.b);//instance output
		}
		public static void main(String[] args) {
			Ex9_thisKeyInStatic e1=new Ex9_thisKeyInStatic();
			e1.sum(10,20);
		}
}

//this keyword is not used in Static method
//ERROR: non static variable this can not be referenced from static context
