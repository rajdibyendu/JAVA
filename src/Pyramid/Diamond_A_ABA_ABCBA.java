package Pyramid;

public class Diamond_A_ABA_ABCBA {
	public static void main(String[] args) {
		int n=7,sp=n/2+1,st=1;
		for(int i=1; i<=n; i++) {
			char ch='A';
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++) {
				System.out.print(ch);
				if(k<=st/2)
					ch++;
				else
					ch--;
			}
			System.out.println();
			if(i<=n/2) {
				sp--;
				st=st+2;
			}
			else {
				
				sp++;
				st=st-2;
			}
		}
	}
}
