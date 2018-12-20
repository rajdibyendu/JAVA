package abstraction;

public class DvdWthtOpertr {
	public static void main(String[] args) {
		int n=-14, d=-5, neg=0, count=0;
		if(d==0) {
			System.out.println("INFINITY");
		}
		if(n<0) {
			n=-n;
			neg++;
		}
		if(d<0) {
			d=-d;
			neg++;
		}
		if(n<d) {
			System.out.println(0);
		}
		while(n>=d) {
			n=n-d;
			count++;
		}
		if(neg%2==1) {
			System.out.println(-count);
		}
		else
			System.out.println(count);
	}
}
