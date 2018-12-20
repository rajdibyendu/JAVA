package indiabix;

public class TestDogs 
{
    public static void main(String [] args) 
    {
        Dog [][] theDogs = new Dog[3][];
        System.out.println(theDogs[2][0].toString());
    }
}
class Dog { }



//The second dimension of the array referenced by theDogs has not been initialized.
//Attempting to access an uninitialized object element
//(System.out.println(theDogs[2][0].toString());) raises a NullPointerException.