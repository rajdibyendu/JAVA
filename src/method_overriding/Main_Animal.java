package method_overriding;

	 class Animal {
	 	public void makeNoise()
	 	{
	 		System.out.println("Some Noise");
	 	}
	 }
	 class Cat extends Animal
	 {
	 	public void makeNoise()
	 	{
	 		System.out.println("meoww meoww");
	 	}
	 }
	 class Dog extends Animal
	 {
	 	public void makeNoise()
	 	{
	 		System.out.println("bhoww bhoww");
	 	}
	 }
	 public class Main_Animal {
		 public static void main(String[] args) {
			Cat kitty=new Cat();
			 kitty.makeNoise();
			 Dog tipu=new Dog();
			 tipu.makeNoise();
			}
	 }
