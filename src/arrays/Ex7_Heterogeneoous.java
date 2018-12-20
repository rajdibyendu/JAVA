package arrays;

class Employee1{
	int id;
	String name;
	Employee1(int id, String name){
		this.id=id;
		this.name=name;
	}
}

public class Ex7_Heterogeneoous {
	public static void main(String[] args) {
		Object[] o=new Object[3];
		
		o[0]=new Student1(111, "aaa");
		o[1]=new Employee1(222, "bbb");
		o[2]=new Integer(10);
		
		for(Object oo:o) {
			if(oo instanceof Student1) {
				Student1 s=(Student1)oo;
				System.out.println(s.id+"---"+s.name);
			}
			if(oo instanceof Employee1) {
				Employee1 e=(Employee1)oo;
				System.out.println(e.id+"---"+e.name);
			}
			if(oo instanceof Integer) {
				System.out.println(oo);
			}
		}
		
		
	}
}
