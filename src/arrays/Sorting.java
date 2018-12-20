package arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr= {12,64,65,1,36};
		System.out.println("Before Sorting");
		for(int a:arr )
			System.out.println(a);
		
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for(int a:arr )
			System.out.println(a);
	}
}
