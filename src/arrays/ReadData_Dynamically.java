package arrays;

import java.util.Scanner;

public class ReadData_Dynamically {
//	public static void main(String[] args) {
//		System.out.println("Enter Size of Elements");
//		Scanner scan=new Scanner(System.in);
//		int[] arr=new int[scan.nextInt()];
//		for(int i:arr)
//			System.out.println(arr[i]);
//		System.out.println("Enter Elements");
//		for(int i:arr)
//		arr[i]=scan.nextInt();
//		System.out.println("Arrays are ");
//		for(int i:arr)
//			System.out.println(arr[i]);
//	}
	
	public static void main(String[] args) {
		System.out.println("Enter Size of Elements");
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[scan.nextInt()];
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("Enter Elements");
		for(int i=0; i<arr.length; i++)
			arr[i]=scan.nextInt();
		System.out.println("Arrays are ");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
