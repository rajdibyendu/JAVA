package objectClass;

class Worker{
	int id;
	String name;
	Worker(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int hashCode() {
		return id;
	}
}

class Marker{
}

public class HashCode {
	public static void main(String[] args) {
		Marker p1=new Marker();
		Marker p2=new Marker();
		System.out.println(p1.hashCode());		//give address (not override)
		System.out.println(p2.hashCode());		//give address (not override)
		
		System.out.println("---------");
		
		Worker emp1=new Worker(12, "rama");
		Worker emp2=new Worker(15, "shyama");
		System.out.println(emp1.hashCode());		//give state (override)
		System.out.println(emp2.hashCode());		//give state (override)
	}
}