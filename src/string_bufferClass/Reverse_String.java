package string_bufferClass;

public class Reverse_String {
	public static void main(String[] args) {
		String str = new String("java");				//create String
		System.out.println("String before reverse : "+str);
		StringBuffer buff=new StringBuffer(str);		//convert String into StringBuffer
		buff.reverse();									//reverse the StringBuffer
		String str1=buff.toString();					//convert StringBuffer into String
		System.out.println("String after revserse : "+str1);
		
	}
}
