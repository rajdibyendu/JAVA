package objectClass;

class Employee{
	int id;
	String name;
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		return id==emp.id;
	}
}

class Pencil{
}

public class Equals {
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		Pencil p2=new Pencil();
		System.out.println(p1==p2);		//compare address
		System.out.println(p1.equals(p2));		//compare address
		
		System.out.println("---------");
		
		Employee emp1=new Employee(12, "rama");
		Employee emp2=new Employee(12, "shyama");
		System.out.println(emp1==emp2);		//compare address
		System.out.println(emp1.equals(emp2));		//compare state
	}
}
