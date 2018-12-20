package arrays;

public class ThirdLargestElement {
	public static void main(String[] args) {
		int [] arr= {12,2,5,87,3,7,25,13};
		int fmax=0, smax=0, tmax=0;
		for(int i=0; i<arr.length; i++) {
			if (fmax<arr[i]) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i]) {
				tmax=smax;
				smax=arr[i];
			}
			else if(tmax<arr[i]) {
				tmax=arr[i];
			}
		}
		System.out.println(tmax);
	}
}
