package string_bufferClass;

public class Method_append {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("java");
		System.out.println("before append : "+buff);
		System.out.println("after append : "+buff.append('c'));
	}
}
