package Pyramid;

public class Rev_Pyramid_CDEDC_DED_E {
	public static void main(String[] args) {
		int n=5, st=2*n-1, sp=0;
		
		for(int i=1; i<=n; i++) {
			char ch='A';;
			for(int j=1; j<=sp; j++) {
				
				System.out.print(" ");
				ch++;
			}
			for(int k=1; k<=st; k++) {
				System.out.print(ch);
				
				if(k<=st/2)
					ch++;
				else
					ch--;
			}
			st=st-2;
			sp++;
			System.out.println();
		
	}
}
}