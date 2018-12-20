package program;

public class Split_Number {
	public static void main(String[] args) {
		int num=1234, temp=num, count=1, mul=0;
		while(num>0) {
			num=num/10;
			count=count*10;
		}
		
		while(count>1) {
			count=count/10;
			int digit=temp/count;
			System.out.print(digit+" ");
			temp=temp%count;
		}
		
	}
}
