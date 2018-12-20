package program;
public class DecimalToBinary {
	public static void main(String[] args){
		int dec=5, i=0;
		int[] bin= new int[8];
		while(dec>0){
			bin[i]=dec%2;
			i++;
			dec=dec/2;
		}
		  for (int j=bin.length-1; j>=0; j--) {
			  System.out.print(bin[j]);
		  }
	}
}
