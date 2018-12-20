package methods;

class Pen{}
class Student{}
class Employee{}
public class Ex3_ObjPramsMthd {
	void m1(Pen p) {	//instance method
		System.out.println("m1 method");
	}
	static void m2(Student s, Employee emp) {	//static method
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		Ex3_ObjPramsMthd e1=new Ex3_ObjPramsMthd();	//instance mthd called by creating object
		Pen p1=new Pen();
		e1.m1(p1);	//e1.m1(new Pen());--> Recommend 
		
		Student s1=new Student();
		Employee emp1=new Employee();
		Ex3_ObjPramsMthd.m2(s1,emp1);	//static method called by using class name
	}
}

//For Object type, we have to create object and then pass that object during method calling