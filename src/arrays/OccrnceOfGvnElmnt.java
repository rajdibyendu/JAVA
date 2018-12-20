package arrays;

public class OccrnceOfGvnElmnt {
	public static void main(String[] args) {
		int[] arr= {1,32,64,55,9,85,9,20};
		int num=90,count=0;
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				count++;
			}
		}
		if(count>0)
			System.out.println(count);
		else
			System.out.println("Number is not present");
	}
}
