package polymorphism;

//Example of compile time polymorphism
public class FacebookSearchUser {
	void search(String name) {
		System.out.println("List of "+name);
	}
	void search(long mob) {
		System.out.println("List of "+mob);
	}
	void search(String mail, String site) {
		System.out.println("List of "+mail+"@"+site);
	}
	
	public static void main(String[] args) {
		FacebookSearchUser user=new FacebookSearchUser();
		user.search(9807536254l);//compiler will decide, long arg is executed
		user.search("ram");//compiler will decide String arg is executed at comppile time
		user.search("rajdibyendu", "gmail.com");
	}
}
