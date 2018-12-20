package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {23, 4, 7, 2, 76, 65};
		System.out.println("Before sorting "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting "+Arrays.toString(arr));
		
	}
}
