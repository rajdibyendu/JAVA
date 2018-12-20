package constructor;

public class Ex4_Adv1 {
	public static void main(String[] args) {
		Sum s1=new Sum();//The whole Statement within constructor is executed during only
	}					//object creation
}

class Sum{
	Sum(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}

//we can write statements in constructor like in method, and these statements is
//executed at the time of object creation, no need to call like method