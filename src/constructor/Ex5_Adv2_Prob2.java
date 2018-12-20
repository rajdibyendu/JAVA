package constructor;

public class Ex5_Adv2_Prob2 {
	public static void main(String[] args) {
		Student1 s1=new Student1();		//user defined constructor executed(non arg) doesn't print 
		s1.disp();						//default values using user defined constructor.
		
		Student1 s2=new Student1();
		s2.disp();						//PROBLEM is It always print same id and name
	}									//SOLUTION is Execute user defined Argumented Constructor
}

class Student1{
	int id;			//0
	String name;	//null
	
	Student1(){		//ADVANTAGE is It initialize the non static variables, otherwise it will give 
		id=123;		//default values
		name="raj";
	}
	
	void disp() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
	
}