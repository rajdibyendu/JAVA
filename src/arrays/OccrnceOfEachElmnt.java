package arrays;

public class OccrnceOfEachElmnt {
	public static void main(String[] args) {
		int[] arr= {1,32,64,55,9,85,9,20};
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println("Occurence of "+arr[i]+"="+count);
		}
	}
}
