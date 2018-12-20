package abstraction;

public class SortEmployee implements Comparable<SortEmployee>{
	int id;
	String name;
	
	public SortEmployee(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public String toString() {
		return "SortEmployee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(SortEmployee ob) {
		return this.name.compareTo(ob.name);
	}
	
	
}
