package method_chaining;

class FirefoxDriver{
	WebElement findElement(){
		System.out.println("find the element");
		return new WebElement();
	}
}
class WebElement{
	void sendKeys() {
		System.out.println("input data");
	}
	void click() {
		System.out.println("click on button");
	}
}
public class Ex3 {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.findElement().sendKeys();
	}
}
