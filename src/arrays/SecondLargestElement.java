package arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int [] arr= {12,2,5,87,3,7,25,13};
		int fmax=0, smax=0;
		for(int i=0; i<arr.length; i++) {
			if (fmax<arr[i]) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i]) {
				smax=arr[i];
			}
		}
		System.out.println(smax);
	}
}
