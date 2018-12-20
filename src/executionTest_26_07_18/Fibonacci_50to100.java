package executionTest_26_07_18;

public class Fibonacci_50to100 {

	public static void main(String[] args) {
		long num=100,p=0, q=1, res=0;
		for(int i=3; i<=num; i++)
		{
			res=p+q;
			if(i>=50 && i<=100)
			System.out.println(res);
			p=q;
			q=res;
		}
	}

}
