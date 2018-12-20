package local_variables;

public class Ex3_Memory {
	void m1()	//memory allocated when method starts
	{	int a=10;
		System.out.println(a);	
	}	//memory released when method is completed
}

//memory is allocated when method starts and memory is released when method is completed
//Local variables are stored in STACK AREA.

//STACK AREA
//----------
//It is used for execution of Methods, Constructors or Blocks. Since, Local variables are
//declared inside the Methods, Constructors, Blocks. So, Local variables are stored in
//Static area.