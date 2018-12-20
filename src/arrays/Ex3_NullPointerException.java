package arrays;

class Student1{
	int id;
	String name;
	Student1(int id, String name){
		this.id=id;
		this.name=name;
	}
}
public class Ex3_NullPointerException {
	public static void main(String[] args) {
		Student1[] srr=new Student1[5];
		srr[0]=new Student1(111,"aaa");
		srr[2]=new Student1(222,"bbb");
		srr[4]=new Student1(333,"ccc");
		
		for(Student1 s:srr) {
			System.out.println(s.id);
			System.out.println(s.name);
		}
	}
}
