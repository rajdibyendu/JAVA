package constructor;

public class Ex5_Adv2_Prob1 {
	public static void main(String[] args) {
		Student s1=new Student();	//default constructor executed
		s1.disp();		//PROBLEM is Default Values are printed even Object is created 
	}					//SOLUTION is Execute User Defined Constructor
}

class Student{
	int id;			//0
	String name;	//null
	
	void disp() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
