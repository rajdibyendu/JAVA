package string_bufferClass;

public class Method_delete {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("javadeveloper");
		System.out.println("before delete : "+buff);
		System.out.println("after delete : "+buff.delete(2,8));
	}
}
