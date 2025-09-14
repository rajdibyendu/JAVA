package Pyramid;

public class Triangle_A_ABA_ABCBA {
	public static void main(String[] args) {
		int n=5,st=1,sp=n-1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			
			char ch='A';
			for(int k=1; k<=st; k++) {
				System.out.print(ch);
				if(k<=st/2)
					ch++;
				else
					ch--;
			}
			System.out.println();
			sp--;
			st=st+2;
		}
	}
}
