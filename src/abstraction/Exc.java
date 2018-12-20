package abstraction;

public class Exc {
	public static void main(String[] args) {
		Voting v  = new Voting();
		try{
			v.vote(13);
		}
		catch(IllegalAgeException i) {
			i.print();
		}
	}
}
class IllegalAgeException extends RuntimeException{
	void print() {
		System.out.println("Under Age");
	}
}
class Voting {
	void vote(int age) throws IllegalAgeException{
		if (age>=18) {
			System.out.println("Eligible");
		}
		else
			throw new IllegalAgeException();
	}
}

