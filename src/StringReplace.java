
public class StringReplace {
	    public static void main(String[] args)
	    {   
	       String str = "my name is khan";
	       String str2 = StringReplace.replaces(str,"name","naam");
	       System.out.println(str2);
	   }

	    static String replaces(String s, String target, String replacement) {
	        StringBuilder sb = new StringBuilder(s);
	        for (int i = 0; (i = sb.indexOf(target, i)) != -1; i += replacement.length()) {
	            sb.replace(i, i + target.length(), replacement);
	        }
	        return sb.toString();
	    }
	    
	    public String replace2(char oldChar, char newChar) { 
	    	char[] value = new char[10];
	        if (oldChar != newChar) {  
	            int len = value.length;  
	            int i = -1;  
	            char[] val = value; /* avoid getfield opcode */  
	   
	            while (++i < len) {  
	                if (val[i] == oldChar) {  
	                    break;  
	                }  
	            }  
	            if (i < len) {  
	                char buf[] = new char[len];  
	                for (int j = 0; j < i; j++) {  
	                    buf[j] = val[j];  
	                }  
	                while (i < len) {  
	                    char c = val[i];  
	                    buf[i] = (c == oldChar) ? newChar : c;  
	                    i++;  
	                }  
	                return new String(buf, true);  
	            }  
	        }  
	        return this;  
	    }  
}
