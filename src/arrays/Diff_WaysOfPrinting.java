package arrays;

import java.util.Arrays;

public class Diff_WaysOfPrinting {
	public static void main(String[] args) {
		int[] arr= {12,64,65,1,36};
		int len=arr.length;
		System.out.println("length of Array is "+len);
		System.out.println("Printing of Array 1st Method");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("Printing of Array 2nd Method");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Printing of Array 3rd Method");
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.out.println("Printing of Array 4th Method");
		String str=Arrays.toString(arr);
		System.out.println(str);
	}

}
