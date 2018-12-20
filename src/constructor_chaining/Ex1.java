package constructor_chaining;

public class Ex1 {
	Ex1(){
		System.out.println("0 arg constructor");
	}
	Ex1(int a){
		System.out.println("1 arg constructor");
	}
	Ex1(int a, int b){
		System.out.println("2 arg constructor");
	}
	
	public static void main(String[] args) {
		Ex1 e1=new Ex1();					
		Ex1 e2=new Ex1(10);
		Ex1 e3=new Ex1(10, 20);
	}
}

//To call 3 constructor, we have to create 3 objects 
//Ex1 e1=new Ex1();					
//Ex1 e2=new Ex1(10);
//Ex1 e3=new Ex1(10, 20);
//Which is not recommend