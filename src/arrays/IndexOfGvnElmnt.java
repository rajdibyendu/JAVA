package arrays;

public class IndexOfGvnElmnt {
	public static void main(String[] args) {
		int[] arr= {1,32,64,55,9,85,9,20};
		int num=9,res=0;
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.println(i);
				res++;
			}
		}
		if(res==0)
			System.out.println("Number is not present");
	}
}
