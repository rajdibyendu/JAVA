package methods;

public class Ex5_ReturnType {
	int m1() {
		System.out.println("m1 method");
		return 10;
	}
	public static void main(String[] args) {
		Ex5_ReturnType e1=new Ex5_ReturnType();
		int res=e1.m1();
		System.out.println(res);
	}
}

//methods having return type other than void, should have return statement at last of the 
//statement
//eg.
//int m1() {
//	System.out.println("m1 method");
//	return 10;		//return is last statement
//}

//not like below

//int m1() {
//	return 10;		//return is first statement
//	System.out.println("m1 method");
//}