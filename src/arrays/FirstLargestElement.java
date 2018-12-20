package arrays;

public class FirstLargestElement {
	public static void main(String[] args) {
		int [] arr= {12,2,5,87,3,7,25,13};
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
