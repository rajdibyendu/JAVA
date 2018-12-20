package program;

public class PrimeNo_1to100 {
	public static void main(String[] args) {
		for(int n=1; n<=100; n++) {
			int temp=0;
			for (int i=2; i<=n/2; i++){
				if(n%i==0){
					temp++;
				}
			}
		if(temp==0 && n>1)
			System.out.println(n);
		}
	}
}
