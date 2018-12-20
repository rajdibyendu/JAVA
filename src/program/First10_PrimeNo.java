package program;

public class First10_PrimeNo {
	public static void main(String[] args) {
		int n=1, total=1;
		while(total<=10) {
			int temp=0;
			for (int i=2; i<=n/2; i++){
				if(n%i==0){
					temp++;
				}
			}
		if(temp==0 && n>1) {
			System.out.println(n);
			total++;
		}
		n++;
		}
	}
}
