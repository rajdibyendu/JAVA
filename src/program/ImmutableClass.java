package program;

public class ImmutableClass {
	public static void main(String[] args) {
		Demo d=new Demo("raj");
		System.out.println(d.concat("Dibyendu"));
		System.out.println(d);
	}
}

final class Demo{
	final String str;
	Demo(String str){
		this.str=str;
	}
	String concat(String str1){
		return str+str1;
	}
	public String toString() {
		return str;
	}
	
}

