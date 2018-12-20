package constructor;

public class Ex3_CompileTimeError {
	public static void main(String[] args) {
		Sample3 s1=new Sample3();	//Here DEFAULT CONSTRUCTOR gives compilation error,
		s1.disp();					// because whenever user defined constructor is 
		Sample3 s2=new Sample3(10); //present, there is no existence of DEFAULT CONSTRUCTOR.
		s1.disp();						
	}
}

class Sample3{
	void disp() {
		System.out.println("Disp is running...");
	}
	
	//user defined Constructor
	Sample3(int arg){
		System.out.println("One arg constrtuctor");
	}
}