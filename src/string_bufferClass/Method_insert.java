package string_bufferClass;

public class Method_insert {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("java");
		System.out.println("before insert : "+buff);
		System.out.println("after insert : "+buff.insert(3,'r'));
	}
}
