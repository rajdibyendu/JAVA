package local_variables;

public class Ex2_Scope {
	void m1() {
		int a=10;	//local variables
		System.out.println(a);	//possible
	}
	void m2() {
		System.out.println(a);	//not possible
	}
}

//The scope of local variables is only within the body where it is declared