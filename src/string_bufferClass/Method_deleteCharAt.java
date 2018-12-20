package string_bufferClass;

public class Method_deleteCharAt {
	public static void main(String[] args) {
			StringBuffer buff = new StringBuffer("java");
			System.out.println("before delete : "+buff);
			System.out.println("after delete : "+buff.deleteCharAt(2));
		}
	}
