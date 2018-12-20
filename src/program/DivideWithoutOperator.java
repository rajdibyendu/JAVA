package program;

public class DivideWithoutOperator {
	public static void main(String[] args) {
		int num=35, den=5, count=0, neg=0;
		if(den==0) {
			System.out.println("INFINITY");
		}
		if(num<0) {
			num=-num;
			neg++;
		}
		if(den<0) {
			den=-den;
			neg++;
		}
		if(num>=den) {
			while(num>=den) {
				num=num-den;				
				count++;
			}
			if(neg==1)
				System.out.println(-count);
			else
				System.out.println(count);
		}
		else
			System.out.println(0);
	}
}

