package abstraction;

public class Perf {
	public static void main(String[] args) {
		int n=3;
		int total=1;
		System.out.println(2);
		while(total<10) {
			int count=0;
			for(int j=2; j<=n/2; j++) {
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(n);
				total++;
			}
			n++;
		}
	}
}
