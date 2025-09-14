package polymorphism;


//Example of runtime polymorphism
class Rbi{
	int interest() {
		return 6;
	}
}

class Pnb extends Rbi{
	int interest() {
		return 7;
	}
}

class Axis extends Rbi{
	int interest() {
		return 8;
	}
}
public class Sample {
	public static void main(String[] args) {
		Axis axisBank=new Axis();//compiler will check,AXIS BANK has interest mtd or not?
		System.out.println(axisBank.interest());
		
		//compiler will only check,RBI has interest mtd or not?
		Rbi rbi=new Pnb();
		System.out.println(rbi.interest());
	
		
	}
}
