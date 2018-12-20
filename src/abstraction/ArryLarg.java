package abstraction;

import java.io.PrintStream;

public class ArryLarg {
	public static void main(String[] args) {
		int[] arr = {25, 35, 27, 24, 7, 35, 8};
		int fmax=0;
		int smax=0;
		int tmax=0;
		for(int i=0; i<arr.length; i++) {
			if(fmax<arr[i]) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i]) {
				tmax=smax;
				smax=arr[i];
			}else if(tmax<arr[i]) {
				tmax=arr[i];
			}
			
		}
		System.out.println(fmax);
		System.out.println(smax);
		System.out.println(tmax);
		PrintStream ps=System.out;
		ps.println(tmax);
	}
}
