package arrays;

public class Ex5_Sum_Large_Small {
	public static void main(String[] args) {
		int sum=0;
		int[] arr= {10, 20, 30, 4, 50};
		for(int i:arr) {
			sum=sum+i;
		}
		System.out.println("SUM : "+sum);
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("MAX : "+max);
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("MIN : "+min);
	}
}
