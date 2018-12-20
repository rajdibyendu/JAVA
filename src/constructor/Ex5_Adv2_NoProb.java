package constructor;

public class Ex5_Adv2_NoProb {
	public static void main(String[] args) {
		Student2 s1=new Student2(123, "raj");
		s1.disp();
		
		Student2 s2=new Student2(456, "Dibyendu");
		s2.disp();
	}
}

class Student2{
	int id;			//0			//non static variable
	String name;	//null
	
	Student2(int id, String name){//local variable  
		
		//conversion of local variable to non static variable
		this.id=id;				//ADVANTAGE is It initialize the non static variables,
		this.name=name;			//otherwise it will give default values
	}
	
	void disp() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
	
}
//In disp(), instance variable is printed, but when we create object using parameter,
//the constructor's argument is called, which is Local variable. So, Conversion of Local
//variable to instance variable is required