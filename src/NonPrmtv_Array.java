
public class NonPrmtv_Array {
	public static void dispArray(int[] arg) {
		arg[0]=50;
		System.out.println("Inside th dispArray(), 1st arr becomes: "+arg[0]);
	}
	public static void main(String[] args) {
		int[] arr={10,20,30};
		System.out.println("Before calling dispArray(), 1st arr is: "+arr[0]);
		dispArray(arr);
		System.out.println("After calling dispArray(), 1st arr is: "+arr[0]);
	}
}
