package arrays;

public class Ex4_IndexOfNull {
	public static void main(String[] args) {
		Student1[] srr=new Student1[5];
		srr[0]=new Student1(111,"aaa");
		srr[2]=new Student1(222,"bbb");
		srr[4]=new Student1(333,"ccc");
		
		for(int i=0; i<srr.length; i++) {
			if(srr[i]==null)
				System.out.println(i);
		}
	}
}
