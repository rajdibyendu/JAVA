package arrays;

public class Ex3_Solution {
	public static void main(String[] args) {
		Student1[] srr=new Student1[5];
		srr[0]=new Student1(111,"aaa");
		srr[2]=new Student1(222,"bbb");
		srr[4]=new Student1(333,"ccc");
		
		for(Object o:srr) {
			if(o instanceof Student1) {
				Student1 s=(Student1)o;
				System.out.println(s.id+"---"+s.name);
			}
			else
				System.out.println(o);
		}
	}
}
