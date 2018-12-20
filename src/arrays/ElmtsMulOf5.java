package arrays;

public class ElmtsMulOf5 {
	public static void main(String[] args) {
		int[] arr= {1,32,64,55,85,9,20};
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
