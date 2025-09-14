package Pyramid;

public class Diamond_1_212_32123 {
	public static void main(String[] args) {
		int n=7,sp=n/2,st=1,num=0;
		for(int i=1; i<=n; i++) {
			if(i<=n/2)
				num=i;
			else
				num=n+1-i;
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++) {
				System.out.print(num);
				if(k<=st/2)
					num--;
				else
					num++;
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
