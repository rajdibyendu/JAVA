package test;
public class ReverseInteger{

    public static void main(String args[]) {
        int input = 0b1010;
        while(input>0) {
        	int rem=input%10;
        	input=input/10;
        	System.out.print(rem);
        }
        
    }
}


