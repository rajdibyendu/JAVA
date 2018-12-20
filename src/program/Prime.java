package program;

public class Prime {

	public static void main(String[] args) {
		int n=13, temp=0;
		for (int i=2; i<=n/2; i++){
			if(n%i==0){
				temp++;
				break;
			}
		}
		if(temp==0 && n>1)
			System.out.println(n+" is PRIME Number");
		else
			System.out.println(n+" is not PRIME Number");
	}
}

//A prime number is a whole number greater than 1 whose only factors are 1 and itself.
//The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. 
