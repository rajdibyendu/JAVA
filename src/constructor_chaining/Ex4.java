package constructor_chaining;

public class Ex4 {
	Ex4(){
		this(10);
		this(10,20);		//second statement
		System.out.println("0 arg constructor");
	}
	Ex4(int a){
		System.out.println("1 arg constructor");
	}
	Ex4(int a, int b){
		System.out.println("2 arg constructor");
	}
	
	public static void main(String[] args) {
		Ex4 e1=new Ex4();					
	}
}

//COMPILE TIME ERROR
//Constructor call must be the first statement in a constructor

//one constructor can call only one constructor
