package objectClass;

class Student{
	int id;
	String name;
	Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {	//toString() is overrided
		return name;
	}
}


class Pen{	//toString() is not overrided
}


public class toString {
	public static void main(String[] args) {
		Student st1=new Student(12,"rama");
		System.out.println(st1); //implicitly (override==states)
		String str=st1.toString();//explicitly (override==states)
		System.out.println(str);
		
		Pen p1=new Pen();
		System.out.println(p1); //implicitly (not override==address)
		String str2=p1.toString();//explicitly (not override==address)
		System.out.println(str2);
	}
}
