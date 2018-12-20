package arrays;

public class Swap2array {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {10,20,30,40,50};
		System.out.println("Before Swapping");
		System.out.println("1st Array is ");
		for(int i=0; i<=4; i++)
			System.out.println(arr1[i]);
		System.out.println("2nd Array is ");
		for(int i=0; i<=4; i++)
			System.out.println(arr2[i]);
		
		System.out.println("After Swapping");
		int[] arr3=arr1;
		arr1=arr2;
		arr2=arr3;
		System.out.println("1st Array is ");
		for(int i=0; i<=4; i++)
			System.out.println(arr1[i]);
		System.out.println("2nd Array is ");
		for(int i=0; i<=4; i++)
			System.out.println(arr2[i]);
	}
}
