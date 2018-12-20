package indiabix;

public class Test 
{
    public static void main(String [] args) 
    {
        signed int x = 10;
        for (int y=0; y<5; y++, x--)
            System.out.print(x + ", ");
    }
}


//The word "signed" is not a valid modifier keyword in the Java language. 
//All number primitives in Java are signed. Hence the Compilation will fails.