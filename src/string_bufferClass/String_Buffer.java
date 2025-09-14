package string_bufferClass;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("java");
		System.out.println(buff);
		StringBuffer buff1 = new StringBuffer("java");
		System.out.println(buff1);
		System.out.println(buff == buff1);// compares address
		System.out.println(buff.equals(buff1));// compare address, since StringBuffer not override
	}
}
