package arrays;

public class Merged_TwoArray {
	public static void main(String[] args) {
		int[] arr1= {12,64,65,1,36};
		int[] arr2= {234, 45, 64};
		System.out.println("Before Merge");
		System.out.println("Array 1 is......");
		for(int a:arr1)
			System.out.println(a);
		System.out.println("Array 2 is......");
		for(int a:arr2)
			System.out.println(a);
		
		System.out.println("After Merge");
		int[] merge= new int[arr1.length+arr2.length];
		for(int i=0; i<=arr1.length-1; i++)
			merge[i]=arr1[i];
		for(int i=0; i<=arr2.length-1; i++)
			merge[arr1.length+i]=arr2[i];
		for(int a:merge)
			System.out.println(a);
	}
}
