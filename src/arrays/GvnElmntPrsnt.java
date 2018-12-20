package arrays;

import java.util.Arrays;

public class GvnElmntPrsnt {
	public static void main(String[] args) {
		int[] arr= {1,32,64,55,85,9,20};
		int num=5,res=0;
		System.out.println(Arrays.toString(arr));
		for (int i=0; i<arr.length; i++) {
			if (num==arr[i]) {
				res++;
				break;
			}
		}
		if(res>0)
			System.out.println(num+" Number is present");
		else
			System.out.println(num+" Number is not present");
	}
}