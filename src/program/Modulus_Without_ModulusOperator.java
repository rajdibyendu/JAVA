package program;

public class Modulus_Without_ModulusOperator {
	public static void main(String[] args) {
		int num=-74, den=-7, neg=0;
		if(num<0) {
			num=-num;
			neg++;
		}
		if(den<0) {
			den=-den;
			neg++;
		}
		if(den==0) {
			System.out.println("INFINITY");
		}
		if(num<den)
			System.out.println(num);
		else {
			while(num>=den) {
				num=num-den;
			}
			if(neg==1)
				System.out.println(-num);
			else
				System.out.println(num);
		}
	}
}

