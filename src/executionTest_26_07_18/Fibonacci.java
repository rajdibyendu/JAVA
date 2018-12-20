package executionTest_26_07_18;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10,p=0, q=1, res=0;
		System.out.println(p);
		System.out.println(q);
		for(int i=3; i<=num; i++){
			res=p+q;
			p=q;
			q=res;
			System.out.println(res);
		}
	}

}
