package constructor_chaining;

public class Ex2 {
	Ex2(){
		this(10);
		System.out.println("0 arg constructor");
	}
	Ex2(int a){
		this(10,20);
		System.out.println("1 arg constructor");
	}
	Ex2(int a, int b){
		System.out.println("2 arg constructor");
	}
	
	public static void main(String[] args) {
		Ex2 e1=new Ex2();					
	}
}

//To call another constructor use "this" keyword