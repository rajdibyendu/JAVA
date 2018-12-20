package arrays;

public class Ex1 {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4};
		
		//1. printing
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		//2. printing
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		//3. printing
		for(int a:arr)
			System.out.println(a);
	}
}
