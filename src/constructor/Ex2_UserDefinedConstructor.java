package constructor;

public class Ex2_UserDefinedConstructor {
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		s1.disp();
		Sample2 s2=new Sample2(10);
		s1.disp();						//same disp() is called from any constructor
	}
}

class Sample2{
	void disp() {
		System.out.println("Disp is running...");
	}
	
	//user defined Constructor
	Sample2(){
		System.out.println("No arg constrtuctor");
	}
	Sample2(int arg){
		System.out.println("One arg constrtuctor");
	}
}

//this is the example of constructor overloading
