package constructor_chaining;

public class Ex3 {
	Ex3(){
		System.out.println("0 arg constructor");
		this(10);
	}
	Ex3(int a){
		System.out.println("1 arg constructor");
		this(10,20);
	}
	Ex3(int a, int b){
		System.out.println("2 arg constructor");
	}
	
	public static void main(String[] args) {
		Ex3 e1=new Ex3();					
	}
}


//COMPILE TIME ERROR
//Constructor call must be the first statement in a constructor