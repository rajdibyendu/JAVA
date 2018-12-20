package encapsulation;

public class Sample_Encpsltn {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getId());
		s.setId(34);
		System.out.println(s.getId());
	}
}
class Sample{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


