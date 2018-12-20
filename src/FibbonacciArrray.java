
public class FibbonacciArrray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]=0;
		arr[1]=1;
		int temp=0;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=0; i<=arr.length; i++) {
			temp=arr[i]+arr[i+1];
			System.out.println(temp);
			arr[i+2]=arr[i+1];
			arr[i+1]=temp;
			System.out.println(temp);
		}
	}
}
