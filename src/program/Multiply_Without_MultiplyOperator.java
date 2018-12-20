package program;

public class Multiply_Without_MultiplyOperator {
	public static void main(String[] args) {
		int a=-5, b=-4, neg=0, count=0;
		if(a<0) {
			a=-a;
			neg++;
		}
		if(b<0) {
			b=-b;
			neg++;
		}
		if(a==0 || b==0) {
			System.out.println(0);
		}
		else {
			for(int i=1; i<=b; i++){
				count=count+a;
			}
		}
		if(neg==1)
			System.out.println(-count);
		else
			System.out.println(count);
	}
}

