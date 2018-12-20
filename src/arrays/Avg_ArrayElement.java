package arrays;

public class Avg_ArrayElement {
	public static void main(String[] args) {
		int[] arr= {1,2,1};
		double sum=0;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Average of Array is:");
		System.out.println(sum/arr.length);
	}
}
